package main;

import controler.Descendre;
import controler.ReactionClic;
import controler.Redessine;
import javax.swing.JFrame;
import model.Avancement;
import model.Parcours;
import model.Position;
import view.Affichage;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame maFenetre = new JFrame("Exercice 1");
		Position position = new Position();
		Parcours parcours = new Parcours(position);
		Affichage affichage = new Affichage(position,parcours);
		ReactionClic reactionClic = new ReactionClic(position);
		affichage.addMouseListener(reactionClic);
		
		maFenetre.add(affichage);
		maFenetre.pack();
		maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFenetre.setVisible(true);
		
		Redessine redessine = new Redessine(affichage);
		redessine.start();
		
		Descendre descendre = new Descendre(position);
        descendre.start();

		Avancement avancement = new Avancement(position, parcours);
		avancement.start();

	}

}
