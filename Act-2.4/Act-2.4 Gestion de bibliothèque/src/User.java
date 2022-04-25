import java.util.ArrayList;
import java.util.Scanner;
public class User {
	private int id,numTel;
	private String prenom,nom,address,mail;
	ArrayList<Book> TRent = new ArrayList<>();
	
		void User(int id,int numTel,String prenom,String nom,String address,String mail) {
				this.id=id;
				this.numTel=numTel;
				this.prenom=prenom;
				this.nom=nom;
				this.address=address;
				this.mail=mail;
		}
		void User () {
			
		}
		
		//getter_setter
		public int getId() {
			return id;
		}
		public void setId(int id) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer un id de l'utilisateur");
			int i = input.nextInt();
			this.id = i;
		}
		public int getNumTel() {
			return numTel;
		}
		public void setNumTel(int numTel) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer un numero de telephone de l'utilisateur");
			int nTel = input.nextInt();
			this.numTel = nTel;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer le prenom de l'utilisateur");
			String pr = input.nextLine();
			this.prenom = pr;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer le nom de l'utilisateur");
			String n = input.nextLine();			
			this.nom = n;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer l'address de l'utilisateur ");
			String ad = input.nextLine();	
			this.address = ad;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer un mail de l'utilisateur ");
			String m = input.nextLine();	
			this.mail = m;
		}
		
		void afficherUser () {
	        System.out.println("Prénom: " + getPrenom());
	        System.out.println("Nom: " + getNom());
	        System.out.println("Adresse: " + getAddress());
	        System.out.println("Tél: " + getNumTel());
	        System.out.println("E-mail: " + getMail());
			for(int i=0;i<TRent.size();i++) {
				TRent.get(i).afficherLivre();
				}
		}
		
		public ArrayList<Book> getTRent() {
			return TRent;
		}
		public void setTRent(ArrayList<Rent> tRent) {
			TRent = TRent;
		}
		void verifInstanceUser () {
		
		}
	
}
