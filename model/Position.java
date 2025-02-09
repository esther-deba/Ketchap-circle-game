package model;

public class Position {

    private int hauteur = 0; 
    private int vitesse = 0;

    private static final int HAUTEUR = 10; 
    private static final int IMPULSION = 10; 

    private static final int HAUTEUR_MAX = 150; 
    private static final int HAUTEUR_MIN = 0; 
	private static final int HAUTEUR_OVAL = 100;
	private static final int BEFORE = 50;
	private static final int AFTER = 200;


    public int getHauteur() {
        return hauteur;
    }

	public static int getBefore() {
		return BEFORE;
	}

	public static int getAfter() {
		return AFTER;
	}

	public static int getHauteurMax(){
		return HAUTEUR_MAX;
	}
    
	public static int getHauteurMin(){
		return HAUTEUR_MIN;
	}

	public static int getHauteurOval(){
		return HAUTEUR_OVAL;
	}
	

    public void jump() {
        if (hauteur < HAUTEUR_MAX) { // Vérifie si on peut encore sauter
            vitesse = IMPULSION; // Définit la vitesse verticale
        }
    }

    // Accesseur move : met à jour la hauteur en fonction de la vitesse et applique une gravité
    public void move() {
        hauteur += vitesse; 
        vitesse -= 1; 

        // Vérifie si la hauteur dépasse les limites
        if (hauteur > HAUTEUR_MAX) {
            hauteur = HAUTEUR_MAX;
            vitesse = 0;
        }
        if (hauteur < HAUTEUR_MIN) {
            hauteur = HAUTEUR_MIN;
            vitesse = 0;
        }
    }

}
