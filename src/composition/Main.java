/**
 * 
 */
package composition;

/**
 * @author Collins Abadaike
 * @action Composition
 * 
 * ************************
 */
public class Main {

	public static void main(String[] args) {
		// 
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("021", "Dell", "24000", dimensions);
		
		
		Monitor theMonitor = new Monitor("25inch beast", "Asa", 30, new Resolution(2540, 1440));
		
		MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", "v2.34", 2, 4);
		
		PC thePC = new PC(theCase, theMonitor, theMotherBoard);

	}

}
