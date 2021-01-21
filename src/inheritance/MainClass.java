package inheritance;

public class MainClass {

	public static void main(String[] args) {
		// 
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		
		tri.set_values(3, 5);
		rec.set_values(6, 9);
		
		System.out.println("Area of the triangle = " + tri.area());
		System.out.println("Area of the rectangle = " + rec.area());

	}

}