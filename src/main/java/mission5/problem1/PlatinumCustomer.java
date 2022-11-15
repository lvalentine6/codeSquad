package mission5.problem1;

public class PlatinumCustomer extends Member {
    final double DISCOUNT_RATE = 0.05;
    final double POINT_RATE = 0.05;
    final int PARKING_RATE = 1000;

    public PlatinumCustomer(String name, int purchaseAmount, int stayTime) {
        super(name, purchaseAmount, stayTime);
        this.discount = purchaseAmount - purchaseAmount * DISCOUNT_RATE;
        this.point = purchaseAmount * POINT_RATE;
        this.parkingFee = stayTime * PARKING_RATE;
    }
}
