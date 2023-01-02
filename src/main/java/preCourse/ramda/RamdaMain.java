package preCourse.ramda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RamdaMain {
    public static void main(String[] args) {
//        Ramda1 ramda1 = (a, b) -> Math.max(a, b);
//        print(ramda1);
//        System.out.println(ramda1.max(1, 7));
        Ramda ramda1 = (a, b) -> Math.max(a, b);
        System.out.println(ramda1.run(1, 5));
        Ramda ramda2 = min();
        System.out.println(ramda2.run(2, 8));

        // 함수형 인터페이스 패키지
        Runnable a = () -> System.out.println("스트링 테스트");
        Supplier<String> b = () -> "람다란... 무엇인가...";
        Consumer<Integer> c = (k) -> System.out.println(k);
        Function<Integer, String> d = (y) -> "반환";
        Predicate<String> f = (r) -> r.equals("아아");
        a.run();
        System.out.println(b.get());
        c.accept(5);
        System.out.println(d.apply(8));
        System.out.println(f.test("아아"));

    }

//    public static void print(Ramda1 ramda1) {
//        System.out.println(ramda1.max(1, 5));
//    }

    public static Ramda min() {
        return ((a, b) -> Math.min(a, b));
    }

}
