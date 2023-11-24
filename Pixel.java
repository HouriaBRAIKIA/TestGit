
public class Pixel {
	private int abs;
	private int ord;
	
	public Pixel() {}
	
	public Pixel(int abs, int ord) {
		this.abs = abs; this.ord = ord; 
	}
	
	public String toString() {
		return "("+abs+", "+ord+")";
	}
	
	public void translate(int vx, int vy) {
		this.abs+=vx;
		this.ord+=vy;
	}
}
