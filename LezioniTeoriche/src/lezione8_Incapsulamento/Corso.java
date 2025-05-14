package lezione8_Incapsulamento;

public class Corso {
	
	private int contatore = 0;
	private String descrizione;
	private int durataCorso;
	private Studente[] studenti;
	
	
	//non dichiaro costruttore di default
	
	//genero i setter per poter modificare o creare le proprietà
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public void setDurataCorso(int durataCorso) {
		this.durataCorso = durataCorso;
	}
	//stabilire numero studenti nel corso
	public void setStudenti(int dimensione) {
		this.studenti = new Studente[dimensione];
	}
	
	public void inserisciStudente(Studente studente) {
		studenti [contatore] = studente;
		contatore++;
	}
	
	
	
}
