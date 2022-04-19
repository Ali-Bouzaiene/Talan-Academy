import java.io.File;
import java.util.Scanner;



public class Main  {
     
    private static String[] tab;    
    public static void main(String[] args) {
        file();
    }

    public static void file() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Entrer un lien de répertoire");
    	String rep = input.nextLine();
    	 File file = new File(rep);
            tab = new String[file.list().length];
            tab = file.list();
            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]);
            }
            tab = file.list();
            for (int i = 0; i < tab.length; i++) {
                if (new File(rep + "/" + tab[i]).list() != null) {
                    rep = rep + "/" + tab[i];
                    file = new File(rep);
                    file();
                }
            }
        } 
    }
