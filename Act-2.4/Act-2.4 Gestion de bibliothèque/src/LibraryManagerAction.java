import java.sql.Date;
import java.util.ArrayList;

public interface LibraryManagerAction {
	void afficheLivre(Library library);
	void ajouterLivre(Book book, Library library);
	void trieLivreAuteur(Library library);
	void rechercheLivreId(int id,Library library);
	void rechercheLivreAuteur(String author, Library library);
	void rechercheLivrePretLibrary(Library library);
	void rechercheLivrePretUser(User user);
	void rechercheUserId(int id, Library library);
	void trieRentDesc(Library library);
	void creerUser(int id, String prenom, String nom, String address, int tel, String mail, ArrayList<Rent> TRent);
	void creerRent(int id, User user, Book book, Date datePret, Date dateFin);
	void creerBook(int id, String title, String author, String editor, int pages, String summary, int library_id);
	
}
