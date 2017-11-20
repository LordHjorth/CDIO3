package junior_matador;

import java.awt.Color;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Spiller {
	public static GUI_Player[] player;
	public static GUI gui = new GUI(Platform.fields);
	public static int antal = gui.getUserInteger("Hvor mange spillere er i", 2, 4);
	private static int balance;

	public static void opretSpiller() {
	
		player = new GUI_Player[antal];
		int i = 0;
		while (i < antal) {
			int v = i + 1;

			String navn = gui.getUserString("Dit navn spiller" + v + " : ");
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
				car.setPrimaryColor(Color.MAGENTA);
			}

			player[i] = new GUI_Player(navn, 20, car);
			gui.addPlayer(player[i]);
			Platform.fields[0].setCar(player[i], true);

			i++;
		}

	}

	public static GUI_Player getSpiller(int i) {
		return player[i - 1];
	}


	public static void setNyBalance(int i, int beløb) {
		
		Spiller.getSpiller(i).setBalance(Spiller.getSpiller(i).getBalance()+beløb);

		
		

	}
//
//	public static int getNyBalance() {
//
//		return balance;
//
//	}
}
