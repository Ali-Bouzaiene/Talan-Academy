import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Lion L1=new Lion();
	    L1.setSexe();	    
	    L1.setAge();
	    L1.setForce();
	    L1.setFacteur();
	    L1.setRang();
	    L1.AfficherCrct();	
	    
		Lion L2=new Lion();
	    L2.setSexe();	    
	    L2.setAge();
	    L2.setForce();
	    L2.setFacteur();
	    L2.setRang();
	    L2.AfficherCrct();
	    
		Lion L3=new Lion();
	    L3.setSexe();	    
	    L3.setAge();
	    L3.setForce();
	    L3.setFacteur();
	    L3.setRang();
	    L3.AfficherCrct();
	    
	    GroupePredateur GP=new GroupePredateur();	
	    GP.setZone();
	    
		GroupeLion GL=new GroupeLion();			
		GL.ajouterL(L1);
		GL.ajouterL(L2);
		GL.ajouterL(L3);		
		GL.afficherGroupe();
		GP.afficherPropresCrct();

	}

}
