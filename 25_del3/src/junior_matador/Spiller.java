package junior_matador;

import gui_fields.GUI_Player;
import gui_main.GUI;

public class Spiller {

	public static GUI gui = new GUI(Platform.fields);
	private static int antal = gui.getUserInteger("Hvor mange spillere er i", 2, 4);
	public static GUI_Player[] player = new GUI_Player[antal];
	

	public static void opretSpiller() {

		int spillerNummer = 0;
		int vistSpillerNummer = 1;
		
		while (spillerNummer < antal) {
			
			String navn = gui.getUserString("Dit navn spiller" + vistSpillerNummer + " : ");
			player[spillerNummer] = new GUI_Player(navn, setStartKapital(antal), Bil.setBil());
			gui.addPlayer(player[spillerNummer]);
			Platform.fields[0].setCar(player[spillerNummer], true);

			vistSpillerNummer++;
			spillerNummer++;
		}

	}
	public static int getAntal() {
		return antal;
	}

	public static GUI_Player getSpiller(int i) {
		return player[i - 1];
	}

	public static void setNyBalance(int i, int beløb) {

		Spiller.getSpiller(i).setBalance(Spiller.getSpiller(i).getBalance() + beløb);

	}

	public static int setStartKapital(int antalSpillere) {
		int kapital = 2;
		if (antalSpillere == 2) {
			kapital = 20;
		}
		if (antalSpillere == 3) {
			kapital = 18;
		}
		if (antalSpillere == 4) {
			kapital = 16;
		}
		return kapital;
	}

}
