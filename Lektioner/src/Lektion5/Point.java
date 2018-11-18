package Lektion5;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public boolean equals(Point p) {
        if (this.x == p.x && this.y == p.y) {
            return true;
        }
        return false;
    }
    public void move(int dx, int dy) {
        x = x+dx;
        y = y+dy;

    }
}
