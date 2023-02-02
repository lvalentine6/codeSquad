package masters.cs09;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        SquadSet a = new SquadSet(new int[]{1, 2, 3});
        SquadSet b = new SquadSet(new int[]{1, 3});

        CountSet countSet = new CountSet();

        System.out.println("A 집합 = " + Arrays.toString(a.getArray()));
        System.out.println("B 집합 = " + Arrays.toString(b.getArray()));
        System.out.println("합집합 sum = " + Arrays.toString(a.sum(b)));
        System.out.println("차집합 complement = " + Arrays.toString(a.complement(b)));
        System.out.println("교집합 intersect = " + Arrays.toString(a.intersect(b)));
        System.out.println("모든요소 resultAll = " + Arrays.toString(a.resultAll(b)));
    }
}
