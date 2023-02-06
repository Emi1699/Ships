import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();

        ArrayList<Coordinates> coords = new ArrayList<>(Arrays.asList(new Coordinates('A', (byte) 1),
                                                                      new Coordinates('B', (byte) 1),
                                                                      new Coordinates('C', (byte) 1)));
        Ship s = new Ship(coords);

        System.out.println("Starting game...\n");
        game.start();
    }
}
