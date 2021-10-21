package ex6_1;

public abstract class AbstractFigure implements Figure{
	private int x,y;
	
	public AbstractFigure(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	

	@Override
	public String toString() {
		return "(x,y)=("+x+","+y+")  A="+area()+"  P="+perimeter();
	}
}
