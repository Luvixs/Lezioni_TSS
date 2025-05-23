package geometria;

public class Triangolo  extends FormaGeometrica{
	
	private double lato1, lato2, lato3;
    private double base, altezza;

    public Triangolo(double lato1, double lato2, double lato3, double base, double altezza) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.base = base;
        this.altezza = altezza;
        this.nomeForma = "Triangolo";
    }

    @Override
    public void calcola() {
        this.perimetro = lato1 + lato2 + lato3;
        this.area = (base * altezza) / 2;
    }
    
    @Override
	public void stampaInfo() {
		super.stampaInfo();
	}
}
