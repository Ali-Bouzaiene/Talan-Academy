import java.sql.Date;

public class Rent {
	
	private int id;
	private User user;
	private Book book;
	private Date DatePret, DateFin;
		
		void Rent (int id,User user,Book book,Date DatePret,Date DateFin) {
			this.id=id;
			this.user=user;
			this.book=book;
			this.DatePret=DatePret;
			this.DateFin=DateFin;
		}
		
		void Rent () {
			
		}
		//getter_setter
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		public Date getDatePret() {
			return DatePret;
		}

		public void setDatePret(Date DatePret) {
			DatePret = DatePret;
		}

		public Date getDateFin() {
			return DateFin;
		}

		public void setDateFin(Date DateFin) {
			DateFin = DateFin;
		}
		
		void afficherPret() {
				  System.out.println("User: "+ getUser().getPrenom()+" "+getUser().getNumTel());
			        System.out.println("Livre: " + getBook().getTitle());
			        System.out.println("Date prêt: " + getDatePret());
			        System.out.println("Date fin: " + getDateFin());			       
			}
}
