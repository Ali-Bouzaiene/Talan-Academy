
public class Lion implements LionAction,PredateurAction {
	 
	protected String facteur ;
	protected String rang ;
	protected int fImpetuosite;
	public void Lion (String facteur ,String rang,int fImp�tuosite ) {
		this.facteur=facteur;
		this.rang=rang;
		this.fImpetuosite=fImpetuosite;		
	}
	
	public void Lion () {
		
	}
	
	public String getFacteur (){
		return this.facteur=facteur;
	}
	public String setFacteur () {
		return this.facteur=facteur;
	}
	public String getRang() {
		return this.rang=rang;
	}
	public String setRang() {
		return this.rang=rang;
	}
	public int getFImpetuosite() {
		return this.fImpetuosite=fImpetuosite;
	}
	public int setFImpetuosite() {
		return this.fImpetuosite=fImpetuosite;
	}
	
	@Override
	public void AfficherCrct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Rugir() {
		System.out.print("le lion �mettre un son : Pour communiquer avec ses semblables");		
	}

	@Override
	public void Entendre() {
		System.out.print("le lion entendre un son (s�il ne dort pas et n�est pas malade)");
		
	}

	@Override
	public void s�parer() {
		System.out.print("le lion se s�pare temporairement de son groupe");
		
	}

	@Override
	public void Se_nourrir() {
		System.out.print("le lion mange les animaux");
		
	}

	@Override
	public void Chasser() {
		System.out.print("le lion chasse les animaux");
		
	}

	@Override
	public void Courrir() {
		System.out.print("le lion court pour chasser les animaux");
		
	}

	@Override
	public void Se_reproduire() {
		System.out.print("le lion se reproduit pour augmanter la famille");
		
	}

	@Override
	public void Emettre_un_son() {
		System.out.print("le lion emettre un son pour dissuader d'autres pr�dateurs");
		
	}

}
