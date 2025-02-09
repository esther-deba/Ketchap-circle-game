package model;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;


public class Parcours {
    private static final Random RANDOM = new Random();
    private static final int X_MIN = 50;
    private static final int X_MAX = 150;
    // Liste de points 
    private ArrayList<Point> points = new ArrayList<>();

    public Parcours() {
        // Crée un parcours aléatoire
        int x = X_MIN;
        int y = 0;
        while (x < X_MAX) {
            y = RANDOM.nextInt(Position.getHauteurOval());
            points.add(new Point(x, y));
            x += RANDOM.nextInt(50) + 50;
        }
    }

    // Méthode main pour tester la classe Parcours
    public static void main(String[] args) {
        Parcours parcours = new Parcours();
        for (Point point : parcours.points) {
            System.out.println(point);
        }
    }
}
