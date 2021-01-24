package inheritance2;

public class Car extends Vehicle {
	private int wheels, door, gears, currentGear;
	private boolean isManual;
	public Car(String name, String size, int wheels, int door, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.door = door;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	
}
