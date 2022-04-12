
public class MusiqueImpl implements Musique {
	private String titre;
	private String autheur;
	private String interprete,genre;
	
	public MusiqueImpl(String titre, String autheur, String interprete, String genre) {
		this.titre=titre;
		this.autheur=autheur;
		this.interprete=interprete;
		this.genre=genre;
	}
	
	public String getTitre() {
		return this.titre;
	}
	public String setTitre() {
		return this.titre;
	}
	public String getAutheur() {
		return this.autheur;
	}
	public String setAutheur() {
		return this.autheur;
	}
	public String getInterprete() {
		return this.interprete;
	}
	public String setInterprete() {
		return this.interprete;
	}
	public String getGenre() {
		return this.genre;
	}
	public String setGenre() {
		return this.genre;
	}
	@Override
	public void afficherMus() {
		System.out.println(titre);		
	}

	@Override
	public boolean verifMus(MusiqueImpl titre1, MusiqueImpl titre2) {		
		return (titre1==titre2)? true : false;
	}

}
