package masters.cs05.model;

public class Calculator {
    public double calculateTwoPointDistance(Point a, Point b) {
        double distanceX = Math.pow(a.findX() - b.findX(), 2);
        double distanceY = Math.pow(a.findY() - b.findY(), 2);
        return Math.floor(Math.sqrt(distanceX + distanceY) * 1000000) / 1000000;
    }
}
