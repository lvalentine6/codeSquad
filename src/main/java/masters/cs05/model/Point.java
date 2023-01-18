package masters.cs05.model;

public class Point {
    private final double x;
    private final double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double findX() {
        return x;
    }

    public double findY() {
        return y;
    }
}
