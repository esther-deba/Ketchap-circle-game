package model;

public class Avancement extends Thread{
    // Je veux un thread qui modifie Position.avancement toutes les 100 ms
    private Position position;
    private Parcours parcours;
    public static final int DELAY = 100;

    public Avancement(Position position, Parcours parcours) {
        this.position = position;
        this.parcours = parcours;
    }

    @Override
    // Je veux que la méthode run mette à jour Position.avancement toutes les 100 ms
    public void run() {
        while (true) {
            position.move();
            parcours.updatePoints();
            try {
                Thread.sleep(DELAY); // Pause de 100 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
