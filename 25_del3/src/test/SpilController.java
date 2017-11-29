package test;

import java.util.*;

public class SpilController {

	private final int STARTFELT = 0;
	private GUIController guiController;
	private NySpiller[] spillere;
	private int startKapital;
	private boolean noWinner = false;
	ChancekortController chancekort = new ChancekortController();

	public void playGame() {
		this.guiController = new GUIController();
		initializeGame();
		gameloop();
	}

	private void gameloop() {
		while (!noWinner) {
			for (int i = 0; i < spillere.length; i++) {
				int faceValue = guiController.setDice();

				guiController.setBilFalse(spillere[i].getPlacering(), i);

				if (spillere[i].getPlacering() + faceValue > 23) {
					passerStart(i);
					spillere[i].setPlacering(spillere[i].getPlacering() + faceValue - 24);

				} else {
					spillere[i].setPlacering(spillere[i].getPlacering() + faceValue);
				}

				guiController.setBilTrue(spillere[i].getPlacering(), i);
				konsekvensAfFelter(i);
				guiController.setNyBalance(i, spillere[i].getKonto().getKapital());

				pickAWinner(i);

				System.out.println("Spiller navn: " + spillere[i].getNavn() + "Spiller kapital: "
						+ spillere[i].getKonto().getKapital() + "Spiller placering: " + spillere[i].getPlacering());
			}
		}
		System.exit(0);
	}

	private void pickAWinner(int spiller) {
		int vinderBalance = 0;
		List<String> vinderNavn = new ArrayList<String>();

		if (spillere[spiller].getKonto().getKapital() < 0) {
			noWinner = true;
			for (int i = 0; i < spillere.length; i++) {
				if (spillere[i].getKonto().getKapital() > vinderBalance) {
					vinderNavn.clear();
					vinderNavn.add(spillere[i].getNavn());
					vinderBalance = spillere[i].getKonto().getKapital();
				} else if (spillere[i].getKonto().getKapital() == vinderBalance) {
					vinderNavn.add(spillere[i].getNavn());
					vinderBalance = spillere[i].getKonto().getKapital();
				}
			}
			guiController.getVinderBesked(vinderNavn);
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
		chancekort.opretChancekort();
	}

	public void konsekvensAfFelter(int i) {

		switch (spillere[i].getPlacering() + 1) {

		case 1: // start
			break;
		case 2:
			landOnField(i, -1);
			break;
		case 3:
			landOnField(i, -1);
			break;
		case 4:// chance
			landOnChancekort(i);
			break;
		case 5:
			landOnField(i, -1);
			break;
		case 6:
			landOnField(i, -1);
			break;
		case 7:// jail på besøg
			guiController.showMessage("PÅ BESØG");
			// guiController.setBilTrue(spillere[i].getPlacering()-12, i);
			break;
		case 8:
			landOnField(i, -2);
			break;
		case 9:
			landOnField(i, -2);
			break;
		case 10: // chance
			landOnChancekort(i);
			break;
		case 11:
			landOnField(i, -2);
			break;
		case 12:
			landOnField(i, -2);
			break;
		case 13:// free parking
			guiController.showMessage("FREE PARKING");
			break;
		case 14:
			landOnField(i, -3);
			break;
		case 15:
			landOnField(i, -3);
			break;
		case 16:// chance
			landOnChancekort(i);
			break;
		case 17:
			landOnField(i, -3);
			break;
		case 18:
			landOnField(i, -3);
			break;
		case 19:
			// Go to jail
			guiController.showMessage("GÅ I FÆNGSEL");
			break;
		case 20:
			landOnField(i, -4);
			break;
		case 21:
			landOnField(i, -4);
			break;
		case 22:// chance
			landOnChancekort(i);
			break;
		case 23:
			landOnField(i, -5);
			break;
		case 24:
			landOnField(i, -5);
			break;
		}
	}

	public void landOnChancekort(int i) {

		ChancekortController chancekortet = chancekort.getChancekort();
		landOnField(i, chancekortet.getBeløb());
		guiController.setBilFalse(spillere[i].getPlacering(), i);
		
		if (chancekortet.getValue() == 5 || chancekortet.getValue() == 1) {
			spillere[i].setPlacering(chancekortet.getFelt());
		}
		else {
			spillere[i].setPlacering(spillere[i].getPlacering() + chancekortet.getFelt());
		}
		if (chancekortet.getValue() == 2 || chancekortet.getValue() == 3) {
			konsekvensAfFelter(i);
		}

		guiController.setBilTrue(spillere[i].getPlacering(), i);
		guiController.showMessage(chancekortet.getTekst());
	}
	

	private void landOnField(int i, int nyBalance) {
		spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + nyBalance);
	}
	private void passerStart(int i) {
		spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
	}
}
