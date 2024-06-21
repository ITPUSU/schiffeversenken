import java.util.ArrayList;
import java.util.List;

// Klasse, die die Spielfeldkarte verwaltet
public class Map {
    private char[][] matrix; // Matrix, die das Spielfeld darstellt
    private List<Ship> ships; // Liste der Schiffe auf der Karte
    private List<char[][]> history; // Liste zur Speicherung der Historie der gesetzten Schiffe

    // Konstruktor für die Karte
    public Map() {
        matrix = new char[10][10];
        ships = new ArrayList<>();
        history = new ArrayList<>(); // Initialisiert die Historie-Liste
        // Initialisiert die Matrix mit Wasser ('~')
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = '~';
            }
        }
    }

    // Gibt die Matrix zurück
    public char[][] getMatrix() {
        return matrix;
    }

    // Gibt die Liste der Schiffe zurück
    public List<Ship> getShips() {
        return ships;
    }

    // Fügt ein Schiff zur Karte hinzu
    public void addShip(Ship ship) {
        ships.add(ship);
        for (Vector coord : ship.getCoordinates()) {
            matrix[coord.getX()][coord.getY()] = 'S';
        }
        rememberSetShips(); // Merkt sich die gesetzten Schiffe nach dem Hinzufügen
    }

    // Methode, um gesetzte Schiffe zu merken
    public void rememberSetShips() {
        // Kopiere den aktuellen Zustand der Matrix
        char[][] matrixCopy = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrixCopy[i][j] = matrix[i][j];
            }
        }
        // Füge die Kopie zur Historie hinzu
        history.add(matrixCopy);
    }

    // Gibt die Historie der gesetzten Schiffe zurück
    public List<char[][]> getHistory() {
        return history;
    }
}
