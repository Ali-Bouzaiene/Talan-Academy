import java.util.Scanner;
public class Lion extends Predateur implements LionAction,PredateurAction {
	 
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
	public void setFacteur () {
		 do {
		Scanner scanne = new Scanner(System.in);
		System.out.println("donner le facteur de dommination : d pour domminat et Nd si non dominant");
		String fact_dom=scanne.nextLine();
		
		if(fact_dom.equals("d")) {
			this.facteur="dominant";
		}
		else if (fact_dom.equals("nd")) {
			this.facteur="non dominant";
			
		}
		else {System.out.println("choix erron�");}
		 }while(facteur==null);
	}
	public String getRang() {
		return this.rang=rang;
	}
	public void setRang() {
		do {
			Scanner scann = new Scanner(System.in);
			System.out.println("donner le rang de domination, A ou B ou g ou o");
			String rang_domin=scann.nextLine();
			
			if(rang_domin.equals("A")) {
				this.rang="Alpha";
			}
			else if (rang_domin.equals("b")) {
				this.rang="BETA";
				
			}
			else if (rang_domin.equals("g")) {
				this.rang="GAMA";
					
				}
			else if  (rang_domin.equals("o")) {
				this.rang="OMEGA";
					
				}
			
			
		}while(rang==null);
	}
	public int getFImpetuosite() {
		return this.fImpetuosite=fImpetuosite;
	}
	public int setFImpetuosite() {
		return this.fImpetuosite=fImpetuosite;
	}
	
	@Override
	public void AfficherCrct() {
		System.out.println("les carracteristiques de ce lion sont"+" "+"age:"+" "+this.getAge()+" "+"Un facteur de domination:"+" "+this.getFacteur()+" "+"Un rang : "+" "+this.getRang());
		
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
