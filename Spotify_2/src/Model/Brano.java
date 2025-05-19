package Model;

public class Brano {
	
	private String titolo;
	private String autore;
	private double durata;
	
	public Brano(String titolo, String autore, double durata) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.durata = durata;
	}
	
	public void suona() {
		System.out.println("stai aascoltando... " + this.titolo + " d " + this.autore.toUpperCase());
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getDurata() {
		return durata;
	}

	public void setDurata(double durata) {
		this.durata = durata;
	}
	
	
	
}
