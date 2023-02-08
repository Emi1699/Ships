import exceptions.InvalidZoneIdException;
import game.Game;

public class Main {
    public static void main(String[] args) throws InvalidZoneIdException {

        Game game = new Game();
        game.displayMap();
    }
}
