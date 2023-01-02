package preCourse.problem1;

public class Application {
    public static void main(String[] args) {
        Member member1 = new RedCustomer("James", 10000, 2);
        Member member2 = new RedCustomer("Tomas", 30000, 2);
        Member member3 = new PlatinumCustomer("Edward", 10000, 2);
        Member member4 = new PlatinumCustomer("Percy", 30000, 2);
        Member member5 = new DiamondCustomer("Elizabet", 30000, 2);

        member1.printCustomer();
        member2.printCustomer();
        member3.printCustomer();
        member4.printCustomer();
        member5.printCustomer();
    }
}
