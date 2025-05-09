package Lezione4_Classi;

public class Tester {
public static void main(String[] args) {
	//creo istanza classe persona, invocansdo metodo costruttore della classe Persona
	Persona pers1 = new Persona("Piero", "Bolli", 25, 1.80, "001");
	
	//leggo le caratteristiche, accedo alle proprietà dell'oggetto
	System.out.println(pers1.nome);
	System.out.println(pers1.cognome);
	System.out.println(pers1.eta);
	System.out.println(pers1.altezza);
	System.out.println(pers1.matricola);
	
	Canzone canzone1 = new Canzone(); //uso costruttore di default
	canzone1.titolo = "Eooo";
	canzone1.cantante = "Bad Bunny";
	canzone1.durata =3.8;
	
	System.out.println("Titolo " + canzone1.titolo + " - " + canzone1.cantante);
	
	Canzone canzone2 = new Canzone("Bruno Mars", "24k", 2.5); //costruttore a firma piena
	System.out.println("Titolo " + canzone2.titolo + " - " + canzone2.cantante);
	
	Canzone canzone3 = new Canzone("Mj", "Off the wall");
	System.out.println(canzone3.toString());
	
	Bicicletta miaBici = new Bicicletta(); //sto creando una bici con il costruttore di default
	System.out.println("la mia bici è di marca: " + miaBici.marca);
	miaBici.accelera(100);
	miaBici.rallenta(50);
	miaBici.calcolaVelocita();
	System.out.println(miaBici); //stampare direttamente l'oggetto quando

}
}
