package main;

import controler.Descendre;
import controler.ReactionClic;
import controler.Redessine;
import javax.swing.JFrame;
import model.Position;
import view.Affichage;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame maFenetre = new JFrame("Exercice 1");
		Position p = new Position();
		Affichage affichage = new Affichage(p);
		ReactionClic reactionClic = new ReactionClic(p);
		affichage.addMouseListener(reactionClic);
		
		maFenetre.add(affichage);
		maFenetre.pack();
		maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFenetre.setVisible(true);
		
		Redessine redessine = new Redessine(affichage);
		redessine.start();
		
		Descendre descendre = new Descendre(p);
        descendre.start();

	}

}
