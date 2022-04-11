import java.util.Scanner;
import java.util.Arrays;
	public class searchrec {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array range");
			int size = sc.nextInt();
			int[] tab = new int[size];
			System.out.println("Enter the elements of the array ::");
			int i;
			for(i=0; i<size; i++) {
			tab[i] = sc.nextInt();
			}

				for(i=0; i<size; i++) {
				System.out.print(tab[i] );
				}
		Scanner input = new Scanner(System.in);
		System.out.print("Entrer un nombre");
		int x = input.nextInt();
		i=0;
		if (search(tab, x, i)){
			System.out.print("true");
			}else{
			System.out.print("false");
			}
		}

	private static boolean search(int [] tab,int nbr,int i ){		
		boolean a=false;		
		if (tab[i]==nbr){
			a=true;}			
		else if (a==false && i<tab.length-1){
			return search(tab,nbr,i+1);
			}
		return a;
	}
}