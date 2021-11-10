package exemplo_1;

import pt.iul.ista.poo.gui.ImageMatrixGUI;

public class GameLauncher {
	public static void main(String[] args) {
		
		ImageMatrixGUI gui = ImageMatrixGUI.getInstance();
		gui.setSize(1360, 740);
		gui.go();
		
		GameEngine game = new GameEngine();
		gui.registerObserver(game);
		game.start();
	}
}
