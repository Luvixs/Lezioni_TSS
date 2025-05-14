package Lezione2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	//Array contenitori con elementi simili traloro. Sono 0 based
	
	String[] colori = new String[5];
	
	//per ogni indice assegno un valore
	colori[0] = "Rosso";
	colori[1] = "Giallo";
	colori[2] = "Blu";
	colori[3] = "Rosa";
	colori[4] = "Verde";
	//colori[5] = "Nero"; //sfondo array
	
	//System.out.println(colori[0]);
	//System.out.println(colori[1]);
	//System.out.println(colori[2]);
	//System.out.println(colori[3]);
	//System.out.println(colori[4]);
	System.out.println("lunghezza dell'array: " + colori.length);
	for(int i = 0; i < colori.length; i++) {
		System.out.println(colori[i]);
	}
	
	//metdo toString()
	
	//Sintassi abbreviata non devo dichiarare new 
	
	int[] numCasuali = {5,7,9,4,8,1,3,2};
	
	for (int numero : numCasuali) {
		System.out.println(numero);
	}
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("inserisci la dimensione dell'array");
	
	int dimArr = input.nextInt();
	
	int[] mioArr = new int[dimArr];
	
	int indice = 0;
	
	do {
		System.out.println("inserisci un intero");
		mioArr[indice] = input.nextInt();
		indice++;
	}while(mioArr.length > indice);
	
	
	//leggo array
	for(int num : mioArr) {
		System.out.println(num);
	}
	// ordinare in modo crescente l'array di numeri casuali
	Arrays.sort(numCasuali);
	
	for (int num : numCasuali) {
		System.out.println(num);
	}
	
}
}
