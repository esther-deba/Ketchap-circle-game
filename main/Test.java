package main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
    public static void main(String[] args){
        /* Une fenêtre avec pour titre "Test" */
        JFrame maFenetre = new JFrame("Test");
        /* Un bouton "coucou" qui écrit "coucou" dans la console chaque fois qu'on clique dessus */
        JButton monBouton = new JButton("coucou");
        monBouton.addActionListener(e -> System.out.println("coucou"));
        /* Ajout du bouton à la fenêtre */
        maFenetre.add(monBouton);
        /* Taille de la fenêtre */
        maFenetre.setSize(200, 200);
        /* Fermeture de la fenêtre */
        maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Rendre la fenêtre visible */
        maFenetre.setVisible(true);
        
    }
}
