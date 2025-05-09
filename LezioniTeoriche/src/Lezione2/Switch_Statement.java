package Lezione2;

public class Switch_Statement {
public static void main(String[] args) {
	// switch mi permette di valutare in base ai casi il valore di una variabile
	
	int giornoSettimana = 2;
	
	switch(giornoSettimana) {
	case 1:
		System.out.println("lunedi");
		break;
	case 2:
		System.out.println("martedi");
		break;
		
	case 3:
		System.out.println("mercoledi");
		break;
		
	case 4:
		System.out.println("giovedi");
		break;
		
	case 5:
		System.out.println("venerdi");
		break;
		
	case 6:
		System.out.println("sabato");
		break;
		
	case 7:
		System.out.println("domenica");
		break;
		default;
	}
	
}
}
