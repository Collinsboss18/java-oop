/**
 * 
 */
package composition;

/**
 * @author Collins Abadaike
 *
 */
public class Monitor {
	private String model, manufactural;
	private int size;
	private Resolution nativeResolution;
	
	public Monitor(String model, String manufactural, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufactural = manufactural;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + color);
	}
	
	public String getModel() {
		return model;
	}

	public String getManufactural() {
		return manufactural;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

}
