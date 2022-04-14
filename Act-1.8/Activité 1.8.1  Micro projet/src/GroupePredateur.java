import java.util.ArrayList;
import java.util.Scanner;
public class GroupePredateur implements GroupePredateurAction {
	ArrayList <Predateur>ListP= new ArrayList <Predateur>();
	protected int taille ;
	protected String Zone;
	
	public GroupePredateur (int taille,String Zonr) {
		this.taille=taille;
		this.Zone=Zone;
	}
	public GroupePredateur() {
		
	}
	
		
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = ListP.size();
	}
	public String getZone() {
		return this.Zone;
	}
	public void setZone() {
		Scanner input = new Scanner(System.in);
		System.out.println("donner la zone de ce groupe de Predateur : savannah , serengeti ou Mala Mala");
		String z=input.nextLine();
		this.Zone=z;
	}
	
	@Override
	public void afficherPropresCrct() {
		System.out.println("cette groupe vive dans la zone de :"+" "+this.getZone());
	}		
	
	@Override
	public void enlever() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ajouterP() {	
		
	}
	@Override
	public void afficherCrctCont() {
		// TODO Auto-generated method stub
		
	}
	
	
}
