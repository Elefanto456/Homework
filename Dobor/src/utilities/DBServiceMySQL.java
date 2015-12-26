package utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBServiceMySQL {
    private Connection conn;
    private static DBServiceMySQL database;

    private static final String URL           = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_NAME = "count";
    private static final String USER_NAME     = "root";
    private static final String PASSWORD      = "1234";


    private DBServiceMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.conn = DriverManager.getConnection(URL+DATABASE_NAME,USER_NAME,PASSWORD);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DBServiceMySQL getInstance() {

        if(database == null) {
            synchronized (DBServiceMySQL.class) {
                if(database == null) {
                    database = new DBServiceMySQL();
                }
            }
        }
        return database;
    }


    public static Connection connect(){

        return DBServiceMySQL.getInstance().conn;
    }
}
