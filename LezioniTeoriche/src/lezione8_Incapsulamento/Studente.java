package lezione8_Incapsulamento;

public class Studente {

	private String nome;
	private String cognome;
	private int annoIscrizione;
	private int numMatricola;
	private boolean presente;
	static int contatore;
	
	public Studente(String nome, String cognome, int annoIscrizione) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoIscrizione = annoIscrizione;
		this.presente = true;
		this.numMatricola = ++contatore;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}

	public int getNumMatricola() {
		return numMatricola;
	}

	public boolean isPresente() {
		return presente;
	}

	@Override
	public String toString() {
		StringBuilder desc = new StringBuilder();
		desc.append(this.numMatricola);
		desc.append("\t");
		desc.append(this.nome);
		desc.append("\t");
		desc.append(this.cognome);
		desc.append("\t");
		desc.append(this.presente ? "presente" : "assente");
		
		return desc.toString();
		
	}
// con il set modifico, valorizzo, assegno un valore a auna proprietà
	public void setPresente(String pass, boolean presente) {
		if(pass.equals("1234")) {
			this.presente = presente;
		}else {
			System.out.println("non puoi varirare la presenza dello studente" + this.nome);
		}
		
	}
	
	
	//poter modificare prop creare metodi getters setters
	
	
}
