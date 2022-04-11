import java.util.*;
public class Recette {
	String nom;
	String description;
	int nivDif;
	ArrayList<String> astuces = new ArrayList<>();
    ArrayList<String> etapes = new ArrayList<>();
    public Recette(String nom, String description, int nivDif) {
        this.nom = nom;
        this.description = description;
        this.nivDif = nivDif;
    }
    public void addAstuce(String astuce) {
        astuces.add(astuce);
    }

    public void addEtape(String etape) {
        etapes.add(etape);
    }
}
