package gameEntities;

import exceptions.InvalidZoneIdException;
import gameEntities.ships.Ship;
import gameEntities.ships.ShipCell;

import java.util.ArrayList;

public class Player {
    private String name;
    private Ship ship = new Ship("Rosa");

    public Player() throws InvalidZoneIdException {
        this.setShipLocation();
    }
    public void setShipLocation() throws InvalidZoneIdException {
        ArrayList<ShipCell> shipLocation = new ArrayList<>();
        shipLocation.add(new ShipCell("A1"));
        shipLocation.add(new ShipCell("A2"));
        shipLocation.add(new ShipCell("A3"));
        this.ship.setLocation(shipLocation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
