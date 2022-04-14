import java.util.Scanner;
public class Ours extends Predateur implements OursAction {
	
	protected int fAgrsvt ;
	protected int P ;
	protected String hivernation;
	public Ours(int fAgrsvt,int P,String hivernation) {
		this.fAgrsvt=fAgrsvt;
		this.P=P;
		this.hivernation=hivernation;		
	}
	public Ours(String sexe, String age, int force, String groupe) {
				super( sexe, age, force, groupe);
	}
	public Ours() {
		
}

	public int getfAgrsvt() {
		return this.fAgrsvt=fAgrsvt;
	}
	public void setfAgrsvt() {
		Scanner input = new Scanner(System.in);
		System.out.println("donner un facteur d'agressivité de 0 à10");
		int f=input.nextInt();
		do {			
			if((f>=0)&&(f<=10)) {
				this.fAgrsvt=f;
				
			}
			else {
				System.out.println("facteur non adéquat");
			}
			}while(fAgrsvt==0);
			
		
	}
	public int getP() {
		return this.P =P;
	}
	public void setP() {
		Scanner input = new Scanner(System.in);
		System.out.println("donner sa puissance ");
		int P=input.nextInt();
		
		this.P=P;
			
	}
	public String getHivernation() {
		return this.hivernation=hivernation;
	}
	public void setHivernation() {
		Scanner input = new Scanner(System.in);
		System.out.println("donner le Statut d'hivernation");
		String Sh=input.nextLine();		
				
			if((Sh.equals("été") || Sh.equals("printemps")|| Sh.equals("automne"))) {
				System.out.println("terminée");
				
			}
			else {
				System.out.println("en cours");
			}
			
	}
	
	
	@Override
	public void Chasser() {			
		System.out.print("l'ours chasse les animaux");
	}
	@Override
	public void Courrir() {				
		System.out.print("l'ours court pour chasser les animaux");
	}
	@Override
	public void Emettre_un_son(int son) {				
		switch (son) {
		  case 1:
			  System.out.print("Exprimer la peur");
		    break;
		  case 2:
			  System.out.print("Exprimer sa présence");
		    break;
		  case 3:
			  System.out.print("Effrayer un autre prédateur");
		    break;
		  default:
			  System.out.print("Exprimer l’agressivité");
		}
	}
	@Override
	public void CrctOurs() {
		System.out.println("les carracteristiques de cet ours sont"+" "+"age:"+" "+this.getAge()+" "+"Un facteur d'agressivité :"+" "+this.getfAgrsvt()+" "+"la puissance :"+" "+this.getP()+" "+"Statut d'hivernation :"+" "+this.getHivernation());
		
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