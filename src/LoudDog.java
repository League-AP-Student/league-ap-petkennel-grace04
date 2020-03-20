
public class LoudDog extends Pet {
	String dog_sound;
	public LoudDog (String petName) {
		super (petName);
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return dog_sound + dog_sound;
	}
}
