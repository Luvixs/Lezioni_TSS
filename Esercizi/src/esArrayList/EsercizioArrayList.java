package esArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EsercizioArrayList {
public static void main(String[] args) {
	
	//creo un ArrayList
		ArrayList<String> manga = new ArrayList <> ();
	
	//aggiungo cose nell'ArrayList
		manga.add("I Diari della Speziale");
		manga.add("Friren");
		manga.add("Solo Leveling");
		manga.add("Another");
	
	// Stampo la lista dei manga
		System.out.println("Lista di manga:");
		for (String titolo : manga) {
				System.out.println("- " + titolo);
    }
    
    //Copia un array list in un altro
		ArrayList<String> anime = new ArrayList <> (manga);
    
		System.out.println("Lista di anime:");
		for (String titolo : anime) {
			System.out.println("- " + titolo);
    }
    
    //Mescola gli elementi
		//  Collections.shuffle(manga);
	
 // Stampo la lista mescolata
		//   System.out.println("Lista di manga mescolata:");
		//   for (String titolo : manga) {
		//       System.out.println("- " + titolo);
 //   }
    
  //Inverti tutti gli elementi
		//  Collections.reverse(manga);
    
		//  System.out.println("Lista di manga invertita:");
		// for (String titolo : manga) {
		//      System.out.println("- " + titolo);
  //  }
    
    //Estrai una porzione dell’array list. subList(inizio, fine)
		
    //La porzione di lista è collegata alla lista originale. Se modifico la porzione di lista, cambio anche l’originale.
    	List<String> porzione = manga.subList(2, 3);
    
    	System.out.println("Przione della lista manga da indice 2 a indice 3:");
    	for (String titolo : porzione) {
    		System.out.println("- " + titolo);
    }
    
    // Creo una porzione di lista separata dalla lista originale. Posso modificare porzioneLista senza influenzare manga.
    	//ArrayList<String> porzioneLista = new ArrayList<>(manga.subList(2, 3));
    
    //Inverti la posizione di due elementi--- Collections.swap(lista, indice1, indice2);
    
 // Scambio gli elementi agli indici 0 e 2
    	Collections.swap(manga, 0, 2);
    
    	System.out.println("Scambio gli elementi agli indici 0 e 2: ");
    	for (String titolo : manga) {
    		System.out.println("- " + titolo);
    }
    
    // Unisci due array list
    
    // Secondo ArrayList
    	ArrayList<String> manga2 = new ArrayList<>();
    	manga2.add("Attack on Titan");
    	manga2.add("Death Note");
    
    // Unisco manga2 in manga
    	manga.addAll(manga2);
    	
    // Stampo la lista unita
        System.out.println("Lista unita manga e manga2:");
        for (String titolo : manga) {
            System.out.println("- " + titolo);
        }
        
    // Clona un array list in un altro
        
    // Clona Array list
        ArrayList<String> mangaClone = (ArrayList<String>) manga.clone();
        
    // Stampo la lista clonata
        	System.out.println("Lista clonata:");
        	for (String titolo : mangaClone) {
        		System.out.println("- " + titolo);
        }
        
    // Svuota un array list e Testa se l’array list è vuoto oppure no
    
    // Svuota    	
        anime.clear();
        
    // Controlla se è vuoto
        if (anime.isEmpty()) {
            System.out.println("La lista è vuota.");
        } else {
            System.out.println("La lista NON è vuota.");
        }
        
    // Incrementa la capacità dell’array list
    /*
     * Questo metodo non aggiunge elementi, ma dice al ArrayList di prepararsi a contenere almeno minCapacity elementi, 
     * ottimizzando le prestazioni (utile se sai in anticipo quanti dati ci saranno).
     * 
     * ensureCapacity(int minCapacity)
     * 
     * Questo evita che l'array interno venga riallocato più volte se aggiungi tanti elementi.
     * Non cambia size(), solo la capacità interna. 
     * È un'ottimizzazione, non obbligatoria, ma utile per grandi quantità di dati.
     * */
        
     // Imposto la capacità minima a 100 (non la dimensione!)
        manga.ensureCapacity(100);
        
     // Stampa tutti gli elementi di un array list utilizzando la posizione degli elementi, utilizzando l’indice   

     // get(int index)   
        System.out.println("Stampa usando l'indice:");
        for (int i = 0; i < manga.size(); i++) {
            System.out.println("Elemento in posizione " + i + ": " + manga.get(i));
        }
}
}
