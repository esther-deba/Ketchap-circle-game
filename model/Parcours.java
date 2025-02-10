package model;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;


public class Parcours {
    private Position position;
    private static final Random RANDOM = new Random();
    private static final int X_MIN = 20;
    private static final int X_MAX = 50;
    // Liste de points 
    private ArrayList<Point> points;

    public Parcours(Position position) {
        points = new ArrayList<>();
        this.position = position;
        genererParcours();
    }

    // Méthode pour générer un parcours aléatoire
    public void genererParcours() {
        int x = Position.BEFORE - X_MAX;
        int y = Position.HAUTEUR_OVAL - Position.HAUTEUR_OVAL/2;

        // Ajout des points de départ
        points.add(new Point(x, y));
        x = Position.BEFORE;
        points.add(new Point(x, y));

        // Génération des points aléatoires
        while (x < Position.AFTER + X_MAX) {
            y =  RANDOM.nextInt(Position.HAUTEUR_MAX - Position.HAUTEUR_MIN ) - Position.HAUTEUR_MIN;
            x += X_MIN + RANDOM.nextInt(X_MAX - X_MIN );
            points.add(new Point(x, y));
        }
    }

    // Je crée une méthode updatePoints qui met à jour les points du parcours
    public void updatePoints() {
        // Suppression des points à gauche de l'écran
        // On vérifie la position corrigée du deuxième point 
        // S'il est en dehors (inférieur à 0), on le supprime
        while(points.size() >= 2 && (points.get(1).x - position.getAvancement() < 0)) {
            points.remove(0);
        }

        // Ajout des points à droite de l'écran

        while((points.get(points.size() - 1).x - position.getAvancement()) < Position.BEFORE + Position.AFTER) {
            Point dernier = points.get(points.size() - 1);
            int newX = dernier.x + X_MIN + RANDOM.nextInt(X_MAX - X_MIN);
            int newY = RANDOM.nextInt(Position.HAUTEUR_MAX - Position.HAUTEUR_MIN) + Position.HAUTEUR_MIN;
            points.add(new Point(newX, newY));
        }
    }

    // Je veux modifier ce getter pour que tous les X de la liste points soit décalés de -Position.avancement
    public ArrayList<Point> getPoints() {
        ArrayList<Point> pointsDecales = new ArrayList<>();
        for (Point point : points) {
            pointsDecales.add(new Point(point.x - position.getAvancement(), point.y));
        }
        return pointsDecales;
    }
}
