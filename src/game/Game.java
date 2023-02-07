package game;

import exceptions.InvalidZoneIdException;
import gameEntities.*;
import gameEntities.ships.ShipCell;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Game implements Updateable {
    Map map;
    Player player;

    public Game() throws InvalidZoneIdException {
        this.map = new Map(10, 10);
        this.player = new Player();
    }

    public void displayMap() {
        ArrayList<String> shipZoneIds = player.getShip().getLocation().stream().map(ShipCell::getId).collect(Collectors.toCollection(ArrayList::new));

        for (Zone mapZone : this.map.getZones()) {
            if (shipZoneIds.contains(mapZone.getId())) {
                if (this.player.getShip().getShipCellById(mapZone.getId()).alive) {
                    mapZone.setSymbol('o');
                } else {
                    mapZone.setSymbol('x');
                }
            } else {
                mapZone.setSymbol('m');
            }
        }

        map.displayMap();
    }



    @Override
    public void update() {

    }
}
