package view;

import model.Brano; 


public class Main {
	
	public static void main(String[] args) {
		Brano branoScelto = new Brano("Sleep Token", "The Summoning", "alternative metal", 6.36);
		branoScelto.play();
		branoScelto.stampaInfo();
	}
}
