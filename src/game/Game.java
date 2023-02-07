package game;

public class Game implements Updateable {

    public void start() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("game.Game has started!\n\n");
    }

    @Override
    public void update() {

    }
}
