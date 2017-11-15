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
		Color Tower = new Color(74, 159, 223);
		Color Crater = new Color(160, 160, 160);
		Color Palace_gates = new Color(255, 204, 255);
		Color Cold_Desert = new Color(204, 255, 255);
		Color Walled_City = new Color(255, 102, 0);
		Color Monastery = new Color(255, 204, 229);
		Color Black_cave = new Color(0, 0, 0);
		Color Huts = new Color(204, 102, 0);
		Color The_werewall = new Color(229, 31, 31);
		Color The_pit = new Color(224, 224, 224);
		Color goldmine = new Color(212, 175, 55);
		

		fields[0] = new GUI_Start("START", "Modtag: 2 kr", "Du får 2 kr fra banken, hver gang du passerer start",
				Color.green, Color.black);
		fields[1] = new GUI_Street();
		fields[2] = new GUI_Street("Blæksprutten", " Pris: 3 kr", " Koster 3 kr.", "", Color.blue, Color.WHITE);
		fields[3] = new GUI_Street("SVEND SVINGARM", " Pris: 2 kr", " Koster 2 kr.", "", Color.blue, Color.WHITE);
		fields[4] = new GUI_Street();
		fields[5] = new GUI_Street();
		fields[6] = new GUI_Street();
		fields[7] = new GUI_Street("DEMONEN", " Pris: 4 kr", " Koster 4 kr.", "", Color.red, Color.black);
		fields[8] = new GUI_Street("GYLDNE TÅRN", " Pris: 3 kr", " Koster 3 kr.", "", Color.red, Color.black);
		fields[9] = new GUI_Street();
		fields[10] = new GUI_Jail();
		fields[10].setSubText("FÆNGSEL");
		fields[11] = new GUI_Street();
		fields[12] = new GUI_Street("TEKOPPERNE", " Pris: 3 kr", " Koster 3 kr.", "", Color.orange, Color.black);
		fields[13] = new GUI_Street("TORNADOEN", " Pris: 3 kr", " Koster 3 kr.", "", Color.orange, Color.black);
		fields[14] = new GUI_Street();
		fields[15] = new GUI_Street();
		fields[16] = new GUI_Street();
		fields[17] = new GUI_Street("HURLUMHEJ", " Pris: 3 kr", " Koster 3 kr.", "", Color.black, Color.red);
		fields[18] = new GUI_Street("SPØGELSES HUSET", " Pris: 3 kr", " Koster 3 kr.", "", Color.black, Color.red);
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
