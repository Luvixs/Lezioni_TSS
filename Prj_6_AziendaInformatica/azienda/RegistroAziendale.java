package azienda;

import java.util.List;
import java.util.ArrayList;

public class RegistroAziendale {

	private List<Dipendente> dipendenti;

    public RegistroAziendale() {
        dipendenti = new ArrayList<>();
    }

    public void aggiungiDipendente(Dipendente d) {
        dipendenti.add(d);
    }

    public void stampaTuttiDipendenti() {
        for (Dipendente dipendente : dipendenti) {
           // System.out.println(dipendente.nome);
           // System.out.println(dipendente.getRuolo());
           // System.out.println(dipendente.calcolaStipendioBase());
            dipendente.mostraInfo();
                      
        }
    }

    public void stampaDipendentiPerRuolo(String ruolo) {
        for (Dipendente dipendente : dipendenti) {
            if (dipendente.getRuolo().equalsIgnoreCase(ruolo)) {
                //System.out.println(dipendente.nome);
            	dipendente.mostraInfo();
            }
        }
    }
   
	public static void main(String[] args) {
	
		
		RegistroAziendale registro = new RegistroAziendale();

        registro.aggiungiDipendente(new Programmatore("Alice"));
        registro.aggiungiDipendente(new HR("Marco"));
        registro.aggiungiDipendente(new Segretario("Lucia"));
        registro.aggiungiDipendente(new Manager("Giovanni"));
        
        System.out.println("Tutti i dipendenti:");
        registro.stampaTuttiDipendenti();
        
     
        System.out.println("\nSolo Programmatori:");
        registro.stampaDipendentiPerRuolo("Programmatore");
		    

	}
}
