
public class Pont {
	public String materiel ;
	public String type ;
	public int id=3;	
	public Mat Mat;
	public Voile Voile;
    public Pont (String materiel, String type) {
    	this.materiel=materiel;
    	this.type=type;
    	
}
    public Pont () {

    }
    public int  PontId () {
    	return this.id=id;
    }
    public String  toString () {
    	return "Le pont n°" + this.PontId() ;
    }
}
