package Lezione4_Classi;

public class Canzone {
	
	String cantante;
	String titolo;
	double durata;
	
	//costruttore di default esiste sempre. Può essere non specificato se non esiste il costruttore a firma piena
	public Canzone() {}
//costruttore a firma piena e voglio utilizzare un costruttore di default allora devo per forza specificare quest'ultimo	
	public Canzone(String cantante, String titolo, double durata) {
		this.cantante = cantante;
		this.titolo = titolo;
		this.durata = durata;
	}
	public Canzone(String cantante, String titolo) {
		this.cantante = cantante;
		this.titolo = titolo;
	}
	
	@Override
	//con metodo toString ottengo una rappresentazione formato stringa del mio oggetto
	public String toString() {
		if(durata == 0) {
			return "cantante: " + cantante + "- titolo" + titolo;
		}else {
		return "cantante=" + cantante + ", titolo=" + titolo + ", durata=" + durata;
		}	
		
	}
	
	
}
