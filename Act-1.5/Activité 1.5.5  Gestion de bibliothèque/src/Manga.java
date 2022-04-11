
public class Manga extends Livre {
    boolean color;
    String direction;
    int taille;
    public Manga(String titre, String auteur, float prix, int NbrP) {
        super(titre, auteur, prix, NbrP);
        this.color = false;
        this.taille=taille;
        this.direction = "de droite à gauche";
    }
}
