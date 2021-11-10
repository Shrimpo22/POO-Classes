package exemplo_1;

import pt.iul.ista.poo.gui.ImageMatrixGUI;
import pt.iul.ista.poo.gui.ImageTile;
import pt.iul.ista.poo.utils.Direction;
import pt.iul.ista.poo.utils.Point2D;

public class Bombeiro implements ImageTile{

	private Point2D posicao;
	
	public Bombeiro(Point2D posicao) {
		this.posicao=posicao;
	}
	
	public void move() {
		int tecla = ImageMatrixGUI.getInstance().keyPressed();
		Direction dir = Direction.directionFor(tecla);
		
		posicao = posicao.plus(dir.asVector());
	}
	@Override
	public String getName() {
		return "fireman";
	}

	@Override
	public Point2D getPosition() {
		return posicao;
	}

	@Override
	public int getLayer() {
		return 1;
	}
	
}
