package ships;

import java.util.ArrayList;

public class HorizontalShip extends Ship {
    public Character row;
    public ArrayList<Byte> columns;

    public HorizontalShip (Character row, ArrayList<Byte> columns) {
        super();

        this.row = row;
        this.columns.addAll(columns);

        // instantiate the ship's location
        for (Byte column : this.columns) {
            this.location.add(new ShipZone(this.row, column));
        }
    }
}
