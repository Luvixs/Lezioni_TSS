package geometria;

public class Rettangolo extends FormaGeometrica{

	private double base;
	private double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
		this.nomeForma = "Rettangolo";
	}
	
	@Override
	public void calcola() {
		this.area = base * altezza;
        this.perimetro = 2 * (base + altezza);
	}
	
	@Override
	public void stampaInfo() {
		super.stampaInfo();
	}
	
}
