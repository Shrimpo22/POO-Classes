package exemplo_1;

import java.awt.event.KeyEvent;
import pt.iul.ista.poo.gui.ImageMatrixGUI;
import pt.iul.ista.poo.observer.*;
import pt.iul.ista.poo.utils.Point2D; 

public class GameEngine  implements Observer{

	Bombeiro b;
	ImageMatrixGUI gui = ImageMatrixGUI.getInstance();
	
	public void start() {
		b = new Bombeiro(new Point2D(3,3));
		gui.addImage(b);
		gui.update();
		
		for (int x=0; x!=gui.getGridDimension().getWidth(); x++) {
			for(int y=0; y!=gui.getGridDimension().getHeight(); y++)
				gui.addImage(new Pinheiro(new Point2D(x,y)));
		}
		
	
	}

	@Override
	public void update(Observed source) {
		b.move();
		gui.update();
	}

}
