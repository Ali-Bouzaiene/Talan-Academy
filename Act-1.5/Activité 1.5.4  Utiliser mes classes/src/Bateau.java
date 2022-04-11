
public class Bateau {
	public String materiel ;
	public int val2;
	public int id=1;
	
    public Bateau (String materiel, int b) {
    	this.materiel=materiel;
    	this.val2=b;
}
    public Bateau () {

    }
    public int  BateauId () {
    	return this.id=id;
    }
    public String toString () {
    	return "Le Bateau n°" + this.BateauId() + "est constitué de";
    }
}