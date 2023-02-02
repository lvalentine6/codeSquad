package masters.cs09;

import java.util.Arrays;
import java.util.stream.IntStream;

public final class SquadSet {
    int[] array;

    public SquadSet(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    int[] sum(SquadSet b) {
        return IntStream.concat(Arrays.stream(array), Arrays.stream(b.getArray()))
                .distinct()
                .toArray();
    }

    int[] complement(SquadSet b) {
        return Arrays.stream(array)
                .filter(i -> Arrays.stream(b.getArray()).noneMatch(j -> i == j))
                .toArray();
    }

    int[] intersect(SquadSet b) {
        return Arrays.stream(array)
                .filter(i -> Arrays.stream(b.getArray()).anyMatch(j -> i == j))
                .toArray();
    }

    int[] resultAll(SquadSet b) {
        return IntStream.concat(Arrays.stream(sum(b)),
                        IntStream.concat(Arrays.stream(complement(b)), Arrays.stream(intersect(b))))
                .toArray();
    }

}
