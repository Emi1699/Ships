package gameEntities.ships;

import gameEntities.Zone;

public class ShipZone extends Zone {
    public boolean alive = true;

    public ShipZone(Character row, Byte column) {
        super(row, column);
    }
}
