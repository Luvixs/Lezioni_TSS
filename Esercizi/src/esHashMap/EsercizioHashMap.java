package esHashMap;
import java.util.Map;
import java.util.HashMap;


public class EsercizioHashMap {
	public static void main(String[] args) {
		HashMap<String, Double> prezzi = new HashMap<>();
		
		prezzi.put("Latte", 0.99);
		prezzi.put("Biscotti Gocciole", 2.90);
		prezzi.put("Mirtilli", 2.69);
		prezzi.put("Pollo", 4.05);
		prezzi.put("Melanzane", 1.15);
		prezzi.put("Gorgonzola", 2.99);
		
		//stampa la mappa
		System.out.println(prezzi);
		
		//Calcola il numero di chiavi-valore presenti nella mappa		
		System.out.println("IL numero delle coppie chiavole valore contenute nella mappa è: " + prezzi.size());
		
		//Copia tutti i valori di una specifica HashMap in un’altra
		
		HashMap<String, Double> spesa = new HashMap<>();
		
		//copio elementi
		spesa.putAll(prezzi);
		
		System.out.println("La mia spesa: " + spesa);
		
		//Rimuovi tutti i valori di una specifica mappa
		spesa.clear();
		System.out.println("Ora la mappa spesa è vuota " + spesa);
		
		//Controlla quando una mappa contiene valori key-value oppure no
		
		//controllo del map spesa
		 String messaggio_1 = spesa.isEmpty() ? "La mappa è vuota." : "La mappa contiene elementi.";
		
		 //controllo del map prezzi
		 String messaggio_2 = prezzi.isEmpty() ? "La mappa è vuota." : "La mappa contiene elementi.";
		
		 //print del map spesa
		 System.out.println(messaggio_1);
		//print del map prezzi
		 System.out.println(messaggio_2);
		 
		//Crea una copia di una HashMap
		  HashMap<String, Double> 	spesaCopia = new HashMap<>(spesa);
		  System.out.println("Copia della spesa: " + spesaCopia);
		  
		 //Controlla se una map contiene una specifica chiave e mostrane il valore
		  
		  String controllaChiaveValore = prezzi.containsKey("Gorgonzola") ? "Si, e costa: " + String.valueOf(prezzi.get("Gorgonzola")) : "Non hai preso il prodotto cercato";
		  System.out.println(controllaChiaveValore);
		  
		// Controlla se una map contiene uno specifico valore emostrane la chiave
		 // String controllaValoreChiave = prezzi.containsValue(2.99) ? "Si, e la chiave è: " + String.valueOf(prezzi.getKey()) : "Non hai preso il prodotto cercato";
		  //System.out.println(controllaValoreChiave);
		  
		  double valoreCercato = 2.90;
	        String chiaveTrovata = null;

	        for (Map.Entry<String, Double> entry : prezzi.entrySet()) {
	            if (entry.getValue().equals(valoreCercato)) {
	                chiaveTrovata = entry.getKey();
	                break;
	            }
	        }

	        String messaggio = (chiaveTrovata != null)
	            ? "Sì, e la chiave è: " + chiaveTrovata
	            : "Non hai preso il prodotto cercato";

	        System.out.println(messaggio);
		  
	      //Stampa il valore di una specifica chiave nella mappa
	        System.out.println("I mirtilli costano: " + prezzi.get("Mirtilli"));
		  
		  
	}
}
