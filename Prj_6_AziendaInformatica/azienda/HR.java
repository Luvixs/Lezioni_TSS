package azienda;

public class HR extends Dipendente{

	public HR(String nome) {
		super(nome);
	}

	@Override
	double calcolaStipendioBase() {
		return getStipendioBase() * 1.5;
	}

	@Override
	String getRuolo() {
		return "HR";
	}
}
