package game;

import exceptions.InvalidZoneIdException;
import gameEntities.*;
import gameEntities.ships.Ship;

import java.util.ArrayList;


public class Game implements Updateable {
    Map map;
    Player player;

    public Game() throws InvalidZoneIdException {
        this.map = new Map(10, 10);
        this.player = new Player();
    }

    public void displayMap() {
        // get a list of all the player's ships' Id's
        ArrayList<String> shipZoneIds = new ArrayList<>();
        for (Ship ship : this.player.getShips()) {
            shipZoneIds.addAll(ship.getAllCellsIds());
        }

        // for every zone on the Map
        for (Zone mapZone : this.map.getZones()) {
            // if the zone's ID matches on of the IDs in the shipZoneIds
                // it means that cell is part of a ship, so we check its status (hit / not-hit
                    // if hit, that cell's symbol becomes 'x'
                    // if not hit, that cell's symbol becomes 'o'

            // if not, it means the Id is part of the map


            if (shipZoneIds.contains(mapZone.getId())) {
               System.out.println(this.player.getShips().stream().map(ship -> ship.getCellById(mapZone.getId())).count());
            }
        }

        map.displayMap();

    }

    @Override
    public void update() {

    }
}
