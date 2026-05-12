package JavaYT;

class circle {
	private double r;

	public void setRadius(double radius) {
		r = radius;
	}

	public double getRadius() {
		return r;
	}

	public double getArea() {
		return 3.14 * r * r;
	}

	public double getPerimeter() {
		return 2 * 3.14 * r;
	}

}

public class accessModifier {
	public static void main(String[] args) {
		circle pou = new circle();
		pou.setRadius(4);
		System.out.println("Radius= " + pou.getRadius());
		System.out.println("Area= " + pou.getArea());
		System.out.println("Perimeter= " + pou.getPerimeter());

	}

}
