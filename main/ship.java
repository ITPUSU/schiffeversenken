cd .import java.util.ArrayList;
import java.util.List;

// Abstrakte Klasse, die die Eigenschaften und das Verhalten eines Schiffs definiert
public abstract class Ship {
    protected boolean sunk; // Gibt an, ob das Schiff versenkt wurde
    protected int length; // Länge des Schiffs
    protected List<Vector> coordinates; // Koordinaten des Schiffs

    // Konstruktor für Schiff mit angegebener Längen
    public Ship(int length) {
        this.length = length;
        this.sunk = false;
        this.coordinates = new ArrayList<>();
    }

    // Abstrakte Methode, die angibt, ob das Schiff versenkt ist
    public abstract boolean isSunk();

    // Gibt die Länge des Schiffs zurück
    public int getLength() {
        return length;
    }

    // Gibt die Koordinaten des Schiffs zurück
    public List<Vector> getCoordinates() {
        return coordinates;
    }

    // Setzt die Koordinaten des Schiffs
    public void setCoordinates(List<Vector> coordinates) {
        this.coordinates = coordinates;
    }
}

// Klasse, die einen Kreuzer (Länge 4) darstellt
class Cruiser extends Ship {
    public Cruiser() {
        super(4);
    }

    // Methode, die angibt, ob der Kreuzer versenkt ist
    @Override
    public boolean isSunk() {
        return this.sunk;
    }
}

// Klasse, die ein Schlachtschiff (Länge 5) darstellt
class Battleship extends Ship {
    public Battleship() {
        super(5);
    }

    // Methode, die angibt, ob das Schlachtschiff versenkt ist
    @Override
    public boolean isSunk() {
        return this.sunk;
    }
}

// Klasse, die einen Zerstörer (Länge 3) darstellt
class Destroyer extends Ship {
    public Destroyer() {
        super(3);
    }

    // Methode, die angibt, ob der Zerstörer versenkt ist
    @Override
    public boolean isSunk() {
        return this.sunk;
    }
}

// Klasse, die ein U-Boot (Länge 2) darstellt
class Uboat extends Ship {
    public Uboat() {
        super(2);
    }

    // Methode, die angibt, ob das U-Boot versenkt ist
    @Override
    public boolean isSunk() {
        return this.sunk;
    }
}
