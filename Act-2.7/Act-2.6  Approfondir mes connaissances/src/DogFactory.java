
public class DogFactory {
		
	public static Dog getDog (String crit�res){ 
		if (crit�res.equals("small"))
			return new Caniche();
		if (crit�res.equals("big"))
			return new Rottweiler();
		if (crit�res.equals("working"))
			return new SiberianHusky();
		return null;
}
}