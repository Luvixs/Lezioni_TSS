package View;

import Model.Playlist;
import Model.Brano;

public class Main {
	public static void main(String[] args) {
		
		Playlist miaPlayList = new Playlist("Rock '70");
		miaPlaylist.addBrano(nuovoBrano);
		miaPlaylist.addBrano(nuovoBrano2);
		miaPlaylist.infoPlaylist();
		
	}
}
