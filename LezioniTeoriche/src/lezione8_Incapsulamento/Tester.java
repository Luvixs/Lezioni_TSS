package lezione8_Incapsulamento;

public class Tester {
	
	public static void main(String[] args) {
		
		Studente stud1 = new Studente("Maria", "Verdi", 2025);
		
		//posso leggere le prop splo perchè ho i metodi get
		
		System.out.println(stud1.getNome());
		System.out.println(stud1.getCognome());
		System.out.println(stud1.getNumMatricola());
		System.out.println(stud1.toString());
		
		Studente stud2 = new Studente("Mario", "Rossi", 2024);
		System.out.println(stud2.toString());
		
		Studente stud3 = new Studente("Laura", "Verdi", 2025);
		stud3.setPresente("1234", false);
		System.out.println(stud3.toString());
		
		//Corso
		Corso corso1 = new Corso();//creo corso vuoto
		corso1.setDescrizione("Java e Javascript");
		corso1.setDurataCorso(750);
		corso1.setStudenti(10);
		corso1.inserisciStudente(stud1);
		corso1.inserisciStudente(stud2);
		corso1.inserisciStudente(stud3);
		System.out.println(corso1);
		
		//zaino
		Zaino seven = new Zaino("Invicta", "blu", 6);
		
		seven.inizializzaCose();
		
		seven.elencaContenuto();
		
	}
}
