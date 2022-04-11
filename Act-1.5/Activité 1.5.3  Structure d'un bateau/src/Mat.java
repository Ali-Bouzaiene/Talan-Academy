
public class Mat {
	public String quality ;
	public int Nbr ;
	private int id=5;
	
    public Mat (String quality, int Nbr) {
    	this.quality=quality;
    	this.Nbr=Nbr;
}
    public Mat () {

    }
    public int  MatId () {
    	return this.id=id;
    }
    public String  toString () {
    	return "Mat n°" + this.MatId();
    }
}
