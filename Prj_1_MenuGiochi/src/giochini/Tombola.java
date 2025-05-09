package giochini;

import java.util.Arrays;
import java.util.Random;

public class Tombola {
	//serve solo se voglio testare a parte
	public static void main(String[] args) {
		estrazione();
	}
	
	public static void estrazione() {
		
		int[] numEstratti = new int[20];
		
		for(int i = 0; i < 20; i++) {	
			Random numR = new Random();
			numEstratti[i] = numR.nextInt(1, 91); 
			
			for(int j = 0; j < i; j++) {
				if(numEstratti[j] == numEstratti[i]) {
					i--;
				}
			}
		System.out.println(Arrays.toString(numEstratti));
		//double numR = Math.ceil(Math.random() * 90);
		//System.out.println(numR);
		}
	}
}
