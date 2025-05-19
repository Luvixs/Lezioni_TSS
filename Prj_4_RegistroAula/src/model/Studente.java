package model;

public class Studente {
/*
 * nome
 * cognome
 * matricola
 * corso 
 * contatore se serve
 * 
 * */
	
	private String nome;
	private String cognome;
	private int matricola;
	private String corso;
	
	public Studente(String cognome, String corso, String nome, int matricola) {
		super();
		this.cognome = cognome;
		this.corso = corso;
		this.nome = nome;
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public String getCorso() {
		return corso;
	}
	
	
	
	

}
