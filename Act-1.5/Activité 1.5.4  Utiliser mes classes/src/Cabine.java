
public class Cabine {
	public String materiel ;
	public String type ;
	public int id=4;
	
    public Cabine (String materiel, String type) {
    	this.materiel=materiel;
    	this.type=type;
}
    public Cabine () {

    }
    public int  CabineId () {
    	return this.id=id;
    }
    public String toString () {
    	return "Le Cabine n°" + this.CabineId();
    }
}
