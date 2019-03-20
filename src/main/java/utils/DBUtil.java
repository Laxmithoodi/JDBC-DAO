package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String mySqlUser = "root";
    private static final String mySqlPwd = "laxmi0217";
    private static final String mySqlCS = "jdbc:mysql://localhost:3306/";

//    private static final String oracalUser = "root";
//    private static final String oracalPwd = "";
//    private static final String oracalCS = "jdbc:oracle://localhost:1521:xe";

    public static Connection getConnection(DBType mysqldb) throws SQLException {
        Connection conn = null;

                conn = DriverManager.getConnection(mySqlCS, mySqlUser, mySqlPwd);

                return conn;

    }

    public static void showErrorMessage(SQLException e){
        System.err.println("Error :" + e.getMessage());
        System.err.println("Error code: " + e.getErrorCode());
    }

    public static void main(String...args) throws SQLException {
        Connection conn = null;
        try {
            conn = getConnection(DBType.MYSQLDB);
            System.out.println("Connection Established to MYSQL Database");
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        } finally {

           conn.close();

        }

    }


}
