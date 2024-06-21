#!/bin/bash

# Verzeichnis für die Klassen
mkdir -p bin

# Kompiliere die Java-Dateien
javac -d bin src/main/java/*.java

# Erstelle die JAR-Datei
jar cfm BattelShip.jar src/main/resources/manifest.txt -C bin .

# Bereinigen
rm -rf bin
