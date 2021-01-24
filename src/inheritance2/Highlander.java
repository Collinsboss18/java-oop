package inheritance2;

public class Highlander extends Car {
	private int roadServiceMonths;

	public Highlander(int roadServiceMonths) {
		super("Highlander", "3M", 4, 4, 3, true);
		this.roadServiceMonths = roadServiceMonths;
	}

	

}
