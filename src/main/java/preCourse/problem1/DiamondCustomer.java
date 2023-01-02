package preCourse.problem1;

public class DiamondCustomer extends Member {
    final double DISCOUNT_RATE = 0.1;
    final double POINT_RATE = 0.1;
    final int PARKING_RATE = 0;

    public DiamondCustomer(String name, int purchaseAmount, int stayTime) {
        super(name, purchaseAmount, stayTime);
        this.discount = purchaseAmount - purchaseAmount * DISCOUNT_RATE;
        this.point = purchaseAmount * POINT_RATE;
        this.parkingFee = stayTime * PARKING_RATE;
    }
}
