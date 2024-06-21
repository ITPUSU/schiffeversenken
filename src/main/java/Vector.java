// Hilfsklasse, um die Koordinaten darzustellen
public class Vector {
    private int x; // X-Koordinate
    private int y; // Y-Koordinate

    // Konstruktor für eine Koordinate
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Gibt die X-Koordinate zurück
    public int getX() {
        return x;
    }

    // Setzt die X-Koordinate
    public void setX(int x) {
        this.x = x;
    }

    // Gibt die Y-Koordinate zurück
    public int getY() {
        return y;
    }

    // Setzt die Y-Koordinate
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
