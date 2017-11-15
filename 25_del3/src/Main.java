import gui_main.GUI;
import java.awt.Color;
import java.awt.Image;
import java.lang.reflect.Field;
import java.util.Set;

import javax.swing.JOptionPane;

import desktop_codebehind.Car;
import desktop_fields.*;
import gui_fields.GUI_Brewery;
import gui_fields.GUI_Car;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Player;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;

public class Main {

	public static void main(String[] args) {

		GUI_Field[] fields = new GUI_Field[40];

		fields[0] = new GUI_Start("START", "Modtag: 2 kr", "Du får 2 kr fra banken, hver gang du passerer start",
				Color.green, Color.black);
		fields[1] = new GUI_Brewery();
		fields[2] = new GUI_Street("Blækspruttre", " Pris: 3 kr", " Koster 3 kr.", "", Color.blue, Color.WHITE);
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
		fields[12] = new GUI_Street("GYLDNE TÅRN", " Pris: 3 kr", " Koster 3 kr.", "", Color.pink, Color.black);
		fields[13] = new GUI_Street("GYLDNE TÅRN", " Pris: 3 kr", " Koster 3 kr.", "", Color.pink, Color.black);
		fields[14] = new GUI_Street();
		fields[15] = new GUI_Street();
		fields[16] = new GUI_Street();
		fields[17] = new GUI_Street();
		fields[18] = new GUI_Street();
		fields[19] = new GUI_Street();
		fields[20] = new GUI_Street();
		fields[21] = new GUI_Street();
		fields[22] = new GUI_Street();
		fields[23] = new GUI_Street();
		fields[24] = new GUI_Street();
		fields[25] = new GUI_Street();
		fields[26] = new GUI_Street();
		fields[27] = new GUI_Street();
		fields[28] = new GUI_Street();
		fields[29] = new GUI_Street();
		fields[30] = new GUI_Street();
		fields[31] = new GUI_Street();
		fields[32] = new GUI_Street();
		fields[33] = new GUI_Street();
		fields[34] = new GUI_Street();
		fields[35] = new GUI_Street();
		fields[36] = new GUI_Street();
		fields[37] = new GUI_Street();
		fields[38] = new GUI_Street();
		fields[39] = new GUI_Street();

		GUI gui = new GUI(fields);
		int msg = gui.getUserInteger("Hvor mange spillere er i", 2, 4);

		int i = 0;
		while (i < msg) {
			int v = i + 1;
			String navn = JOptionPane.showInputDialog("Dit navn spiller" + v + " : ");
			GUI_Car car = new GUI_Car();
			String farve = gui.getUserSelection("Farven på din bil", "Sort", "Gul", "Rød", "Grøn", "Pink");
			if (farve == "Sort") {
				car.setPrimaryColor(Color.BLACK);
			}
			if (farve == "Gul") {
				car.setPrimaryColor(Color.yellow);
			}
			if (farve == "Rød") {
				car.setPrimaryColor(Color.red);
			}
			if (farve == "Grøn") {
				car.setPrimaryColor(Color.green);
			}
			if (farve == "Pink") {
				car.setPrimaryColor(Color.pink);
			}

			gui.addPlayer(new GUI_Player(navn, 1000, car));
			i++;
		}

	}

}
