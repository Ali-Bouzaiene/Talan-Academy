
public class Main {

	public static void main(String[] args) {
		Dog dog= DogFactory.getDog("small");
			dog.parler();
			
			dog= DogFactory.getDog("big");
			dog.parler();
			
			dog= DogFactory.getDog("working");
			dog.parler();

	}

}
