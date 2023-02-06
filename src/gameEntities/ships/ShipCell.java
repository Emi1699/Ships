package gameEntities.ships;

import gameEntities.Zone;

public class ShipCell extends Zone {
    public boolean alive = true;

    public ShipCell(Character row, Byte column) {
        super(row, column);
    }
}
