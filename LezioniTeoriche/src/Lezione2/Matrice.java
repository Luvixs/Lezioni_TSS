package Lezione2;

public class Matrice {
public static void main(String[] args) {
	//creo una matrice (griglia) 3 x 3
	/*
	 * (0 3 4)
	 * (8 3 4)
	 * (5 6 2)
	 */
	int[][] matrice = new int[3][3];
	
	//prima riga
	matrice[0][0] = 1;
	matrice[0][1] = 3;
	matrice[0][2] = 4;
	
	//seconda riga
	matrice[1][0] = 8;
	matrice[1][1] = 3;
	matrice[1][2] = 4;
	
	//terza riga
	matrice[2][0] = 5;
	matrice[2][1] = 6;
	matrice[2][2] = 2;
	
	//leggo la matrice mi servono 2 cigli for, quello per le righe e quello in terno per colonne
	
	for(int i = 0; i < matrice.length; i++) {
		int[] colonne = matrice[i];
		
		for(int j = 0; j < colonne.length; j++) {
			System.out.println("\t" + colonne[j]);
		}
		
		System.out.println();
	}
	
	//scontrino
	
	String[][] scontrino = new String[2][2];
	
	scontrino[0][0] = "caffè";
	scontrino[0][1] = "1.30";
	
	scontrino[1][0] = "brioche";
	scontrino[1][1] = "1.50";
	
	for(int i = 0; i < scontrino.length; i++) {
		for(int j = 0; j < scontrino.length; j++) {
			System.out.println(scontrino[i][j] + "\t");
		  }
	    }
	System.out.println("");
	}
	
 }

