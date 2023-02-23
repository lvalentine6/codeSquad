package masters.cs15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PcRoomDao {
    private Connection connection;
    private static final String dbUrl = "jdbc:mysql://localhost:3306/pc_room";
    private static final String dbUser = "pc_room_manager";
    private static final String dbPassword = "1234";
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;

    public PcRoomDao() {
        try {
            this.connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            System.out.println("DB 접속 성공");
            System.out.println("----------------------------");
            initSeat();
            System.out.println("초기설정 완료");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw new RuntimeException(sqlException);
        }
    }

    public void initSeat() {
        for (int i = 0; i < 16; i++) {
            String sql = "INSERT INTO member_table "
                    + "(pc_start_time, pc_end_time, pc_seat)"
                    + "VALUE(now(), NULL, seq)";
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<String> checkTable() {
        List<String> seqList = new ArrayList<>();
        String sql = "select * from member_table";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                seqList.add(resultSet.getString(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return seqList;
    }

    public String creatUser() {
        System.out.println("생성");
        return "";
    }

    public String deleteUser() {
        System.out.println("삭제");
        return "";
    }

    public void closeConnection() {
        try {
            connection.close();
            System.out.println("----------------------------");
            System.out.println("DB 접속 종료");
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }
}
