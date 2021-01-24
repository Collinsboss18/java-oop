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
	
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Current gear changed to " + this.currentGear);
	}
	
	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.println("Car velocity = " + speed + " direction = " + direction);
	}
	
}
