package Lezione3_Metodi;

import java.util.Scanner;

public class Intro {
	//metodo termine legato alla OOP 
	//servono a wrappare codice, mettere codice sotto un unico nome
	//Permettono di scomporre un problema in sottoproblemi
	//re-use del codice
	
	/*
	 * Sintassi
	 * (modificatore di accesso) 
	 * (static: il metodo che appartiene solo alla classe e non all'istanza)
	 * (modificatore)   (tipo restituito) (nome del metodo) (argomenti o parametri)
	 * 
	 * (FIRMA DEL METODO)
	 * 
	 * public static     void                main          (String[] args){
	 *   ....body del metodo
	 *   
	 *   OPZIONALE:
	 *   return qualcosa; (restituisce qualcosa)
	 *   }
	 *  
	 */
	
	public static void main(String[] args) {
		System.out.println("ciao dal metodo main");
		
		//richiamo salutaUser()
		//uso logica funzionale poiche ho indipendenza tra dichiarazione e richiamo metodo
		salutaUser();
		//passo un parametro al metodo
		salutaDocente("Pierluigi", "Pirantola", 61);
		salutaDocente("Anna Lanzullo");
		salutaDocente();
		salutaDocente("Pippo", "Rossi");
	}
	
	//questo è un metodo
	public static void salutaUser() {
		System.out.println("ciao, Ludo!");
		Scanner in = new Scanner(System.in);
		System.out.println();
	}
	
	public static void salutaDocente(String nomeDoc, String cognomeDoc){
		System.out.println("buongiorno docente" + nomeDoc + " " + cognomeDoc);
	}
	//overloading sovraccarico del metodo per poter avere più o meno parametri
	public static void salutaDocente(String nomeDoc, String cognomeDoc, int etaDoc) {
		System.out.println("esimio docente" + nomeDoc+ " " + cognomeDoc + ".Adesso so quanti anni hai");
		int etaPensione = 65;
		int anniRestanti = etaPensione - etaDoc;
		System.out.println("le mancano " + anniRestanti + " alla pensione");
	}
	
	public static void salutaDocente(String nomeCognome) {
		System.out.println("buongiorno docente" + nomeCognome); 
	}
	
	public static void salutaDocente() {
		System.out.println("buongiorno docente");
	}
}
