package mission5.problem1;

public class RedCustomer extends Member {
    final double POINT_RATE = 0.01;
    final int PARKING_RATE = 3000;

    public RedCustomer(String name, int purchaseAmount, int stayTime) {
        super(name, purchaseAmount, stayTime);
        this.discount = purchaseAmount;
        this.point = purchaseAmount * POINT_RATE;
        this.parkingFee = stayTime * PARKING_RATE;
    }
}
