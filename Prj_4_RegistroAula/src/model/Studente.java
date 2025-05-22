package model;

import java.util.Random;

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
	private int nMat;
	private String corso;
	private String token;
	private static int contatore = 1;
	
	public Studente(String nome, String cognome, int nMat, String corso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.nMat = nMat;
		this.corso = corso;
		this.token = tokenizer();
	}
//questa classe static non può accedere a membri non statici. Non posso usare this, non posso usare Super(). Non posso fare override
	//private static String tokenizer() {
		//Random numRand = new Random();
		//Double numD = numRand.nextDouble();
		//return numD.toString();		
	//}
	
	private String tokenizer() {
		
		String token = "";
		token += this.nome.toUpperCase().charAt(0) + "" + this.cognome.toUpperCase().charAt(0);
		
		Random r = new Random();
		Integer num = r.nextInt(100);
		
		token += num.toString() + this.contatore;
		
		return token;
	}
	
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getnMat() {
		return nMat;
	}

	public void setnMat(int nMat) {
		this.nMat = nMat;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", nMat=" + nMat + ", corso=" + corso + ", token="
				+ token + "]";
	}

	
	
	
}
