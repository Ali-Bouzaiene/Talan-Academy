
public class Voile {
    private String type ;
    private int val2 ;
    public int id=6 ;    
    private boolean enroule ;
    private boolean deroule ;
    
    public Voile (String type, int b) {
	this.type=type;
	this.val2=b;
	
}
    public Voile () {	

}
    public int VoileId () {
    	return this.id=id;
    }
    
	public boolean enrouler() {
	return ( enroule==true)? false : true;      
}

	public boolean derouler() {
   		return ( deroule==false)? true : false; 
}
    public String  toString () {
    	return "la Voile N°" + this.VoileId();
    }
}
