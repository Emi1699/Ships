package gameEntities.ships;

import exceptions.InvalidZoneIdException;
import gameEntities.Zone;

public class ShipCell extends Zone {
    public boolean alive = true;

    public ShipCell(String Id) throws InvalidZoneIdException {
        super(Id);
    }
}
