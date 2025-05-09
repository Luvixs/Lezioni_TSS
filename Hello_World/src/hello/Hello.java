// Package Definisce la directory dove troviamo il file
package hello;

//public visibilità del progetto nome della classe identico al nome del file. Case sasnitive
public class Hello {
	
	public static void main(String[] args) { //main stabilisce il punto di partenza di chiama metodo
		//questi sono metodi Syso per stampare un saluto
		System.out.println("hello world");
		System.out.println("Corso di Tecnico Sviluppo Software");
		
		//dichiaroa una  serie di variabili
		String mioNome = "Ludovica";
		String mioCognome = "Scalvini";
		String nomeCorso = "TSS-2025";
		String benvenuto = "Ciao, " + mioNome + " " + mioCognome +". Sei iscritto al corso" + nomeCorso;
		//stampo richiamo la variabile benvenuto
		System.out.println(benvenuto);
		/**
		 * permette 
		 * di andare a a capo
		 */
//		faccio un calcolo
		int numero1 = 10;
		int numero2 = 5;
		
		int somma = numero1 + numero2;
		String risultato = ("la somma vale" + somma);
		System.out.println(risultato);
		
		int prodotto = numero1 * numero2;
		System.out.println("il prod vale " + prodotto);
		
		int differenza = numero1 / numero2;
		System.out.println("la differenza vale " + differenza);
		
		double quoziente = (double) numero1 / numero2;
		System.out.println("il quoziente vale " + quoziente);
		
		//crea un package chaimato "ciao", una classe chiamata "Main". All'interno di questa classe stampa il tuo cognome in console
	}

}


