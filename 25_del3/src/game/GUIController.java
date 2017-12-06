package game;

import java.util.List;
import gui_fields.GUI_Player;

import gui_main.GUI;
public class GUIController {

	private GUI gui;
	private GUI_Player[] guiPlayers;
	private TerningController terning =new TerningController();

	BraetController braetController;

	public GUIController(BraetController braetController) { //opretter GUIController konstruktøren med BraetController som parameter.
		this.braetController = braetController;
		this.gui = new GUI(braetController.opretBreat());
	}
	
	public int setDice() { //kasterne terning og returnere værdien.
		gui.getUserButtonPressed("Kast Terning", "Kast");
		terning.kastTerning();
		gui.setDie(terning.getTerning());
		return terning.getTerning();
	}
	
	public int getAntalSpillere() { //får brugeren til at indtaste antal af spillere i et interval mellem 2 og 4.
		int userInteger = gui.getUserInteger("Indtast antal Spillere", 2, 4);
		return userInteger;
	}

	public String getNavnPåSpiller() { //får brugeren til indtaste navn som bruges til at sætte spillerens navn
		String navn = gui.getUserString("Indtast Navn");
		return navn;
	}
	
	public void setBilTrue(int placering, int spiller) { //Sætter en bil på brættet
		braetController.getFelt(placering).setCar(guiPlayers[spiller], true);
	}
	
	public void setBilFalse(int placering, int spiller) { //fjerner en bil fra brættet
		braetController.getFelt(placering).setCar(guiPlayers[spiller], false);
	}
	

	public void addPlayers(NySpiller[] spillere) { //tilføjer et array af spillere til gui'ens GUI_Player array, så de kan blive vist på brættet
		this.guiPlayers = new GUI_Player[spillere.length];
		for (int i = 0; i < spillere.length; i++) {
			this.guiPlayers[i] = new GUI_Player(spillere[i].getNavn(), spillere[i].getKonto().getKapital());
			setBilTrue(0, i);
			gui.addPlayer(this.guiPlayers[i]);
		}
	}
	
	public void getVinderBesked(List<String> s) { //viser en super nice og flot og awesome og sjov kommentar på gui'en
		gui.showMessage(s.toString().toUpperCase() + " HAR VUNDET! GZ M8. GGWP. GL");
	}
	
	public void setNyBalance(int spiller, int ekstraBalance) { //sætter ny balance for spilleren
		this.guiPlayers[spiller].setBalance(ekstraBalance);
	}
	
	public void showMessage(String s) { //bruges til at printe et felt i midten brættet.
		gui.displayChanceCard(s);
	}

}
