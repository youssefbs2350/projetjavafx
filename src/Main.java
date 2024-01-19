import java.sql.*;

public class Main {


    static String url = "jdbc:mysql://localhost:3306/projetjavafx";
    static  String user = "root";
    static String pwd = "";


    static Connection conn;

    static Statement ste ;


    public static void main(String[] args) {

        try {
            conn= DriverManager.getConnection(url,user,pwd);
            System.out.println("connexion établie");
        } catch (SQLException e) {
            System.out.println(e);
        }
        String req = "INSERT INTO `utilisateurs` (`id`, `username`, `password`, `type`) VALUES (NULL, 'samir', 'sankou7', 'user');";


        try {
            ste = conn.createStatement();
            ste.executeUpdate(req);
        }
        catch (SQLException e){
            System.out.println(e);

        }
        try {
            ResultSet res = ste.executeQuery("select *  from utilisateurs");
            while (res.next()) {
                int id = res.getInt(1);
                String username = res.getString(2);
                String password = res.getString("password");

                System.out.println("id:" + id + "nom:" + username + "pwd:" + password );
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}

