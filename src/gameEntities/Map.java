package gameEntities;

import exceptions.InvalidZoneIdException;
import game.Updateable;

import java.util.ArrayList;
import java.util.Objects;

public class Map implements Updateable {
    private static int WIDTH; // number of horizontal cells (bytes)
    private static int HEIGHT; // number of vertical cells  (chars)

    // used to access the map's zones by their names
    private final ArrayList<Zone> zones = new ArrayList<>();

    // create a new map of given size
    public Map(int width, int height) throws InvalidZoneIdException {
        Map.WIDTH = width;
        Map.HEIGHT = height;

        for (char row = 'A'; row < 'A' + Map.HEIGHT; row++) {
            for (int column = 1; column <= Map.WIDTH; column++) {
                this.zones.add(new Zone(row + Integer.toString(column)));
//                System.out.println(row + Integer.toString(column));
            }
        }
    }

    public ArrayList<Zone> getZones() {
        return this.zones;
    }

    public Zone getZoneById(String Id) {
        for (Zone zone : this.zones) {
            if (Objects.equals(zone.getId(), Id)) {
                return zone;
            }
        }

        return null;
    }

    public void displayMap() {
        int i = 0;
        for (Zone zone : zones) {
            System.out.print(zone.getSymbol() + " ");
            i++;

            // print a new line
            if (i == Map.WIDTH) {
                System.out.println();
                i = 0;
            }
        }
    }

    @Override
    public void update() {

    }
}
