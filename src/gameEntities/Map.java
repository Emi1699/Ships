package gameEntities;

import exceptions.InvalidZoneIdException;
import game.Updateable;

import java.util.ArrayList;

public class Map implements Updateable {
    private static int WIDTH; // number of horizontal cells (bytes)
    private static int HEIGHT; // number of vertical cells  (chars)

    // used to access the map's zones by their names
    private final ArrayList<Zone> zones = new ArrayList<>();

    // create a new map
    public Map() throws InvalidZoneIdException {
        for (int row = 'A'; row < 'A' + Map.HEIGHT; row++) {
            for (int column = 1; column <= Map.WIDTH; column++) {
                zones.add(new Zone(row + Integer.toString(column)));
            }
        }
    }

    public Map(int width, int height) throws InvalidZoneIdException {
        Map.WIDTH = width;
        Map.HEIGHT = height;

        for (char row = 'A'; row < 'A' + Map.HEIGHT; row++) {
            for (int column = 1; column <= Map.WIDTH; column++) {
                zones.add(new Zone(row + Integer.toString(column)));
            }
        }
    }

    public void getZones() {
        int i = 1;
        for (Zone zone : zones) {
            System.out.print(zone.getId() + " ");
            i++;

            // print a new line
            if (i == Map.WIDTH) {
                System.out.println();
                i = 1;
            }
        }
    }

    @Override
    public void update() {

    }
}
