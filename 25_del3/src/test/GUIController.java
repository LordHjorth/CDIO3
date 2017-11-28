package test;

import java.awt.Color;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class GUIController {
	
	private GUI gui;
	private GUI_Player[] guiPlayers;

	public GUIController() {
		this.gui = new GUI();
		
		
		
	}
	


	public int getAntalSpillere() {
		int userInteger = gui.getUserInteger("Indtast antal Spillere");
		return userInteger;
		
	}

	public String getNavnPåSpiller() {
		String navn = gui.getUserString("Indtast Navn");
		return navn;
		
		
	
	}

	public void addPlayers(NySpiller[] spillere) {
		this.guiPlayers = new GUI_Player[spillere.length];
		for (int i = 0; i < spillere.length; i++) {
			this.guiPlayers[i] = new GUI_Player(spillere[i].getNavn(),spillere[i].getKonto().getKapital());
			gui.addPlayer(this.guiPlayers[i]);
			
		}
		
  
		
		
	}
	
	}


