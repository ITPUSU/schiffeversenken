import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;

import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GameServer extends WebSocketServer {

    private Set<WebSocket> connections = Collections.newSetFromMap(new ConcurrentHashMap<>());

    public GameServer(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        connections.add(conn);
        System.out.println("New connection: " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        connections.remove(conn);
        System.out.println("Closed connection: " + conn.getRemoteSocketAddress() + " with exit code " + code + " additional info: " + reason);
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        System.out.println("Received message from " + conn.getRemoteSocketAddress() + ": " + message);
        // Hier kannst du die empfangenen Nachrichten verarbeiten und entsprechende Spiel-Logik anwenden
        // Zum Beispiel, um eine Nachricht an alle Clients zu senden:
        broadcast(message);
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        System.err.println("An error occurred on connection " + conn.getRemoteSocketAddress()  + ":" + ex);
    }

    @Override
    public void onStart() {
        System.out.println("Server started successfully");
    }

    public static void main(String[] args) {
        int port = 82; // Port des WebSocket-Servers Nummererfragen !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        GameServer server = new GameServer(port);
        server.start();
        System.out.println("WebSocket server started on port: " + port);
    }
}
