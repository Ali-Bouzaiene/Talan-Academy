import java.util.HashMap;
import java.util.Map;

public class ManipulationHashMap {

	public static void main(String[] args) {
		Map<String,Integer> nbrMapping = new HashMap<>() ;
		nbrMapping.put("One",1);
		nbrMapping.put("Four",4);
		nbrMapping.put("Two",2);
		nbrMapping.put("Three",3);
		System.out.println(nbrMapping);
		
		Map<String,String> ListP = new HashMap<>() ;
		ListP.put("Steve", "London");
		ListP.put("John", "New York");
		ListP.put("Rajeev", "Bengaluru");	
		System.out.println(ListP);
		System.out.println("le tableau ListP est vide: "+ListP.isEmpty());
		System.out.println("la taille du tableau: "+ListP.size());
		System.out.println(ListP.containsKey("Steve"));
		System.out.println(ListP.containsValue(2));
		System.out.println(nbrMapping.containsValue(2));
		System.out.println(ListP.get("Steve"));
		ListP.put("Steve", "Tunis");
		System.out.println(ListP);
		ListP.remove("John");
		System.out.println(ListP);
		ListP.remove("Rajeev", "Bengaluru");
		System.out.println(ListP);
	}

}
