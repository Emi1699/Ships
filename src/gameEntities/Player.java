package gameEntities;

import exceptions.InvalidZoneIdException;
import gameEntities.ships.Ship;
import gameEntities.ships.ShipCell;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Ship> ships = new ArrayList<>();

    public Player() throws InvalidZoneIdException {
        this.createShip();
    }
    public void createShip() throws InvalidZoneIdException {
        ArrayList<ShipCell> shipLocation = new ArrayList<>();
        shipLocation.add(new ShipCell("A1"));
        shipLocation.add(new ShipCell("A2"));
        shipLocation.add(new ShipCell("A3"));

        Ship ship = new Ship(shipLocation);

        this.ships.add(ship);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ship> getShips() {
        return this.ships;
    }
}
