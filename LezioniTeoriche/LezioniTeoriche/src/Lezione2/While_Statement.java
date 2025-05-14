package Lezione2;

import java.util.Scanner;

public class While_Statement {
public static void main(String[] args) {
	//while cocli indefniti
	
	//while(condizione){
		// esegui se condizione è true
	//}
	
	// esempio replco n for con while
	
	int i = 0;
	
	while(i < 10) {
		System.out.println("ciao " + i);
	i++;}
	
	System.out.println("DO-WHILE");
	//prima eseguo qualcosa e poi lo controllo.Almeno una volta faccio l'operazione
	
	int d = 10;
	
	do {
		int risultato = d * 5;
	System.out.println(" 5 x " + d + " = " + risultato);
	d++;}while(d <= 10);
	
	//esempio concreto
	Scanner scan = new Scanner(System.in);
	
	String parola = "";
	int tentativi = 0;
	while(!parola.equals("ciaobello")) {
		tentativi++;
		System.out.println("parola d'ordine errata");
		parola = scan.nextLine();
	}
		System.out.println("benvenuto");
		System.out.println("per entrare hai impiegato" + tentativi + " tentativi");
}
}
