package masters.cs06.view;

public class OutputView {

    public void printStart() {
        System.out.println(Message.START_MESSAGE.findMessage());
        System.out.println();
        System.out.println(Message.INIT_MESSAGE.findMessage());
        System.out.println();
    }

    public void printCommend() {
        System.out.print(Message.COMMEND_MESSAGE.findMessage());
    }
    
    public void printBoard(String[][] chessBoard) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                stringBuilder.append(chessBoard[i][j]);
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }

    enum Message {
        START_MESSAGE("체스 게임을 시작합니다."),
        INIT_MESSAGE("체스 보드를 초기화 했습니다."),
        COMMEND_MESSAGE("명령을 입력하세요. : "),
        END_MESSAGE("게임을 종료합니다.");

        final String message;

        Message(String message) {
            this.message = message;
        }

        public String findMessage() {
            return message;
        }
    }
}
