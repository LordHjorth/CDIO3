package junior_matador;
import java.awt.Color;

import javax.swing.JOptionPane;

import gui_fields.GUI_Brewery;
import gui_fields.GUI_Car;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_fields.GUI_Tax;
import gui_main.GUI;

public class Platform {

	public static GUI_Field[] fields = new GUI_Field[40];
	
	public static void opretSpilleplade () {
		
		Color Start = new Color(76, 153, 0);
		Color Madboder = new Color(102, 102, 0); //Opretter farven der kobler madboderne
		Color SlikogIs = new Color(102,178,255);
		Color Intellektuel = new Color(181, 83, 142);
		Color AktivUnderholdning = new Color(255, 243, 131);
		Color BioSpil = new Color(223, 63, 63);
		Color Butikker= new Color(245, 249, 119);
		Color Black_cave = new Color(0, 0, 0);
		Color Huts = new Color(204, 102, 0);
		Color The_werewall = new Color(229, 31, 31);
		Color The_pit = new Color(224, 224, 224);
		Color goldmine = new Color(212, 175, 55);
		

		fields[0] = new GUI_Start("START", "Modtag: 2 kr", "Du får 2 kr fra banken, hver gang du passerer start",
				Color.green, Color.black);
		fields[1] = new GUI_Street("Burgerbaren","Pris:1 kr","Burgerbaren","",Madboder,Color.BLACK);
		fields[2] = new GUI_Street("Pizzahuset", " Pris: 1 kr", "Pizzahuset", "", Madboder, Color.BLACK);
		fields[3] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.WHITE, Color.BLACK);
		fields[4] = new GUI_Street("Slikbutikken","Pris: 1 kr", "Slikbutikken","",SlikogIs,Color.BLACK);
		fields[5] = new GUI_Street("Iskiosken","Pris: 1 kr", "Iskiosken","",SlikogIs,Color.BLACK);
		fields[6] = new GUI_Jail();
		fields[6].setSubText("Fængsel");
		fields[6].setDescription("På besøg i fængslet");
		fields[7] = new GUI_Street("Museet", " Pris: 2 kr", " Museet", "", Intellektuel, Color.black);
		fields[8] = new GUI_Street("Biblioteket", " Pris: 2 kr", " Biblioteket", "", Intellektuel, Color.black);
		fields[9] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.WHITE, Color.BLACK);
		fields[10] = new GUI_Street("Skaterparken", " Pris: 2 kr", " Skaterparken", "", AktivUnderholdning, Color.black);
		fields[11] = new GUI_Street("Swimmingpoolen", " Pris: 2 kr", " Swimmingpoolen", "", AktivUnderholdning, Color.black);
		fields[12] = new GUI_Refuge("", "Gratis Parkering", "Gratis Parkering", "Her har du helle!", Color.WHITE, Color.BLACK);
		fields[13] = new GUI_Street("Spillehallen", " Pris: 3 kr", " Spillehallen", "", BioSpil, Color.black);
		fields[14] = new GUI_Street("Biografen", " Pris: 3 kr", " Biografen", "", BioSpil, Color.black);
		fields[15] = new GUI_Chance("?", "Chance", "Prøv Lykken", Color.WHITE, Color.BLACK);
		fields[16] = new GUI_Street("Legetøjsbutikken", " Pris: 3 kr", " Legetøjsbutikken", "", Butikker, Color.black);
		fields[17] = new GUI_Street("Dyrehandlen", " Pris: 3 kr", " Dyrehandlen", "", Butikker, Color.black);
		fields[18] = new GUI_Jail();
		fields[18].setSubText("Fængsel");
		fields[18].setDescription("Gå i fængslet");
		fields[19] = new GUI_Street();
		fields[20] = new GUI_Street();
		fields[21] = new GUI_Street();
		fields[22] = new GUI_Street("", " Pris: 3 kr", " Koster 3 kr.", "", Color.yellow, Color.black);
		fields[23] = new GUI_Street("", " Pris: 3 kr", " Koster 3 kr.", "", Color.yellow, Color.black);
		fields[24] = new GUI_Street();
		fields[25] = new GUI_Street();
		fields[26] = new GUI_Street();
		fields[27] = new GUI_Street("", " Pris: 3 kr", " Koster 3 kr.", "", goldmine, Color.white);
		fields[28] = new GUI_Street("", " Pris: 3 kr", " Koster 3 kr.", "", goldmine, Color.white);
		fields[29] = new GUI_Street();
		fields[30] = new GUI_Street();
		fields[31] = new GUI_Street();
		fields[32] = new GUI_Street("", " Pris: 3 kr", " Koster 3 kr.", "", Color.pink, Color.black);
		fields[33] = new GUI_Street("", " Pris: 3 kr", " Koster 3 kr.", "", Color.pink, Color.black);
		fields[34] = new GUI_Street();
		fields[35] = new GUI_Street();
		fields[36] = new GUI_Street();
		fields[37] = new GUI_Street("", " Pris: 3 kr", " Koster 3 kr.", "", Start, Color.black);
		fields[38] = new GUI_Street("", " Pris: 3 kr", " Koster 3 kr.", "", Start, Color.black);
		fields[39] = new GUI_Street();

		
		
		
	}
	
	
}
