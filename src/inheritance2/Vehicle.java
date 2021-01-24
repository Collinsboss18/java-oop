package inheritance2;

public class Vehicle {
	private String name, size;
	private int currentDirection, currentVelocity;
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle steering at " + currentDirection + " degree");
	}
	
	public void move(int velocity, int direction) {
		this.currentVelocity = velocity;
		this.currentDirection = direction;
		System.out.println("Vehicle moving at " + currentVelocity + " in direction " + currentDirection);
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}
	
	public void stop() {
		this.currentVelocity = 0;
	}

}
