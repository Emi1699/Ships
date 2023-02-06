package ships;

import game.Zone;

public class ShipZone extends Zone {
    boolean isAlive = true;

    public ShipZone(Character row, Byte column) {
        super(row, column);
    }
}
