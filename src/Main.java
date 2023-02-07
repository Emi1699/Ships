import game.Game;
import gameEntities.ships.HorizontalShip;
import gameEntities.ships.Ship;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();

//        Ship s1 = new VerticalShip((byte)3, new ArrayList<Character>(Arrays.asList('D', 'E', 'F')));
        Ship s2 = new HorizontalShip("Mara",'C', new ArrayList<Byte>(Arrays.asList((byte)4, (byte)5, (byte)6)));

        s2.getLocation().get(0).alive = false;
        s2.getLocation().get(1).alive = false;
        s2.getLocation().get(2).alive = true;


        System.out.println(s2);
        System.out.println(s2.isDead());
//        System.out.println("Starting game...\n");
//        game.start();
    }
}
