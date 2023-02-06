package gameEntities.ships;

import java.util.ArrayList;
import java.util.Objects;

public class HorizontalShip extends Ship {
    public Character row;
    public ArrayList<Byte> columns = new ArrayList<>();

    public HorizontalShip(Character row, ArrayList<Byte> columns) {
        super();

        this.row = row;
        this.columns.addAll(columns);

        // instantiate the ship's location
        for (Byte column : this.columns) {
            this.location.add(new ShipZone(this.row, column));
        }
    }

    @Override
    public String toString() {
        StringBuilder shipToString = new StringBuilder(super.toString().concat("\n"));
        shipToString.append(this.row).append(" ");

        this.columns.stream().map(column -> this.location.stream()
                        .filter(obj -> Objects.equals(obj.column, column))
                        .findFirst()
                        .orElse(null))
                .forEach(obj -> {
                    if (obj.alive) {
                        shipToString.append(" o");
                    } else {
                        shipToString.append(" x");
                    }
                });

        shipToString.append("\n   ");
        for (Byte column : this.columns) {
            shipToString.append(column).append(" ");
        }


        return shipToString.toString();
    }
}
