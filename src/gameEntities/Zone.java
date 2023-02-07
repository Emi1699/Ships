package gameEntities;

import exceptions.InvalidZoneIdException;

public class Zone {
    public Character row;
    public int column;
    private String id;

    private char symbol;

    public void setRow(Character row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // STILL NEED TO ADD ERROR HANDLING FOR SOME EDGE CASES (E.G. HAVING A COLUMN BIGGER THAN THE WIDTH OF THE MAP)
    public Zone(String id) throws InvalidZoneIdException {
        if (id.length() < 2) {
            throw new InvalidZoneIdException("Zone IDs must have a length of at least 2 (e.g. A3 / B12 / etc)");
        }

        // first character of the ID must be a letter representing the row
        if (!Character.isAlphabetic(id.charAt(0))) {
            throw new InvalidZoneIdException("First character must be a letter representing the row (e.g. A3 / B12 / etc).");
        }

        this.row = id.charAt(0);
        this.column = Integer.parseInt(id.substring(1));
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public Character getRow() {
        return this.row;
    }

    public static String createId(char row, int column) {
        return row + Integer.toString(column);
    }


}
