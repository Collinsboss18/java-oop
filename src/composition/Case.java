/**
 * 
 */
package composition;

/**
 * @author Collins Abadaike
 *
 */
public class Case {
	private String model, manufactural, powerSupply;
	private Dimensions dimension;
	
	public Case(String model, String manufactural, String powerSupply, Dimensions dimension) {
		super();
		this.model = model;
		this.manufactural = manufactural;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufactural() {
		return manufactural;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimension() {
		return dimension;
	}

}
