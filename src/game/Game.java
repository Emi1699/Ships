package game;

public class Game {
    Player p1 = new Player();
    Player p2 = new Player();

    public void start() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("game.Game has started!\n\n");
    }
}
