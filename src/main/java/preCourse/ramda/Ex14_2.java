package ramda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_2 {
    public static void main(String[] args) {
        // 1~100까지 랜덤 숫자를 구하는 함수형 인터페이스 선언
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100) + 1;
        // 전체 요소를 전부 출력하는 함수형 인터페이스 선언
        Consumer<Integer> consumer = i -> System.out.print(i + ", ");
        // 짝수이면 true를 반환하는 함수형 힌터페이스 선언
        Predicate<Integer> predicate = i -> i % 2 == 0;
        // i의 일의 자리를 없애는 함수형 인터페이스 선언
        Function<Integer, Integer> function = i -> i / 10 * 10;

        // list를 이용해 인터페이스 구현
        List<Integer> list = new ArrayList<>();
        makeRandomNumbers(supplier, list);
        System.out.println(list);
        printEvenNumbers(list, predicate, consumer);

    }

    // 랜덤번호 10개를 원소로 가지는 리스트 만드는 메서드
    public static <T> void makeRandomNumbers(Supplier<T> supplier, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(supplier.get());
        }
    }

    // 짝수 리스트를 출력하는 메서드
    public static <T> void printEvenNumbers(List<T> list, Predicate<T> predicate, Consumer<T> consumer) {
        System.out.print("[");
        for (T i : list) {
            if (predicate.test(i)) {
                consumer.accept(i);
            }
        }
        System.out.print("]");
    }

    // 일의 자리를 없애고 새로운 리스트를 반환하는 메서드 구현


}
