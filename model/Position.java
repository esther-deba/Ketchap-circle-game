package model;

public class Position {

    private int hauteur = 0; 
    private double vitesse = 0;

    public static final int IMPULSION = 3; 
    public static final int HAUTEUR_MAX = 150; 
    public static final int HAUTEUR_MIN = 0; 
	public static final int HAUTEUR_OVAL = 50;
	public static final int BEFORE = 50;
	public static final int AFTER = 200;

    private int avancement = 0; // Représente la position en x de l'ovale 

    public int getHauteur() {
        return hauteur;
    }

    public int getAvancement() {
        return avancement;
    }

    public void jump() {
        if (hauteur < HAUTEUR_MAX) { // Vérifie si on peut encore sauter
            vitesse = IMPULSION; // Définit la vitesse verticale
        }
    }

    // Accesseur move : met à jour la hauteur en fonction de la vitesse et applique une gravité
    public void move() {
        hauteur += vitesse; 
        vitesse -= 0.3; 
        avancement += 1; // On avance de 1 en x
        // Vérifie si la hauteur dépasse les limites
        if (hauteur > HAUTEUR_MAX) {
            hauteur = HAUTEUR_MAX;
            vitesse = 0;
        }
        if (hauteur - HAUTEUR_OVAL < HAUTEUR_MIN) {
            hauteur = HAUTEUR_MIN + HAUTEUR_OVAL;
            vitesse = 0;
        }
    }

}
