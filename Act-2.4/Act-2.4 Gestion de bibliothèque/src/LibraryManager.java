import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.bibliotehque.ConnectionManager;

public class LibraryManager implements LibraryManagerAction {

	@Override
	public void afficheLivre(Library library) {
        for (Book book : library.getTabBook()) {
            book.afficherLivre();
        }
		
	}

	@Override
	public void ajouterLivre(Book book, Library library) {
        Connection connection = ConnectionManager.getConnection();
        if (connection == null) {
            return;
        }
        if (book.getId() > 0) {

        } else {
        }

        library.getTabBook().add(book);
		
	}
    class trieLivreAuteur implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }

	@Override
	public void trieLivreAuteur(Library library) {		
		Collections.sort(library.getTabBook(), new trieLivreAuteur());
		
	}

	@Override
	public void rechercheLivreId(int id,Library library) {
        for (Book book : library.getTabBook()) {
            if (book.getId() == id) {
                book.afficherLivre();
            }
        }
		
	}

	@Override
	public void rechercheLivreAuteur(String author, Library library) {
        for (Book book : library.getTabBook()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.afficherLivre();
            }
        }
		
	}

	@Override
	public void rechercheLivrePretLibrary(Library library) {
        for (Rent rent : library.getTabRent()) {
            rent.getBook().afficherLivre();
        }
		
	}

	@Override
	public void rechercheLivrePretUser(User user) {
        for (Rent rent : user.getTRent()) {
            rent.getBook().afficherLivre();
        }
	}

	@Override
	public void rechercheUserId(int id, Library library) {
        for (Rent rent : library.getTabRent()) {
            if (rent.getUser().getId() == id) {
                rent.getUser().afficherUser();
            }
        }
		
	}
    class trieRentDesc implements Comparator<Rent> {
        @Override
        public int compare(Rent o1, Rent o2) {
            return o2.getDateFin().compareTo(o1.getDateFin());
        }
    }
	@Override
	public void trieRentDesc(Library library) {
		Collections.sort(library.getTabRent(), new trieRentDesc());
		
	}

	@Override
	public void creerUser(int id, String prenom, String nom, String address, int tel, String mail, ArrayList<Rent> tRent) {
        User user = new User();
        user.setId(id);
        user.setPrenom(prenom);
        user.setNom(nom);
        user.setAddress(address);
        user.setNumTel(tel);
        user.setMail(mail);
        user.setTRent(tRent);
		
	}

	@Override
	public void creerRent(int id, User user, Book book, Date datePret, Date dateFin) {
        Rent rent = new Rent();
        rent.setId(id);
        rent.setUser(user);
        rent.setBook(book);
        rent.setDatePret(datePret);
        rent.setDateFin(dateFin);
		
	}

	@Override
	public void creerBook(int id, String title, String author, String editor, int pages, String summary, int library_id) {
        Connection connection = ConnectionManager.getConnection();
        if (connection == null) {
            return;
        } else {
            String query = "INSERT INTO book (id, title, author, editor, page_nb, summary, library_id) VALUES (?,?,?,?,?,?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, title);
                preparedStatement.setString(3, author);
                preparedStatement.setString(4, editor);
                preparedStatement.setInt(5, pages);
                preparedStatement.setString(6, summary);
                preparedStatement.setObject(7, library_id);

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
		
	}

}
