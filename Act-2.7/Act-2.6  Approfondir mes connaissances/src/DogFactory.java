
public class DogFactory {
		
	public static Dog getDog (String critères){ 
		if (critères.equals("small"))
			return new Caniche();
		if (critères.equals("big"))
			return new Rottweiler();
		if (critères.equals("working"))
			return new SiberianHusky();
		return null;
}
}