package oop;

import java.util.*;

public class MainClass {

	/** 
	 * @Note Recursion is calling a method from itself
	 * EG 4! = 4 x 3 x 2 x 1 
	 */
	public static int factorial (int num) {
		if (num <= 1) return 1;
		else return (num * factorial(num-1));
	}

	public static void main(String[] args) {
		/**
		 * @note static method member belongs to the class instead of a specific instance
		 * 
		 * TODO Package Modifiers
		 * Access Level
		 * 
		 * Modifier     Class package subclass world
		 * public			Y		Y		Y		Y
		 * protected		Y 		Y 		Y 		N
		 * no modifier		Y		Y		N		N
		 * private			Y		N		N		N
		 * 
		 * TODO The Final Keyword
		 * The final keyword has many ways to be used
		 * 
		 * A final class cannot be sub-classed(Extended)
		 * A final method cannot be overwritten by a subclasses
		 * A final variable can only be initialized once
		 * 
		 * @Note Abstract class EG ( public abstract class Bank {} ) cannot be instantiated but can be referenced to
		 * ***** When method are made abstract the parent class must be abstract
		 * ***** When a method is made abstract the implementation of the class must be in the sub-class
		 * 
		 * @Note Interface classes EG ( public interface Bank {} ), cannot be instantiated
		 * ***** All methods/members in a interface class are abstract by default
		 * @Note Interface classes are implemented not extended EG ( public class Bank_ABC implements Bank {} )
		 * 
		 * @Rules
		 * ****** class 	-> class 	 = use extends
		 * ****** interface -> class 	 = use implements
		 * ****** interface -> interface = use extends
		 */
		
		/** Student mark = new Student(); // mark -> object or instance
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(34);
		System.out.println(mark.getName() + " is " + mark.getAge() + " years old."); */
		
		/** Cube cube1 = new Cube();
		System.out.println(cube1.getCubeVolume());	
		
		Cube cube2 = new Cube(20, 20, 20);
		System.out.println(cube2.getCubeVolume()); */
		
		// TODO Accessing static method
		// Cube cube3 = new Cube();
		// System.out.println(Cube.doSomething("Doing something"));
		// System.out.println(factorial(4));
		
		// TODO ArrayList 	
		int simple_array[] = new int[3];
		// using array_list
		ArrayList<Integer> myList = new ArrayList<Integer>(); // 5 -> arrayList initial size
		myList.add(4);
		myList.add(76);
		myList.add(86);
		myList.add(23);
		
		// to change value
		myList.set(0, 34); // 0 -> represents index number. 23 -> new value
		// to remove from list
		myList.remove(3); // 3 -> Represent the index number
		// to clear all values
		// myList.clear();
		
		// for (Integer x: myList) System.out.println(x);
		// System.out.println("List size = " + myList.size());
		
		HashSet<String> name = new HashSet<String>();
		name.add("Collins");
		name.add("Wilson");
		name.add("Collin");
		name.add("Kelvin");
		name.add("Joshua");
		
		name.remove("Collins");
		
		Iterator<String> itr = name.iterator();
		while (itr.hasNext()) System.out.println(itr.next());
		
		
	}

}
