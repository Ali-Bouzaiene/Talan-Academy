import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManipulerArrayList {

	public static void main(String[] args) {		
		ArrayList <String>animaux1= new ArrayList <>();
		animaux1.add("Lion");
		animaux1.add("Tiger");
		animaux1.add("Cat");
		animaux1.add("Dog");
		
		ArrayList <String>animaux2= new ArrayList <>();
		animaux2.add("Lion");
		animaux2.add("Tiger");
		animaux2.add("Elephant");
		animaux2.add("Cat");
		animaux2.add("Dog");
		System.out.println(animaux1);
		System.out.println(animaux2);
	ArrayList <String> List = new ArrayList <>();
		List.addAll(animaux2);
		List.addAll(animaux2);
		System.out.println(List);
		System.out.println("Taille du tableau : "+ List.size());
		List.remove(3);
		System.out.println("Suppression de l'élément en position : 4");
		System.out.println("Suppression de l'élément Cat.");
		System.out.println(List);
		System.out.println("Taille du tableau : "+ List.size());
		List.removeAll(Collections.singleton("Tiger"));
		System.out.println("Suppression de l'animal (nom): Tiger");
		System.out.println("Nouveau tableau : "+List);
		System.out.println("Taille du tableau : "+ List.size());
		System.out.println(List.get(3));
		System.out.println(List.contains("Lion"));
		System.out.println(List.contains("Tiger"));
		Collections.sort(List);
		System.out.println(List);		
		List.sort(Comparator.naturalOrder());	
		
		for ( int i= 0 ; i < List.size()-1; i++ ) {
			for (int j=List.size()-1; j>i;j--) {
				if(List.get(j).compareTo(List.get(j-1))<0) {
					String x = List.get(j);
					List.set(j,List.get(j-1));
					List.set(j-1, x);
					}	
				}
			}
		System.out.println(List);
}
}

