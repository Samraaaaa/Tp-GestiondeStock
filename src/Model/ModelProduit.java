package Model;

/**
 *
 * @author Samraa
 */
public class ModelProduit {
    
    public String id;
    public String nomProduit;
    public String categorie;
    public int quantite;
    public double prix;

    public ModelProduit(){
    }

    public ModelProduit(String id, String nomProduit, String categorie, int quantite, double prix) {
        this.id = id;
        this.nomProduit = nomProduit;
        this.categorie = categorie;
        this.quantite = quantite;
        this.prix = prix;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


}

    
