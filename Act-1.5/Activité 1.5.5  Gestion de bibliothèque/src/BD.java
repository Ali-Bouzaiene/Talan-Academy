
public class BD extends Livre {
    boolean color;
    String direction;
    public BD(String titre, String auteur, float prix, int NbrP, boolean color) {
        super(titre, auteur, prix, NbrP);
        this.color = color;
        this.direction = "de gauche à droite";
    }
}

