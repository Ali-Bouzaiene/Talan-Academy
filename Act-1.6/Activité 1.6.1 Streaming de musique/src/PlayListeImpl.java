
public class PlayListeImpl implements PlayListe {
	
	private final int MAX_MUSIQUES=11;
	private int nombreTitres ;
	private String nom,genre;
	private MusiqueImpl[] T= new MusiqueImpl[MAX_MUSIQUES];
	
	public PlayListeImpl(int MAX_MUSIQUES, int nombreTitres, String nom, String genre ) {
		
		this.nombreTitres=nombreTitres;
		this.nom=nom;
		this.genre=genre;
	}
		
	public int getMAX_MUSIQUES() {
		return MAX_MUSIQUES;
	}
	public int setMAX_MUSIQUES() {
		return MAX_MUSIQUES;
	}
	public int getnombreTitres() {
		return nombreTitres;
	}
	public int setnombreTitres() {
		return nombreTitres;
	}
	public String getNom() {
		return nom;
	}
	public String setNom() {
		return nom;
	}
	public String getGenre() {
		return genre;
	}
	public String setGenre() {
		return genre;
	}
	@Override
	public void afficher() {
		for(int i = 0 ; i<nombreTitres ; i++) {
			System.out.println(T[i].getTitre());
			
		}
		
	}
	
	@Override
	public void ajouter(MusiqueImpl m) {
		if(nombreTitres<MAX_MUSIQUES) {
			T[nombreTitres]=m;
			this.nombreTitres=this.nombreTitres+1;
		} else {System.out.println("La playliste est pleine, impossible d'ajouter");
			
		}
		
	}

	@Override
	public void eliminer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trierMusiquesPlaylisteAuteur() {
		String[] T = new String [this.nombreTitres];
		for(int i = 0 ; i< this.nombreTitres;i++) {
			T[i]=this.T[i].getAutheur()+" "+this.T[i].getTitre();
		}
		Arrays.sort(T);
		for(int i = 0 ; i< this.nombreTitres;i++) {
			System.out.println(tab[i]);
		}
		
	}

	@Override
	public void trierMusiquesPlaylisteInterprete() {
		// TODO Auto-generated method stub
		
	}





}
