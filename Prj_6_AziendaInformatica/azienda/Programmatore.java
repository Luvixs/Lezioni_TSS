package azienda;

public class Programmatore extends Dipendente  {

	public Programmatore(String nome) {
		super(nome);
		
	}

	@Override
	double calcolaStipendioBase() {
		return getStipendioBase() * 2.0;
	}

	@Override
	String getRuolo() {
		return "Programmatore";
	}

	
}
