import java.io.*;
public class ExceptionPropagation1 {

	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert a number:");
        int c = 0;
		try {
			c = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        first(c);
    }

        private static void first(int a) {
            try {
				second(a);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        private static void second(int b) throws Exception {
            Exception propagate = new Exception("The value is too small.");
            if (b < 10) {                
            	throw  new Exception(propagate);
            }else {       	
            	System.out.println("OK");
            }

	}
}


