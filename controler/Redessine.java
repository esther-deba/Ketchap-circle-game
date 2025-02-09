package controler;

import view.Affichage; // Adjust the package name as necessary

public class Redessine extends Thread{
	
	private Affichage monAffichage;
	public static final int DELAY = 5;
	
	
	public Redessine(Affichage a) {
		this.monAffichage = a;
	}
	
	@Override 
	public void run() {
		while (true) {
			monAffichage.repaint();
			try {
				Thread.sleep(DELAY);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
