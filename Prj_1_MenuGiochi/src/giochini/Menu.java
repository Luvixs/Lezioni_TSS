package giochini;

import java.util.Scanner;

public class Menu {
	
	public static void multipli() {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "BANGARANG");
			}else if(i % 3 == 0) {
				System.out.println(i + "BOOM");
			}else if(i % 5 == 0) {
				System.out.println(i + "ZOOM");
			}else {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner mioScann = new Scanner(System.in);
	char scelta;
	
	do {
		System.out.println("---MENU---");
		System.out.println("1. Gioco1");
		System.out.println("2. Gioco2");
		System.out.println("3. Gioco3");
		System.out.println("Q. Esci");
		System.out.println("---------");
		
		scelta = mioScann.nextLine().charAt(0);
		
		switch(scelta) {
		case '1':
			System.out.println("hai scelto il gioco 1 dei multipli");
			
			//modo 1: scrivo qui tutta la logica
			//modo 2 : posso creare un metodo ausiliare in questa classe
			multipli();
			//modo 3:posso creare una classe a parte dei metodi e richiamarli
			break;
		case '2':
			System.out.println("hai scelto gioco dello Star Pattern");
			//Triangolo.disegnaTriangolo();
			break;
		case '3':
			System.out.println("hai scelto gioco della Tombola");
			//Tombola.estrazione2();
			break;
		case 'q':
			System.out.println("stai uscendo dal programma..");
			break;
			
			default:
				System.out.println("scusa non capisco questo comando");
		}
	}while(scelta != 'q' && scelta != 'Q');
	
	System.out.println("ciao, alla prossima partita");
	}
}
