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

			} else {

				spillere[i].setPlacering(spillere[i].getPlacering() + a);
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

		switch (spillere[i].getPlacering()-1) {

		case 1:
			break;
		case 2:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -1);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());
			break;
		case 3:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -1);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 4:// chance felt
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 0);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 5:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -1);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 6:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -1);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 7:// jail på besøg
			break;
		case 8:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -2);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());
			break;
		case 9:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -2);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 10: // chance
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() +0);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 11:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -2);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 12:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -2);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 13:// free parking
			break;
		case 14:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -3);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 15:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -3);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 16:// chance kort
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 0);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 17:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -3);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 18:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -3);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 19:
			//Go to jail
			break;
		case 20:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -4);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 21:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() -4);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 22:// chance
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() +0);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 23:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 5);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;
		case 24:
			spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 5);
			System.out.println("Spiller navn: "+spillere[i].getNavn()+"Spiller kapital: "+spillere[i].getKonto().getKapital()+"Spiller placering: "+spillere[i].getPlacering());

			break;

		}
	}
}
