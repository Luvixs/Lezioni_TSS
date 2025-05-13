package model;

import java.util.ArrayList;


public class Playlist {
	
	ArrayList<Brano> listaBrani = new ArrayList<>();
	public String nome;
	public double durataTotale = 0;
	public double numeroBrani = 0;
	
	public Playlist (String nome) {
		this.nome = nome;
		
		
	};
	
	public void addBrano(Brano brano) {
		this.listaBrani.add(brano);
		this.numeroBrani++;
		this.durataTotale += brano.durata;
	}
	
	public void removeBrano(Brano brano) {
		this.listaBrani.remove(brano);
		this.numeroBrani--;
		this.durataTotale -= brano.durata;
	}
	
	public void numeroBraniPlayList () {
		this.listaBrani.size();
	}
	
	/*public void calcTotDurata () {
		 double durataTotale = 0;
		 for(Brano brano : this.listaBrani) {
			 durataTotale += brano.durata;
		 }
		 this.durataTotale = durataTotale;
	}*/
	public void infoPlayList() {
		System.out.println( "Nome: " + this.nome +" "+ "Numero Brani: " + this.numeroBrani + " " + "Durata Totale: " + this.durataTotale + "\n Brani della playlist: ");
		for(Brano brano : this.listaBrani) {
			brano.stampaInfo();
		}
		}
		
	
}
