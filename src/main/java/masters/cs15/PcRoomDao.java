package masters.cs15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PcRoomDao {
    private Connection connection;
    private static final String dbUrl = "jdbc:mysql://localhost:3306/pc_room";
    private static final String dbUser = "pc_room_manager";
    private static final String dbPassword = "1234";

    public PcRoomDao() {
        try {
            this.connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            System.out.println("접속 완료");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
