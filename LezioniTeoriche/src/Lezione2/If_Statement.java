package Lezione2;

public class If_Statement {
public static void main(String[] args) {
	
	/*
	 * if(condizione){
	 * ....esegue se TRUE
	 * }
	 * else if (aòtraCpndizione) {
	 * 		esegue se tutto il resto è false
	 * }
	 * 
	 */
	
	boolean piove = true;
	
	if(piove) {
		System.out.println("Porto l'ombrello");
	}
	else {
		System.out.println("Non porto l'ombrello");
	}
	
	
//	esempio
	
	int miaEta = 15;
		
	if(miaEta >= 18) {
		
		System.out.println("benvenuto puoi entrare");
	}else if (miaEta < 10) {
		System.out.println("Devi essere accompagnato dai genitori");
	}else {
		System.out.println("mi dispiace non puoi entrare");
	}
	
	
	
}
}
