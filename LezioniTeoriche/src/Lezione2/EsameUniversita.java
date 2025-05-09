package Lezione2;

import java.util.Scanner;

public class EsameUniversita {
	// crea programma per valutaree gli esami all'università
	//l'esame scritto fa da sbarramento per l'esame orale
	
	public static void main(String[] args) {
		
		final int VOTO_MIN = 1;
		final int VOTO_MAX = 30;
		
		Scanner mioScann = new Scanner(System.in);
		System.out.println("inserisci il voto dell esame scritto");
		
		int votoScritto = mioScann.nextInt();
		
		if(votoScritto >= VOTO_MIN && votoScritto <= VOTO_MAX) {
		
		if(votoScritto >= 18) {
			System.out.println("voto scrittp: " + votoScritto + "puoi sostenere l'orale");
			
			System.out.println("inserisci il voto del tuo esame orale");
			int votoOrale = mioScann.nextInt();
			
			if(votoOrale >= VOTO_MIN && votoOrale <= VOTO_MAX) {
			
			if(votoOrale >= 18) {
				System.out.println("voto orale: " + votoOrale );
				double votoFinale = Math.round((double) (votoScritto + votoOrale )/ 2);
				System.out.println("Voto finale: " + votoFinale);
			}}else {
				System.out.println("mi spiace, non hai superato l'orale, quindi non hai superato l'esame");
			}
			
		}}else {
			System.out.println(" mi dispiace non puoi sostenere l'orale");
		}
		//operatore ternario
		int a = 5;
		int b = 6;
		
		if(a == b) {
			System.out.println("i numeri sono uguali");
		}else {
			System.out.println("i numeri sono diverai");
		}
		
		String msg = (a == b)? "i numeri sono uguali" : "i numeri sono diversi;"
		
		
	}
}
