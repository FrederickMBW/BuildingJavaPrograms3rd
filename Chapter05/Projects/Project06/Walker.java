public class Walker {
    private int x;
    private int y;

    public Walker() {
        this.x = 0;
        this.y = 0;
    }

    public void incrementX() {
        this.x++;
    }

    public void decrementX() {
        this.x--;
    }

    public void incrementY() {
        this.y++;
    }

    public void decrementY() {
        this.y--;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}