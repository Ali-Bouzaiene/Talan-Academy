import java.util.Scanner;
import java.util.Arrays;
	public class position {

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
			Arrays.sort(tab);
				for(i=0; i<size; i++) {
				System.out.print(tab[i] );
				}
		Scanner input = new Scanner(System.in);
		System.out.print("Entrer un nombre");
		int x = input.nextInt();
		int j=0;
		if (tab[searchPos(tab, x, j)] ==x ){
			System.out.print(x +" se trouve dans la position "+ searchPos(tab, x, j));
			}			
			else{
			System.out.print("La valeur recherchée n'existe pas");
			}		
		}

	private static int searchPos(int [] tab,int nbr,int j ){		
				
		boolean a=false;		
		if (tab[j]==nbr){
			a=true;
			 }			
		else if (a==false && j<tab.length-1){			  			
			return searchPos(tab,nbr,j+1);
			}
		return j;
	}
}