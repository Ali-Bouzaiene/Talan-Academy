import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrer un Nonbre");
		int Nbr = input.nextInt();
		
			try {
				if (Nbr>10 && Nbr<30) {
				System.out.print("le nombre est dans l'intervalle donné");
					}
				else {
					throw  new Exception("The value is not in the allowed interval");
				}
				}
			catch (Exception e) {
	            e.printStackTrace();
	        }

	}

}

