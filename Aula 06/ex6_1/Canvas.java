package ex6_1;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	
	private List<AbstractFigure> figures = new ArrayList<>();
	
	public void addFigure(AbstractFigure f) {
		figures.add(f);
	}
	
	public void removeFigure(AbstractFigure f) {
		figures.remove(f);
	}
	
	public AbstractFigure largestFigure() {
		
//		figures.sort((f1,f2) -> (int)(f2.area() - f1.area()));
//		return figures.get(0);
		
		double maxArea = 0;
		
		AbstractFigure fMax = null;
		
		for(AbstractFigure f : figures)
			if(f.area() > maxArea) {
				maxArea = f.area();
				fMax = f;
			}
		return fMax;		
	}
	
	public void removeLargest() {
		removeFigure(largestFigure());
	}
	
	public double totalArea() {
		double total = 0;
		for(AbstractFigure f : figures)
			total += f.area();
		return total;
	}

	@Override
	public String toString() {
		String aux = "";
		for(AbstractFigure f : figures)
			aux+= f + "\n";
		return aux;
	}
	
	

}
