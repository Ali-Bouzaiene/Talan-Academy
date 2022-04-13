
public abstract class Predateur implements PredateurAction {
	
	protected String sexe ;
	protected String categorie ;
	protected String force ;
	protected String groupe ;
	
	public Predateur(String sexe, String categorie, String force, String groupe) {
		this.sexe=sexe;
		this.categorie=categorie;
		this.force=force;
		this.groupe=groupe;
	}
	public Predateur() {
		
	}

	
	public String getSexe() {
		return this.sexe;
	}
	public String setSexe() {
		return this.sexe;
	}
	public String getCategorie() {
		return this.categorie;
	}
	public String setCategorie() {
		return this.categorie;
	}
	public String getForce() {
		return this.force;
	}
	public String setForce() {
		return this.force;
	}
	public String getGroupe() {
		return this.groupe;
	}
	public String setGroupe() {
		return this.groupe;
	}
	@Override
	public void Se_nourrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Chasser() {
		System.out.print("le Predateur chasse les animaux");
		
	}

	@Override
	public void Courrir() {
		System.out.print("le Predateur court pour chasser les animaux");
		
	}

	@Override
	public void Se_reproduire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Emettre_un_son() {
		// TODO Auto-generated method stub
		
	}
	
}