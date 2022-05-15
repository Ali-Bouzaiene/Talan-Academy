
public class DAOfactory {
		public static UtilisateurDAOImpl  getUtilisateurDAO() {
			return new  UtilisateurDAOImpl ();
		}
		
		public static AnnonceDAOImpl  getAnnonceDAO() {
			return new  AnnonceDAOImpl ();
		}
		
		public static FavorisDaoImpl  getFavorisDAO() {
			return new  FavorisDaoImpl ();
		}
		
		public static RechercheDaoImpl  getRechercheDAO() {
			return new  RechercheDaoImpl ();
		}
}
