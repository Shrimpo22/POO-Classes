package exemplo_1;

import pt.iul.ista.poo.gui.ImageTile;
import pt.iul.ista.poo.utils.Point2D;

public class Pinheiro implements ImageTile{

	private Point2D posicao;

	public Pinheiro(Point2D posicao) {
		this.posicao=posicao;
	}
	@Override
	public String getName() {
		return "pine";
	}

	@Override
	public Point2D getPosition() {
		return posicao;
	}

	@Override
	public int getLayer() {
		return 0;
	}

}
