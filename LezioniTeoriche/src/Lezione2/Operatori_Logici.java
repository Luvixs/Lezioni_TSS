package Lezione2;

public class Operatori_Logici {
	public static void main(String[] args) {
			
		//gli operatori logici èermettono di valutare più cose
			
			/*
			 * && AND
			 * || OR
			 * ! NOT
			 * 
			 */
			
		//esempio trimestre dell'anno
			int meseAttuale = 5;
		if(meseAttuale >= 1 && meseAttuale <=3) {
			System.out.println("siamo neò primo trimestre");
		}else if(meseAttuale >= 4 && meseAttuale <= 6) {
			System.out.println("siammo nel secondo trimestere");
		}else if(meseAttuale >= 7 && meseAttuale <= 9) {
			System.out.println("siamo nel terzo trimestre");
		}else if(meseAttuale >= 10 && meseAttuale <= 12) {
			System.out.println("siam ne lquarto trimestre");
		}else {
			System.out.println("valore non riconosciuto");
		}
		
		//esempio festa per entarare festa devo avere in invito ed essere maggiorenne
		
		boolean invito = true;
		int miaEta = 36;
		
		if(miaEta >= 18 && invito) {
			System.out.println("benvenuto, puoi entrare");
		}else if(miaEta < 18 && invito) {
			System.out.println("mi dispiace, non hai l'età per entrare");
		}else if(miaEta >= 18 && !invito) {
			System.out.println("mi dispiace hai l'eta giusta ma non l'invito");
		}else {
			System.out.println("non puoi entrare, non hai ne eta ne invito");
		}
		
		//esempio esame universita
		
		int scritto = 15;
		int orale = 27;
		
		if (scritto >= 18 || orale >= 18) {
			System.out.println("complimenti hai superato l'esame");
		}else {
			System.out.println("mi dispiace, non hai superato l'esame");
		}
	}
}
