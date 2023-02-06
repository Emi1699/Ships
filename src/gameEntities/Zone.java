package game;

public class Zone {
    public Character row;
    public Byte column;
    public boolean isAlive = true;

    public Zone(Character row, Byte column) {
        this.column = column;
        this.row = row;
    }
}
