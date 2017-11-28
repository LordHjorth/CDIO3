package test;

import java.awt.Color;

import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Player;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class Main {
	
	public static void main(String[] args) {
		BraetController b= new BraetController();
		b.opretBraet();
		
		SpilController spilController = new SpilController();
		spilController.playGame();
		
		
	}

}
