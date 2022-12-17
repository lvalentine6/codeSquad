package ramda;

public class RamdaMain {
    public static void main(String[] args) {
//        Ramda1 ramda1 = (a, b) -> Math.max(a, b);
//        print(ramda1);
//        System.out.println(ramda1.max(1, 7));
        Ramda1 ramda1 = (a, b) -> Math.max(a, b);
        System.out.println(ramda1.run(1, 5));
        Ramda1 ramda2 = min();
        System.out.println(ramda2.run(2, 8));
    }

//    public static void print(Ramda1 ramda1) {
//        System.out.println(ramda1.max(1, 5));
//    }

    public static Ramda1 min() {
        return ((a, b) -> Math.min(a, b));
    }

}
