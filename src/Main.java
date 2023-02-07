import exceptions.InvalidZoneIdException;
import game.Game;
import gameEntities.Map;
import gameEntities.Zone;
import gameEntities.ships.HorizontalShip;
import gameEntities.ships.Ship;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InvalidZoneIdException {

        Game game = new Game();
        game.displayMap();
    }
}
