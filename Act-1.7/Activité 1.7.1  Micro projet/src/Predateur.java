import java.util.Scanner;
public abstract class Predateur implements PredateurAction {
	
	protected String sexe ;
	protected String age ;
	protected int force ;
	protected String groupe ;
	
	public Predateur(String sexe, String age, int force, String groupe) {
		this.sexe=sexe;
		this.age=age;
		this.force=force;
		this.groupe=groupe;
	}
	public Predateur() {
		
	}

	
	public String getSexe() {
		return this.sexe;
	}
	public void setSexe() {
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("donner le sexe de ce Predateur");
			String S=input.nextLine();
			if(S.equals("M")) {
				this.sexe = "Male";
				
			}
			else if(S.equals("F")) {
				this.sexe="femelle";
			}
			
			else { System.out.println("choix erroné");}
		}while(sexe==null);
		
	}
	public String getAge() {
		return this.age=age;
	}
	public void setAge() {
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("donner l'age de ce predateur");
			String A=input.nextLine();
			if(A.equals("J")) {
				 this.age = "jeune";
			}
			else if(A.equals("A")) {
				 this.age="Adulte";
			}
			
			else if(A.equals("V")) {
				 this.age="Vieux";
			}
			
			else  { System.out.println("choix erroné");
			}
			
		}while(age==null);
	}
	public int getForce() {
		return this.force;
	}
	public void setForce() {
		do {
			Scanner inp = new Scanner(System.in);
			System.out.println("donner la force de ce predateur:Max 200 et Min 30");
			int F=0;
			F=inp.nextInt();
			if((F<200)&&(F>30)) {
				this.force=F;
				
			}
			else {
				System.out.println("fausse force");
			}
			
		}while(this.force==0);
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