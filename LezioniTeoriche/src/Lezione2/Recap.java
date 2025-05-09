package Lezione2;

public class Recap {
public static void main(String[] args) {
//	 le variabuili sono aree di memoria alle quali associamo un  nome
	/*
	 * Regole di denominazione:
	 * -non posso cominciare con i numeri
	 * posso contenere numeri e lettere
	 * No kayword Java (private, default, byte, final)
	 * camelCase
	 * la dischiarazione è indipendente dalla valorizzazione
	 */
	
//	Dichiaro e assegno sulla stessa riga
//	String nomeCorso = "TSS-2025";
//	DICHIARO
	String nomeCorso;
	
//	assegno
	nomeCorso = "TSS-2025";
//	leggo e stampo
	System.out.println(nomeCorso);
	
//	riassegno
	nomeCorso = "TSS-2026";
	
	System.out.println(nomeCorso);
	
//	tipo primitivi
	
	int numeroStudenti = 11;
	double metaStudenti = 5.5;
	
	byte num1 = 10;
	char lettera = 'f';
	boolean piove = true;
	
//	Costanto, non possono essere riassegnate
	
	final double PI = 3.14;
	final double IVA = 0.22;
	
	final int MAX_VALUE = 100;
	final int MIN_VALUE = 1;
	
}
}
