package Lezione3_Metodi;

public class UsoMetoDiAltri {
	public static void main(String[] args) {
		//a patto che sia public io posso usare un metodo static di un'altra classe
		String qualcosa = MetodiAusiliari.cosaMiPassi("qualcosa ri passerò");
		System.out.println(qualcosa);
		
		double somma = Calcolatrice.addizione(5.2, 8.9);
		System.out.println("il valore della somma è " + somma);
	}
}
