import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaximumWithoutExceptions {

	public static void main (String args[])   {
        BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
       
        int max = -1;
        String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        
        while (line != null) {
            int n = Integer.parseInt(line);
           
            if (n > max) max = n;
            try {
				line = br.readLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
            
        }
        System.out.println("Maximum = " + max);
    }

}
