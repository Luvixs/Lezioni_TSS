package geometria;

public class FormaGeometrica {
	
	protected String nomeForma;
	protected double perimetro;
	protected double area;
	
	//costruttore
	public FormaGeometrica() {
		
	}
	//Get e set
	public String getNomeForma() {
		return nomeForma;
	}

	public void setNomeForma(String nomeForma) {
		this.nomeForma = nomeForma;
	}


	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void calcola() {
		
	}
	
	public void stampaInfo() {
		System.out.println("Forma: " + this.nomeForma + " " + "Perimetro: " + this.perimetro + " " + "Area: " + this.area);
	}
	
}