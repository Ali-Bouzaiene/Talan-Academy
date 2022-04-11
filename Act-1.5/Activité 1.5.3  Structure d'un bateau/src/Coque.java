
public class Coque {
	public String coque1 ;
	public String type ;
	public int id=2;
	
    public Coque (String coque1, String color) {
    	this.coque1=coque1;
    	this.type=color;
}
    public Coque () {

    }
    public int  CoqueId () {
    	return this.id=id;
    }
    public String toString() {
        return "La coque n°" + this.CoqueId();
    }
}
