
public class Ours extends Predateur implements OursAction {
	
	protected int fAgrsvt ;
	protected int P ;
	protected String hivernation;
	public Ours(int fAgrsvt,int P,String hivernation) {
		this.fAgrsvt=fAgrsvt;
		this.P=P;
		this.hivernation=hivernation;		
	}
	public Ours(String sexe, String categorie, String force, String groupe) {
				super( sexe, categorie, force, groupe);
	}
	

	public int getfAgrsvt() {
		return this.fAgrsvt=fAgrsvt;
	}
	public int setfAgrsvt() {
		return this.fAgrsvt = fAgrsvt;
	}
	public int getP() {
		return this.P =P;
	}
	public int setP() {
		return this.P=P;
	}
	public String getHivernation() {
		return this.hivernation=hivernation;
	}
	public String setHivernation() {
		return this.hivernation=hivernation;
	}
	@Override
	public void Chasser() {		
		super.Chasser();
		System.out.print("l'ours chasse les animaux");
	}
	@Override
	public void Courrir() {		
		super.Courrir();
		System.out.print("l'ours court pour chasser les animaux");
	}
	@Override
	public void Emettre_un_son() {		
		super.Emettre_un_son();
		System.out.print("l'ours emettre un son pour dissuader d'autres prédateurs");
	}
	@Override
	public void CrctOurs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Grimper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Creuser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hiverner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hurler() {
		// TODO Auto-generated method stub
		
	}

	
	
}