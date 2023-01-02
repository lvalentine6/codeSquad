package preCourse.problem1;

public class Member {
    protected String name;
    protected int purchaseAmount;
    protected int stayTime;
    protected double discount;
    protected double point;
    protected int parkingFee;

    public Member(String name, int purchaseAmount, int stayTime) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
        this.stayTime = stayTime;
    }

    public void printCustomer() {
        System.out.println(name + "님의 지불 금액은 " + (int) discount
                + " 원이고, 적립 포인트는 " + (int) point + "점 입니다." + "\n" + "주차 요금은 " + parkingFee + "원 입니다.");
        System.out.println();
    }
}
