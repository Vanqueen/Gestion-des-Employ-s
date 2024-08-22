import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Employe {
    private List<Employe> employes = new ArrayList<>();
    private int ID;
    public String nom;
    public String poste;
    public int salaire;

     public Employe() {
        this.ID = ID;
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }
          
    public int getID() {
        return this.ID;
    }
     public void setID(int id) {
        this.ID = id;
    }    

    public String getNom() {
        return this.nom;
    }
     public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return this.poste;
    }
     public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getSalaire() {
        return this.salaire;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    // public int uuid() {
    //     // String id = this.ID;
    //     for(int i = 1; i< Employe.ID.length(); i++ )
    //     return Employe.ID;
    // }

}
