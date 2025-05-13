package view;

import model.Brano;
import model.Playlist;


public class Main {
	
	public static void main(String[] args) {
		Brano branoScelto1 = new Brano("Sleep Token", "The Summoning", "alternative metal", 6.36);
		branoScelto1.play();
		
		Playlist nuovaPLayList = new Playlist ("La mia Play List");
		
		Brano branoScelto2 = new Brano ("Halestorm", "Back From the Dead", "Rock", 3.31);
		Brano branoScelto3 = new Brano ("Marilyn Manson", "The Beautiful People", "Metal", 3.47);
		
		nuovaPLayList.addBrano(branoScelto1);
		nuovaPLayList.addBrano(branoScelto2);
		nuovaPLayList.addBrano(branoScelto3);
		nuovaPLayList.removeBrano(branoScelto3);
		nuovaPLayList.infoPlayList();
	}
}
