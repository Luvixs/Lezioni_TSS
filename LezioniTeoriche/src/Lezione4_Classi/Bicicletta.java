package Lezione4_Classi;

public class Bicicletta {
	//sto direttamente assegnando delle proprietà
	byte numeroRuote = 2;
	byte marcia = 6;
	int frequenza = 0;
	double velocita = 0;
	
	String marca = "Cannodale";
	String modello = "C-Bike-ale";
	String tipoBici = new String("stradle");
	
	public void accelera (int incFrequenza) {
		frequenza += incFrequenza;
		System.out.println("stai accelerando. La frequenza attuale è: " + frequenza);
	}
	
	public void rallenta (int incFrequenza) {
		frequenza -= incFrequenza;
		System.out.println("stai rallentando. lafrequenza attuale è: " + frequenza);
	}
	
	public void calcolaVelocita() {
		velocita = frequenza * marcia;
		System.out.println("la tua vel attuale è: " + velocita);
	}
	
	
}
