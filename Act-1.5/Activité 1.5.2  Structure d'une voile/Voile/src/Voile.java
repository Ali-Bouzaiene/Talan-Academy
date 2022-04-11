
public class Voile {
    private int val1 ;
    private int val2 ;
    public int val3 ;
    protected int val4 ;
    private boolean enroule ;
    private boolean deroule ;
    
    public Voile (int a, int b, int c) {
	this.val1=a;
	this.val2=b;
	this.val4=c;
}
    public Voile (int c) {
	this.val3=c;
	

}

	public boolean enrouler(boolean enroule) {
	return ( enroule==true)? false : true;      
}

	public boolean derouler(boolean deroule) {
   		return ( deroule==false)? true : false; 
}
}
