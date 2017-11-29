package game;

import java.util.List;
import gui_fields.GUI_Player;

import gui_main.GUI;
public class GUIController {

	private GUI gui;
	private GUI_Player[] guiPlayers;
	private TerningController terning =new TerningController();

	BraetController bræt = new BraetController();

	public GUIController() {
		this.gui = new GUI(bræt.opretBreat());
	}
	
	public int setDice() {
		gui.getUserButtonPressed("Kast Terning", "Kast");
		terning.kastTerning();
		gui.setDie(terning.getTerning());
		return terning.getTerning();
	}
	
	public int getAntalSpillere() {
		int userInteger = gui.getUserInteger("Indtast antal Spillere", 2, 4);
		return userInteger;
	}

	public String getNavnPåSpiller() {
		String navn = gui.getUserString("Indtast Navn");
		return navn;
	}
	
	public void setBilTrue(int placering, int spiller) {
		bræt.getFelt(placering).setCar(guiPlayers[spiller], true);
	}
	
	public void setBilFalse(int placering, int spiller) {
		bræt.getFelt(placering).setCar(guiPlayers[spiller], false);
	}
	

	public void addPlayers(NySpiller[] spillere) {
		this.guiPlayers = new GUI_Player[spillere.length];
		for (int i = 0; i < spillere.length; i++) {
			this.guiPlayers[i] = new GUI_Player(spillere[i].getNavn(), spillere[i].getKonto().getKapital());
			setBilTrue(0, i);
			gui.addPlayer(this.guiPlayers[i]);
		}
	}
	
	public void getVinderBesked(List<String> s) {
		gui.showMessage(s.toString().toUpperCase() + " HAR VUNDET! GZ M8. GGWP. GL");
	}
	
	public void setNyBalance(int spiller, int ekstraBalance) {
		this.guiPlayers[spiller].setBalance(ekstraBalance);
	}
	
	public void showMessage(String s) {
		gui.displayChanceCard(s);
	}

}
