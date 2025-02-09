package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import model.Position;

public class Affichage extends JPanel{
	
	private Position position;

	public static final int RATIO_X = 3;
	public static final int RATIO_Y = 3;

	
	public static final int LARGEUR = (Position.getBefore() + Position.getAfter()) * RATIO_X;
	public static final int HAUTEUR = (Position.getHauteurMax() - Position.getHauteurMin()) * RATIO_Y;

	public static final int POSITION_X = Position.getBefore() * RATIO_X - (Position.getHauteurOval() / 2);

	

	public Affichage(Position position) {
		this.position = position;
		setPreferredSize(new Dimension(LARGEUR, HAUTEUR));
	}

	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int x = POSITION_X;
		int y = (Position.getHauteurMax() - position.getHauteur() - Position.getHauteurOval()) * RATIO_Y;
        g.setColor(Color.BLACK);
        g.drawOval(x, y, Position.getHauteurOval(), Position.getHauteurOval());
        
	}

}
