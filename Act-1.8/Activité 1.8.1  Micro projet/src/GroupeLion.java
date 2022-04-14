import java.util.ArrayList;

public class GroupeLion extends GroupePredateur implements GroupeLionAction {

	ArrayList <Lion>ListLion= new ArrayList <Lion>();
		protected String couple ;
		protected int puissance ;
	public GroupeLion (String couple,int puissance ) {
		 this.couple=couple;
		 this.puissance=puissance;
	}
	public GroupeLion () {
		 
	}
	public String getCouple() {
		return couple;
	}
	public void setCouple(String couple) {
		this.couple = couple;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	@Override
	public void coupleDominant() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reproduction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void déclarerLion() {
		
		
	}
	public void ajouterL(Lion lion) {
		
		ListLion.add(lion);
	}
	public void afficherGroupe() {
		for(int i=0;i<ListLion.size();i++) {
			ListLion.get(i).AfficherCrct();
			}		
}
}
