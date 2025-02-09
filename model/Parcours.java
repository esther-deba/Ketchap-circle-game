package model;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;


public class Parcours {
    private static final Random RANDOM = new Random();
    private static final int X_MIN = 20;
    private static final int X_MAX = 50;
    // Liste de points 
    private ArrayList<Point> points;

    public Parcours() {
        points = new ArrayList<>();
        genererParcours();
    }

    // Méthode pour générer un parcours aléatoire
    public void genererParcours() {
        int x = Position.getBefore();
        int y = Position.getHauteurOval();

        // Ajout des points de départ
        points.add(new Point(x, y));
        x+= X_MIN;
        points.add(new Point(x, y));

        // Génération des points aléatoires
        while (x < Position.getAfter()) {
            y = Position.getHauteurMin() + RANDOM.nextInt(Position.getHauteurMax() - Position.getHauteurMin() + 1);
            x += X_MIN + RANDOM.nextInt(X_MAX - X_MIN + 1);
            points.add(new Point(x, y));
        }
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    // Méthode main pour tester la classe Parcours
    public static void main(String[] args) {
        Parcours parcours = new Parcours();
        for (Point point : parcours.points) {
            System.out.println(point);
        }
    }
}
