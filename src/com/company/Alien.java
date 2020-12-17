package com.company;

public class Alien {
    String name;
    String type;
    String planet;
    String spaceShipName;

    public Alien(String name, String type, String planet, String spaceShipName) {
        this.name = name;
        this.type = type;
        this.planet = planet;
        this.spaceShipName = spaceShipName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s \nType: %s \nPlanet: %s \nSpaceship: %s \n", name, type, planet, spaceShipName );
    }
}
