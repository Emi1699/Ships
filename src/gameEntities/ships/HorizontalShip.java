package gameEntities.ships;

import exceptions.InvalidZoneIdException;
import gameEntities.Zone;

import java.util.ArrayList;
import java.util.Objects;

public class HorizontalShip extends Ship {
    public Character row;
    public ArrayList<Integer> columns = new ArrayList<>();

    public HorizontalShip(String name, Character row, ArrayList<Integer> columns) throws InvalidZoneIdException {
        super(name);

        this.row = row;
        this.columns.addAll(columns);

        // instantiate the ship's location
        for (int column : this.columns) {
            this.location.add(new ShipCell(Zone.createId(row, column)));
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
        for (int column : this.columns) {
            shipToString.append(column).append(" ");
        }


        return shipToString.toString();
    }
}
