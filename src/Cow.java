
public class Cow extends Animal {

	public Cow(String name1) {
		super(name1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSound() {
		return "moo";
	}

	@Override
	public boolean hasWings() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumLegs() {
		// TODO Auto-generated method stub
		return 4;
	}

}
