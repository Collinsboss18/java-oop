package oop;

public class Cube {
	int length, breath, height;
	
	// TODO Default Constructor
	Cube () {
		System.out.println("We are in constructor");
		length = 10;
		breath = 10;
		height = 10;
	}
	
	// TODO Constructor Overloading
	/** 
	 * @param int length
	 * @param int breath
	 * @param int height
	 */
	Cube (int length, int breath, int height) {
		System.out.println("Constructor overloading");
		this.length = length;
		this.breath = breath;
		this.height = height;
	}
	
	public int getCubeVolume() {
		return (length*breath*height);
	}
	
	public static String doSomething(String s) {
		return s;
	}

}
