package gameEntities;

import exceptions.InvalidZoneIdException;

public class Zone {
    public Character row;
    public int column;
    private String id;

    private char symbol;


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
        int column = Integer.parseInt(id.substring(1));
    }

    public String getId() {
        return this.id;
    }

    public static String createId(char row, int column) {
        return row + Integer.toString(column);
    }


}
