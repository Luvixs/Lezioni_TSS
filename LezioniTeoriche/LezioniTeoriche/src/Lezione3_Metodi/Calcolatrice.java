package Lezione3_Metodi;

import java.util.Scanner;

public class Calcolatrice {
	public static void main(String[] args) {
		double primoNum = getInput("inserisci il primo nun?");
		double secondoNum = getInput("inserisci il secondo num?");
		
		//double somma = primoNum + secondoNum;
		//System.out.println("la somma dei tuoi 2 numeri vale: " + somma);
		
		System.out.println(addizione(primoNum, secondoNum));
		System.out.println(sottrazione(primoNum, secondoNum));
		System.out.println(moltiplicazione(primoNum, secondoNum));
		System.out.println(divisione(primoNum, secondoNum));
	}
	
	public static double addizione(double a, double b) {
		double somma = a + b;
		return somma;
	}
	
	public static double moltiplicazione(double a, double b) {
		
		return a * b;
	}
	
	public static double sottrazione(double a, double b) {
		
		return a - b;
	}
	
	public static double divisione(double a, double b) {
	
	return a / b;
	}
	
	public static double getInput(String domanda) {
		System.out.println(domanda);
		
		Scanner input = new Scanner(System.in);
		
		double mioDouble = input.nextDouble();
		
		return mioDouble;
	}
}
