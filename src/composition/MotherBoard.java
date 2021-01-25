/**
 * 
 */
package composition;

/**
 * @author Collins Abadaike
 *
 */
public class MotherBoard {
	private String model, manufactural, bios;
	private int ramSlots, cartSlots;
	
	public MotherBoard(String model, String manufactural, String bios, int ramSlots, int cartSlots) {
		super();
		this.model = model;
		this.manufactural = manufactural;
		this.bios = bios;
		this.ramSlots = ramSlots;
		this.cartSlots = cartSlots;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program: " + programName + " is now loading.");
	}
	
	public String getModel() {
		return model;
	}
	
	public String getManufactural() {
		return manufactural;
	}
	
	public String getBios() {
		return bios;
	}
	
	public int getRamSlots() {
		return ramSlots;
	}
	
	public int getCartSlots() {
		return cartSlots;
	}

}
