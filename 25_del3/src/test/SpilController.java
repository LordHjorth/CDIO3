package test;

import junior_matador.Bil;
import junior_matador.Spil;
import junior_matador.Spiller;

public class SpilController {

	private final int STARTFELT = 0;
	private GUIController guiController;
	private SpillerController spillerController;
	private BraetController braetController;
	private NySpiller[] spillere;
	private int startKapital;

	public void playGame() {
		this.guiController = new GUIController();
		this.spillerController = new SpillerController();
		this.braetController = new BraetController();
		initializeGame();
		gameloop();

	}

	private void gameloop() {
		boolean noWinner = false;
		int i = 0;
		while (!noWinner) {
			int a = guiController.setDice();

			guiController.setBilFalse(spillere[i].getPlacering(), i);

			if (spillere[i].getPlacering() + a >= 24) {
				spillere[i].setPlacering(spillere[i].getPlacering() + a - 24);
				konsekvensAfFelter(i);

			} else {

				spillere[i].setPlacering(spillere[i].getPlacering() + a);
				konsekvensAfFelter(i);
			}

			konsekvensAfFelter(i);
			guiController.setBilTrue(spillere[i].getPlacering(), i);

			i++;
			if (i >= this.spillere.length) {
				i = 0;
			}

		}

	}

	private void initializeGame() {
		// Find ud af antalSpillere

		int antalSpillere = guiController.getAntalSpillere();
		if (antalSpillere == 2) {
			startKapital = 20;
		}
		if (antalSpillere == 3) {
			startKapital = 18;
		}
		if (antalSpillere == 4) {
			startKapital = 16;
		}

		this.spillere = new NySpiller[antalSpillere];

		for (int i = 0; i < this.spillere.length; i++) {
			String navn = guiController.getNavnPåSpiller();
			this.spillere[i] = new NySpiller(navn, startKapital, STARTFELT);
		}
		guiController.addPlayers(spillere);

	}

	public void konsekvensAfFelter(int i) {

		switch (spillere[i].getPlacering()) {

		case 1:
			break;
		case 2:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 3:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 4:// chance felt
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 5:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 6:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 7:// jail på besøg
			break;
		case 8:
			// Spiller.setNyBalance(Spil.getRunde(), -2);
			break;
		case 9:
			// Spiller.setNyBalance(Spil.getRunde(), -2);
			break;
		case 10: // chance
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 11:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 12:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 13:// free parking
			break;
		case 14:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 15:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 16:// chance kort
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 17:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 18:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 19:
			// Bil.setCarFalse();
			// Spil.setFelt(6 - Spil.getFelt());
			// Bil.setCarTrue(); // Du ryger i fængsel
			break;
		case 20:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 21:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 22:// chance
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 23:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;
		case 24:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
			System.out.println(spillere[i].getKonto().getKapital());
			break;

		}
	}
}
