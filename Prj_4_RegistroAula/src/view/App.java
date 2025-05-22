package view;
import model.Studente;
import model.Registro;
import controller.RegistroCtrl;

public class App {
	
	public static void main(String[] args) {
		Registro tss2025 = new Registro("TSS 2025");
		RegistroCtrl regCtrl = new RegistroCtrl(tss2025);
		regCtrl.caricaStudentiDaFile();
		regCtrl.faiAppello();
		
		Studente nuovoStud = new Studente("Pier", "Pier", 15, "TSS");
		regCtrl.aggiungiStudenteSuFile(nuovoStud, "./elencoStudenti_TSS.csv");
	}

}
