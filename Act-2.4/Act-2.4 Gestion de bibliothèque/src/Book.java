import java.util.Scanner;

public class Book {
	
	private int id,pageNb;
	private String title, author,editor,summary,Library  ;
	
		void Book(int id,int pageNb,String title,String author,String editor,String summary,String Library ) {
			this.id=id;
			this.pageNb=pageNb;
			this.title=title;
			this.author=author;
			this.editor=editor;
			this.summary=summary;
			this.Library=Library;
		}
		
		void Book () {			
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

		public int getPageNb() {
			return pageNb;
		}

		public void setPageNb(int pageNb) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer le nombre des pages de book");
			int Np = input.nextInt();
			this.pageNb = Np;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer le titre de book");
			String titre = input.nextLine();
			this.title = titre;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer le author de book");
			String au = input.nextLine();
			this.author = au;
		}

		public String getEditor() {
			return editor;
		}

		public void setEditor(String editor) {
			Scanner input = new Scanner(System.in);
			System.out.println("Entrer l'editor de book");
			String ed = input.nextLine();
			this.editor = ed;
		}

		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getLibrary() {
			return Library;
		}

		public void setLibrary(String library) {
			Library = library;
		}
		
			void afficherLivre () {
		        System.out.println("Titre: " + getTitle());
		        System.out.println("Auteur: " + getAuthor());
		        System.out.println("Edité par: " + getEditor());
		        System.out.println("Nombres de pages: " + getPageNb());
		        System.out.println("Librairie: " + getLibrary());
		        System.out.println("Résumé: " + getSummary());

			}
			
			void verifInstance () {
				
			}


	
}
