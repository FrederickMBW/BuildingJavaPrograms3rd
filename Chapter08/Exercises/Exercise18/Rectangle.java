import java.awt.Point;

public class Rectangle {
    private int x, y, width, height;

    public Rectangle(Point p, int width, int height) {
        this(p.x, p.y, width, height);
    }

    public Rectangle(int x, int y, int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException();
        }

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("Rectangle[x=%d,y=%d,width=%d,height=%d]", x, y, width, height);
    }

    public boolean contains(int x, int y) {
        return x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height;
    }

    public boolean contains(Point p) {
        return contains(p.x, p.y);
    }

    public Rectangle union(Rectangle rect) {
        int left = Math.min(x, rect.x);
        int width = Math.max(x + this.width, rect.x + rect.width) - left;
        int top = Math.min(y, rect.y);
        int height = Math.max(y + this.height, rect.y + rect.height) - top;

        return new Rectangle(left, top, width, height);
    }

    public Rectangle intersection(Rectangle rect) {
        int left = Math.max(this.x, rect.x);
        int top = Math.max(this.y, rect.y);
        int right = Math.min(this.x + this.width, rect.x + rect.width);
        int bottom = Math.min(this.y + this.height, rect.y + rect.height);

        int width = Math.max(0, right - left);
        int height = Math.max(0, bottom - top);

        return new Rectangle(left, top, width, height);
    }
}