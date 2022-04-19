 
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class SeLit {
	public static void main (String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ali\\Desktop\\talan\\Act-2.2\\Act-2.2.5  Lecture écriture fichier\\src\\SeLit.java"));
			String line;
			while ((line = in.readLine()) != null) {
		      
   			  System.out.println (line);
			}
			in.close();
 
        }
}