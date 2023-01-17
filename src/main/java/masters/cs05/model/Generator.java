package masters.cs05.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generator {
    public List<Point> makePoints(String input) {
        List<Point> list = new ArrayList<>();

        input = input.replaceAll("[()]", "");
        String[] stringSplit = input.split("[,-]");
        int[] intTemp = Arrays.stream(stringSplit).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < stringSplit.length; i += 2) {
            list.add(new Point(intTemp[i], intTemp[i + 1]));
        }

        return list;
    }

    public String[][] makeCoordinatePlane(Point a, Point b) {
        String[][] coordinatePlane = new String[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                coordinatePlane[i][j] = "  ";
            }
        }

        int indexY = 24;
        for (int i = 0; i < 26; i++) {
            if (i > 14) {
                coordinatePlane[i][0] = " " + indexY;
            } else {
                coordinatePlane[i][0] = String.valueOf(indexY);
            }
            if (i % 2 != 0) {
                coordinatePlane[i][0] = " ";
                coordinatePlane[i][1] = " |";
                indexY--;
                continue;
            }
            indexY--;
            coordinatePlane[i][1] = "|";
        }

        int indexX = 1;
        for (int i = 2; i < 26; i++) {
            coordinatePlane[24][i] = "--";

            if (indexX % 2 == 0) {
                coordinatePlane[25][i] = String.valueOf(indexX);
            } else {
                if(i < 10) {
                    coordinatePlane[25][i] =  "   ";
                } else {
                    coordinatePlane[25][i] =  "  ";
                }
            }
            indexX++;
        }
        coordinatePlane[24 - (int) a.findY()][(int) a.findX() + 1] = "*";
        coordinatePlane[24 - (int) b.findY()][(int) b.findX() + 1] = "*";

        return coordinatePlane;
    }
}
