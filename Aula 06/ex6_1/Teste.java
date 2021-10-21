package ex6_1;

public class Teste {
	
	public static void main(String[] args) {
		
		Canvas canvas = new Canvas();
		
		canvas.addFigure(new Rectangle(5,2,100,30));
		canvas.addFigure(new Rectangle(0,0,20,40));
		canvas.addFigure(new Rectangle(0,0,10,10));
		canvas.addFigure(new Circle(0,0,1));
		canvas.addFigure(new Circle(0,0,5));
		canvas.addFigure(new Circle(0,0,100));
		
		System.out.println(canvas);
		
		System.out.println("A maior figura é: "+canvas.largestFigure());
		canvas.removeLargest();
		System.out.println(canvas);
//		AbstractFigure r = new Rectangle(5,2,100,30);
//		AbstractFigure c = new Circle(4,2,10);
//		System.out.println(r);
//		System.out.println(c);
	}
}
