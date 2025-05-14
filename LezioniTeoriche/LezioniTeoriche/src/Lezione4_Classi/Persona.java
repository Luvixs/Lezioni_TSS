package Lezione4_Classi;

public class Persona {
	//stato della classe. Caratteristiche
	public String nome;
	public String cognome;
	public int eta;
	public double altezza;
	public int matricola;
	
	//metodo costruttore
	//deve avere lo stesso identico nome della classe
	public Persona(String name, String surname,int age, double height, String id) {
		this.nome = name + " " + id;
		this.cognome = surname;
		this.eta = age;
		this.altezza = height;
		this.matricola = matricolatore();
	}
	
	public int matricolatore() {
		int matricola = (int) Math.ceil(Math.random() * 100);
		return matricola;
	}
}
