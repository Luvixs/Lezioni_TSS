package geometria;

public class Main {
public static void main(String[] args) {
	
	Cerchio cerchio = new Cerchio(3);
	Rettangolo rettangolo = new Rettangolo(4, 5);
	Quadrato quadrato = new Quadrato (6);
	Triangolo triangolo = new Triangolo (3, 4, 5, 3, 4);
	
	cerchio.calcola();
	cerchio.stampaInfo();
	
	rettangolo.calcola();
	rettangolo.stampaInfo();
	
	quadrato.calcola();
	quadrato.stampaInfo();
	
	triangolo.calcola();
	triangolo.stampaInfo();
	
}
}
