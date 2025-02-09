package controler;

import model.Position;

public class Descendre extends Thread {
    private Position position;
    public static final int DELAY = 50; 

    public Descendre(Position position) {
        this.position = position;
    }

    @Override
    public void run() {
        while (true) {
            position.move();
            try {
                Thread.sleep(DELAY); // Pause de 100 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
