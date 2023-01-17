package masters.cs05.view;

public class OutputView {
    final String HEADER_MESSAGE = "좌표를 입력하세요.";
    final String ERROR_MESSAGE = "24 이하의 숫자만 입력하세요.";
    final String TWO_POINT_DISTANCE = "두 점 사이 거리는 ";

    public void printHeader() {
        System.out.println(HEADER_MESSAGE);
    }

    public void printError() {
        System.out.println(ERROR_MESSAGE);
    }

    public void printTwoPointDistance(double result) {
        System.out.println(TWO_POINT_DISTANCE + result);
    }

    public void printCoordinatePlane(String[][] coordinatePlane) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                stringBuilder.append(coordinatePlane[i][j]);
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }
}
