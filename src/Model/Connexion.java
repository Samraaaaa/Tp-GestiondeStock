package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Samraa
 */
public class Connexion {
    Connection con;
    
    public Connection getConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdd_stock","root","$trEEter2004");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
