package Test;

public class Beverage {
    private int quntity;

    public Beverage(int quntity) {
        this.quntity = quntity;
    }

    public void drunken(int quntity) {
        this.quntity -= quntity;
    }
}
