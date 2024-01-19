package utiles;
import java.sql.*;
public class DataSource {

    private Connection conn;

    private static DataSource data;
    private   String url = "jdbc:mysql://localhost:3306/projetjavagui";
    private String user="root";
    private   String pwd="";
    private DataSource()
    {  try {
        conn = DriverManager.getConnection(url, user, pwd);
        System.out.println("connexion établie");
    }catch (SQLException e)
    {
        System.out.println(e);
    }
    }
    public Connection getCon()
    {
        return conn;
    }

    public static DataSource getInstance() {
        if(data==null)
            data=new DataSource();
        return data;
    }
}