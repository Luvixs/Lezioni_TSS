package model;

public class Brano {
	public String autore;
	public String titolo;
	public String genere;
	public double durata;
	
	public Brano (String autore,String titolo, String genere, double durata) {
		this.autore = autore;
		this.titolo = titolo;
		this.genere = genere;
		this.durata = durata;
		
	}
	
	public void play() {
		
		System.out.println("Brano che stai ascoltando: " + this.titolo);
	}
	
	public void stampaInfo() {
		System.out.println( "info del brano: " + "autore: " + this.autore +" " + "titolo: " + this.titolo + " " + "genere: " + this.genere+ " " + "durata: " + this.durata);
	}
	
}
