
public class Box {
	
	private Pixel pixelHG;
	private Pixel pixelBD;
	private static int nbBox;
	private int idBox;


	public Box() {
		pixelHG = new Pixel(0,0);
		pixelBD = new Pixel(0,0);
		idBox = ++nbBox;
	}
	
	
	public Box(int absHG, int ordHG, int absBD, int ordBD) {		
		pixelHG = new Pixel(absHG,ordHG);
		pixelBD = new Pixel(absBD,ordBD);
		idBox = ++nbBox;
	}

	public String toString() {
		return "[Box id="+ getId() + "]" + pixelHG.toString() 
		        +  " -- " + pixelBD.toString();
	}
	
	public int getId() {
		return this.idBox;
	}
	
	
}
