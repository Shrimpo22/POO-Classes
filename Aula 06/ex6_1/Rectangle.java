package ex6_1;

public class Rectangle extends AbstractFigure {
	
	private double width;
	private double length;
	
	public Rectangle(int x, int y, double width, double length) {
		super(x, y);
		this.length = length;
		this.width = width;
	}

	
	@Override
	public double area() {
		return width*length;
	}

	@Override
	public double perimeter() {
		return 2*(width+length);
	}
	
	@Override
	public String toString() {
		return "Rectangle ["+width+"*"+length+"]" + super.toString();
	}


}
