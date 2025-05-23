package geometria;

public class Cerchio  extends FormaGeometrica {
	private double raggio;

	public Cerchio(double raggio) {
		this.raggio = raggio;
		this.nomeForma = "Cerchio";
	}
	
	@Override
	public void calcola() {
		this.area = Math.PI * raggio * raggio;
        this.perimetro = 2 * Math.PI * raggio;
	}
	
	@Override
	public void stampaInfo() {
		super.stampaInfo();
	}
	
}
