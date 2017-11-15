package junior_matador;
import java.awt.Color;

import javax.swing.JOptionPane;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Spiller {
	private static GUI_Player[] player;
	
	public static void opretSpiller() {
	
		
	GUI gui = new GUI(Platform.fields);
	int antal = gui.getUserInteger("Hvor mange spillere er i", 2, 4);
	
	
	player = new GUI_Player[antal];
	int i = 0;
	while (i < antal) {
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

		player[i] = new GUI_Player(navn,1000, car);
		gui.addPlayer(player[i]);
		i++;
	}
	
	
	
	}
	public static GUI_Player getSpiller(int i) {
		
		return player[i-1];
	}
}
