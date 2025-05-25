package azienda;

public class Segretario extends Dipendente {

	public Segretario(String nome) {
		super(nome);
	}

	@Override
	double calcolaStipendioBase() {
		return getStipendioBase() * 1.2;
	}

	@Override
	String getRuolo() {
		return "Segretario";
	}
}
