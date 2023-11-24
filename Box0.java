
public class Box0 {
	
	private int absHG;
	private int ordHG;
	private int absBD;
	private int ordBD;
	
	public Box0() {}
		
	public Box0(int absHG, int ordHG, int absBD, int ordBD) {
		this.absHG = absHG;
		this.absBD = absBD;		
		this.ordHG = ordHG;
		this.ordBD = ordBD;
	}
	
	public String toString() {
		return "(" + absHG + ", " + ordHG + 
				") -- (" + absBD + ", " + ordBD + ")";
	}
	
	void translate(int vx, int vy) {
		this.absBD+=vx;
		this.absHG+=vx;
		this.ordBD+=vy;
		this.ordHG+=vy;
	}

}
