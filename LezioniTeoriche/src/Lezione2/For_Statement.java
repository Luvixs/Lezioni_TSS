package Lezione2;

public class For_Statement {
public static void main(String[] args) {
	
	for(int i = 0; i < 3; i++) {
		System.out.println("ciao" + i);
	}
	
	//ciclo inverso
	for(int i = 10; i >= 0; i--) {
		System.out.println("ciao" + i);
	}
	
	//for doppia variabile
	
	for(int a = 0, b = 9; b >= 0; b--, a++) {
		System.out.println("a vale" + a + "b vale" + b);
	}
	
	//for con continue: serve a saltatre un giro
	System.out.println("-----for con il continue----");
	for(int i = 0; i < 5; i++) {
		if(i%2 == 0) {
			continue;
		}
		
		System.out.println(i);
	}
	System.out.println("-----for con il break----");
	//for con brack interrompe ciclo
	for(int i = 0; i < 5; i++) {
		if(i%2 == 0) {
			break;
		}
		
		System.out.println(i);
	}
}
}
