
public class Roman extends Livre {
	int NbrCh;
	String resume;
    public Roman(String titre, String auteur, int NbrP,float prix) {
        super(titre, auteur, prix, NbrP);       
        this.NbrCh=NbrCh;
        this.resume =resume;
    }
    public void setNbrCh(int NbrCh) {
        this.NbrCh = NbrCh;
    }
    public int getNbrCh() {
        return this.NbrCh;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
    public String getResume() {
        return this.resume;
    }
}
