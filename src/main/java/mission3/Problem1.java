package mission3;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        char[] arr = new char[26];

        char start = 'A';
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
