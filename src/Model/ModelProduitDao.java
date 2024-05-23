package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Samraa
 */
public class ModelProduitDao {
    
    Connection con;
    Connexion cnx = new Connexion();
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean Enregistrer(ModelProduit mP){
        String sql = " INSERT INTO gestion (id, produit, quantite, categorie, prix)VALUES"
                +"(?,?,?,?,?)";
        
        try {
           con = cnx.getConnection();
           pst = con.prepareStatement(sql);
           pst.setString(1, mP.getId());
           pst.setString(2, mP.getNomProduit());
           pst.setInt(3, mP.getQuantite());
           pst.setString(4, mP.getCategorie());
           pst.setDouble(5, mP.getPrix());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Produit ajouté");
           return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public List Liste(){
        List<ModelProduit> lis = new ArrayList<>();
        
        String sql = "SELECT * FROM gestion";
        try {
            con = cnx.getConnection();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {                
                ModelProduit mObj = new ModelProduit();
                mObj.setId(rs.getString("id"));
                mObj.setNomProduit(rs.getString("produit"));
                mObj.setQuantite(rs.getInt("quantite"));
                mObj.setCategorie(rs.getString("categorie"));
                mObj.setPrix(rs.getDouble("prix"));
                lis.add(mObj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lis;
    }
    
}
