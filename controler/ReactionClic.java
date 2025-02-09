package controler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import model.Position;

public class ReactionClic implements MouseListener {

	private Position position;
	public ReactionClic(Position p) {
		this.position = p;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		 position.jump();
		// Replace with an existing method or add the jump() method to the Position class
		// System.out.println("Hauteur = \n" + position.get());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
