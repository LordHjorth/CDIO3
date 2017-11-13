
import gui_main.GUI;

public class Main {

	public static void main(String[] args) {
		
		GUI gui = new GUI();
		
		gui.showMessage("HEJ");
		
		gui.showMessage("SIMONE ER SUPER NICE");

		if (gui.getUserLeftButtonPressed("Simone er nice", "NEJ", "JA")==true) {
			gui.showMessage("Du lyver vidst");
		}
			else {
				gui.showMessage("Du har helt styr på det");
				
		}
		
		if (gui.getUserSelection(" Vælg den som er mest nice ", "Simone", "Rasmus ", "Nicholas", "Simon", "Emil") == "Simone") {
			gui.showMessage("Du har helt styr på det");
		}
		 if (gui.getUserSelection(" Vælg den som er mest nice ", "Simone", "Rasmus ", "Nicholas", "Simon", "Emil") == "Rasmus") {
			gui.showMessage("aaaaaaargh");
		}
		 if (gui.getUserSelection(" Vælg den som er mest nice ", "Simone", "Rasmus ", "Nicholas", "Simon", "Emil") == "Nicholas") {
			gui.showMessage("Det kan du da ikke mene");
		}
		 if (gui.getUserSelection(" Vælg den som er mest nice ", "Simone", "Rasmus ", "Nicholas", "Simon", "Emil") == "Simon") {
			gui.showMessage("Det må vidst være en joke");
		}
		 if (gui.getUserSelection(" Vælg den som er mest nice ", "Simone", "Rasmus ", "Nicholas", "Simon", "Emil") == "Emil") {
			gui.showMessage("i en lille grad");
		}




	}
}
