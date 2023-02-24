package masters.cs15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PcRoomDao {
    private final Connection connection;
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
            System.out.println("----------------------------");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw new RuntimeException(sqlException);
        }
    }

    public void initSeat() {
        for (int i = 0; i < 16; i++) {
            String sql = "INSERT INTO pc_table "
                    + "(pc_start_time, pc_end_time, user_index)"
                    + "VALUE(now(), NULL, 0)";
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
        String sql = "select * from pc_table WHERE user_index = 0";
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

    public void updateUser(int userIndex) {
        String sql = "SELECT seq FROM pc_table WHERE user_index = 0 ORDER BY RAND() LIMIT 1";
        int seq = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                seq = Integer.parseInt(resultSet.getString(1));
            }

            sql = "update pc_table SET user_index = "
                    + userIndex
                    + " WHERE seq = "
                    + seq;

            System.out.println(seq + "번 자리에 앉으세요 : " + "#" + userIndex);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUser(int userIndex) {
        String sql = "SELECT seq FROM pc_table WHERE user_index = " + userIndex;
        int seq = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                seq = Integer.parseInt(resultSet.getString(1));
            }

            sql = "update pc_table SET user_index = "
                    + 0
                    + ", pc_end_time = now()"
                    + " WHERE seq = "
                    + seq;
            System.out.println("이제 " + seq + "번 자리가 비었습니다.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection() {
        try {
            String sql = "truncate pc_table";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
            connection.close();
            System.out.println("----------------------------");
            System.out.println("DB 초기화 및 접속 종료");
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }
}
