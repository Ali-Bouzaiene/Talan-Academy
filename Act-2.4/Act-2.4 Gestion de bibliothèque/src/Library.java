import java.util.ArrayList;
import java.util.Scanner;

public class Library extends Book {
	
	private int id,numTel;
	private String name, address;
	ArrayList<Book> tabBook = new ArrayList<Book>();
	ArrayList<Rent> tabRent = new ArrayList<Rent>();
	
		void Library (int id,int numTel,String name,String address) {
			this.id=id;
			this.numTel=numTel;
			this.name=name;
			this.address=address;
		}
		
		void Library () {
			
		}

		//getter_setter
		public int getId() {
			return id;
		}

		public void setId() {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer un id de la Library");
			int i = input.nextInt();
			this.id = i;
		}

		public int getNumTel() {
			return numTel;
		}

		public void setNumTel() {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer un numero de telephone de Library");
			int nTel = input.nextInt();
			this.numTel = nTel;
		}

		public String getName() {
			return name;
		}

		public void setName() {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer le name de Library");
			String n = input.nextLine();			
			this.name = n;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress() {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer l'address de Library ");
			String ad = input.nextLine();	
			this.address = ad;
		}

		public ArrayList<Book> getTabBook() {
			return tabBook;
		}

		public void setTabBook(ArrayList<Book> tabBook) {
			this.tabBook = tabBook;
		}
		
		 public ArrayList<Rent> getTabRent() {
			return tabRent;
		}

		public void setTabRent(ArrayList<Rent> tabRent) {
			this.tabRent = tabRent;
		}

		public void ajoutLivre() {
			 for(int i=0;i<tabBook.size();i++) {
				 tabBook.get(i).afficherLivre();
					}
		 }
}
