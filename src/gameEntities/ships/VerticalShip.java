package gameEntities.ships;

import exceptions.InvalidZoneIdException;
import game.Updateable;
import gameEntities.Zone;

import java.util.ArrayList;
import java.util.Collections;

public class VerticalShip extends Ship implements Updateable {
    public Byte column;
    public ArrayList<Character> rows = new ArrayList<>();

    public VerticalShip(Byte column, ArrayList<Character> rows) throws InvalidZoneIdException {
        super();

        this.column = column;
        this.rows.addAll(rows);

        // instantiate the ship's location
        for (Character row : this.rows) {
            this.location.add(new ShipCell(Zone.createId(row, column)));
        }

        // useful when printing the position and state of the ship
        Collections.reverse(this.location);
        Collections.reverse(this.rows);
    }

    @Override
    public String toString() {
        StringBuilder shipToString = new StringBuilder(super.toString().concat("\n"));

        this.rows.stream().map(row -> this.location.stream()
                        .filter(obj -> obj.row == row)
                        .findFirst()
                        .orElse(null))
                .forEach(obj -> {
                    if (obj.alive) {
                        shipToString.append(obj.row).append(" o\n");
                    } else {
                        shipToString.append(obj.row).append(" x\n");
                    }
                });

        shipToString.append("  ").append(this.column).append("\n");

        return shipToString.toString();
    }
}
