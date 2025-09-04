package util.Vec;

public class Vec {
	
	double x;
	double y;
	
	public Vec(x, y) {
		this.x = x;
		this.y = y;
	}
	
	public Vec plus(Vec other) {
		return new Vec(x + other.x, y + other.y);
	}
	
	public Vec times(double factor) {
		return new Vec(x * factor, y * factor);
	}
}