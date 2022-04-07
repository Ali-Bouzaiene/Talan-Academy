import java.util.Scanner;

public class compterButin {
	public static void main(String[] args) {
		Scanner scannerNbr = new Scanner(System.in);
		Scanner scannerCalcul = new Scanner(System.in);
		Scanner scannerRes = new Scanner(System.in);
		int result = 0;
		String res="";
		do {
			System.out.print("Veuillez saisir un nombre:");
			int num1 = scannerNbr.nextInt();
			System.out.print("Veuillez saisir un deuxième nombre:");
			int num2 = scannerNbr.nextInt();
			System.out.print("Saisissez votre mode de calcul:");
			String Operation = scannerCalcul.nextLine();
			if (Operation.equals("+")) {
				result += num1 + num2;
			} else if (Operation.equals("-")) {
				result += num1 - num2;
			} else if (Operation.equals("/")) {
				result += num1 / num2;
			} else if (Operation.equals("*")) {
				result += num1 * num2;
			}

			System.out.println(
					"Résultat total : " + result + ". Continuez ? (tapez 'Oui' pour continuer et 'Non' pour Sortir)");
			res = scannerRes.nextLine().toLowerCase();
		} while (res.equals("oui"));
		System.out.println("Merci, à bientôt l'ami !");
	}
}