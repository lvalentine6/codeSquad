package masters.algorithm3;

public class Mission2 {
    public int reverse(int x) {
        int answer = 0;
        long tempLong = 0;
        String[] str = String.valueOf(x).split("");
        String temp = "";

        if(str[0].equals("-")) {
            temp += "-";
            for (int i = str.length - 1; i > 0; i--) {
                temp += str[i];
            }

            tempLong = Long.parseLong(temp);

            if(tempLong > Integer.MAX_VALUE || tempLong < Integer.MIN_VALUE) {
                return 0;
            }

            return (int) tempLong;
        }

        for (int i = str.length - 1; i >= 0; i--) {
            temp += str[i];
        }

        tempLong = Long.parseLong(temp);

        if(tempLong > Integer.MAX_VALUE || tempLong < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) tempLong;
    }
}
