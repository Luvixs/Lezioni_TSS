package geometria;

public class Quadrato  extends FormaGeometrica {

	
	private double lato;
	
	public Quadrato (double lato) {
		this.lato = lato;
		this.nomeForma = "Quadrato";
	}
	
	@Override
	public void calcola() {
		this.area = lato * lato;
        this.perimetro = 4 * lato;
	}
	
	@Override
	public void stampaInfo() {
		super.stampaInfo();
	}
}
