package ships;

import java.util.ArrayList;

public class VerticalShip extends Ship {
    public Byte column;
    public ArrayList<Character> rows;

    public VerticalShip (Byte column, ArrayList<Character> rows) {
        super();

        this.column = column;
        this.rows.addAll(rows);

        // instantiate the ship's location
        for (Character row : this.rows) {
            this.location.add(new ShipZone(row, this.column));
        }
    }
}
