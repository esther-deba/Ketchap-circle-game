package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import model.Parcours;
import model.Position;

public class Affichage extends JPanel{
	
	private Position position;
	private Parcours parcours;

	public static final int RATIO_X = 3;
	public static final int RATIO_Y = 3;

	
	public static final int LARGEUR = (Position.getBefore() + Position.getAfter()) * RATIO_X;
	public static final int HAUTEUR = (Position.getHauteurMax() - Position.getHauteurMin()) * RATIO_Y;

	public static final int POSITION_X = Position.getBefore() * RATIO_X - (Position.getHauteurOval() / 2);

	

	public Affichage(Position position, Parcours parcours) {
		this.position = position;
		this.parcours = parcours;
		setPreferredSize(new Dimension(LARGEUR, HAUTEUR));

	}

	// Méthode pour dessiner le parcours
	private void dessinerParcours(Graphics g) {
		g.setColor(Color.BLACK);
		for (int i = 0; i < parcours.getPoints().size() - 1; i++) {
			int x1 = parcours.getPoints().get(i).x * RATIO_X;
			int y1 = (Position.getHauteurMax() - parcours.getPoints().get(i).y) * RATIO_Y;
			int x2 = parcours.getPoints().get(i + 1).x * RATIO_X;
			int y2 = (Position.getHauteurMax() - parcours.getPoints().get(i + 1).y) * RATIO_Y;
			g.drawLine(x1, y1, x2, y2);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int x = POSITION_X;
		int y = (Position.getHauteurMax() - position.getHauteur() - Position.getHauteurOval()) * RATIO_Y;
        g.setColor(Color.BLACK);
        g.drawOval(x, y, Position.getHauteurOval(), Position.getHauteurOval());
        
		dessinerParcours(g);
	}

}
