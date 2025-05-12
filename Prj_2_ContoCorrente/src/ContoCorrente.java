import java.sql.Date;

public class ContoCorrente {
		
	public int contatore;
	public int numConto;
	public double saldo;
	public String titolare;
	public Date dataApertura;
	
	
	public ContoCorrente( int contatore, int numConto, double saldo, String titolare) {
		this.contatore = contatore;
		this.numConto = numConto;
		this.saldo = saldo;
		this.titolare = titolare;
		this.dataApertura = new Date(System.currentTimeMillis());
	}
	
	public void numConto() {
		System.out.println("Numero Conto: " + this.numConto);
	}
	
	public void versamento(int numVersamento) {
		this.saldo += numVersamento;
	}
	
	public void prelievo(int numPrelievo) {
		this.saldo -= numPrelievo;
	}
	
	public void stampaInfo() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "ContoCorrente [contatore=" + this.contatore + ", numConto=" + this.numConto + ", saldo=" + this.saldo
				+ ", titolare=" + this.titolare + ", dataApertura=" + this.dataApertura
				+ "]";
	}
	
	public static void main(String[] args) {
		ContoCorrente conto = new ContoCorrente( 0, 212530, 100, "Mario");
		conto.numConto();
		conto.versamento(200);
		conto.stampaInfo();
		conto.prelievo(100);
		conto.stampaInfo();
		
	}
}
