package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Studente;
import model.Registro;

public class RegistroCtrl {
/*
 * sviluppa i metodi
 * 
 * caricaStudentiDaFile()
 * faiAppello() {chiede de lo stud è presente o assente. lo Stud è presente? V / N}
 * stampaPresenti()
 * stampaAssenti()
 * */
	
	private ArrayList<Studente> studenti = new ArrayList<Studente>();
	private ArrayList<Studente> presenti = new ArrayList<Studente>();
	private ArrayList<Studente> assenti = new ArrayList<Studente>();
	private Registro registro;
	
	public RegistroCtrl(Registro registro) {
		this.presenti = presenti;
		this.assenti = assenti;
		this.registro = registro;
	}
	
	
	public void caricaStudentiDaFile() {
		
		File fileElenco = new File ("./elencoStudenti_TSS.csv");
		
		try {
			Scanner input = new Scanner(fileElenco);
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String[] elementi = line.split(",");
				String nomeStud = elementi[0];
				String cognomeStud = elementi[1];
				String nomeCorso = elementi[2];
				Integer matricola = Integer.parseInt(elementi[3]);
				
				Studente s = new Studente(nomeStud, cognomeStud, matricola, nomeCorso);
				this.registro.aggiungiStudente(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("mi spiace, non trovo il file");
			e.printStackTrace();
		}
	}
	
	public void faiAppello() {
		Scanner input = new Scanner(System.in);
		
		char scelta;
		
		presenti.clear();
		assenti.clear();
		
		for (Studente studente : this.registro.getStudenti()) {
			do {
				System.out.println(studente);
				System.out.println("lo studente è presente o assente? p/a");
				scelta = input.next().toLowerCase().charAt(0);
			}while(scelta != 'p' && scelta != 'a');
			
			if(scelta == 'p') {
				this.presenti.add(studente);
			}else {
				this.assenti.add(studente);
			}
		}
		System.out.println("---Registro Completo---");
		
		for (Studente studente : presenti) {
			System.out.println(studente.getnMat() + " - " + studente.getNome() + " " + studente.getCognome());
		}
	}
	
	public void aggiungiStudenteSuFile(Studente s, String pathFile) {
		File fileElenco = new File(pathFile);
		
		if(s.equals(null)) {
			throw new IllegalArgumentException();
		}else {
			try {
				String nome = s.getNome();
				String cognome = s.getCognome();
				String corso = s.getCorso();
				Integer nMat = s.getnMat();
				
				FileWriter fw = new FileWriter(pathFile, true);
				
				fw.write("/n" + nome + "," + cognome + "," + nMat);
				fw.close();
				
				this.registro.aggiungiStudente(s);
				
				System.out.println("studente " + s + "\n");
			} catch (Exception e) {
				System.out.println("non so che devo scrivere");
			}
		}
	}
}
