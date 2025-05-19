package Model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	
	private String nomePL;
	private List<Brano> brani;
	
	public Playlist(String nomePL, List<Brano> brani) {
		super();
		this.nomePL = nomePL;
		this.brani = new ArrayList<Brano>(10);
		System.out.println("hai creato una playlist..");
		
		
	}

	public String getNomePL() {
		return nomePL;
	}

	public List<Brano> getBrani() {
		return brani;
	}
	
	public void addBrano(Brano brano) {
		if(brani.size() <= 10) {
			brani.add(brano);
		}else {
			System.out.println("non puoi più inserire canzoni");
		}
	}
	
	public void infoPLaylist() {
		System.out.println("hai scelto la playlist: " + this.nomePL);
		int spazioDisponibile = 10 - this.brani.size();
		
	}
}
