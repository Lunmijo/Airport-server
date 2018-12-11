import javax.naming.NamingException;
import java.sql.*;
import java.util.ArrayList;

public class SQLiteDBManager {

    public static Connection conn;
    public static Statement stat;
    public static ResultSet rs;

    public static void  Connect() throws ClassNotFoundException, SQLException, NamingException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:database");
    }

}
