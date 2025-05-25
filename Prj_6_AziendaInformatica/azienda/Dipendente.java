package azienda;

public abstract class Dipendente {
	protected String nome;
	protected double stipendioBase = 1000;
	
	public Dipendente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public double getStipendioBase() {
		return stipendioBase;
	}
	
	//metodi
	public void mostraInfo() {
		System.out.println(getRuolo() + ": " + nome + " - Stipendio: €" + calcolaStipendioBase());
	}
	
	abstract double calcolaStipendioBase();
	abstract String getRuolo();
}
