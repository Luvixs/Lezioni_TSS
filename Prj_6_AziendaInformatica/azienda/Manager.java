package azienda;

public class Manager extends Dipendente{

	public Manager(String nome) {
		super(nome);
	}
	
	@Override
	double calcolaStipendioBase() {
		return getStipendioBase() * 5.0;
	}

	@Override
	String getRuolo() {
		return "Manager";
	}
}
