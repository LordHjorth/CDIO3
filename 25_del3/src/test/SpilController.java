package test;

public class SpilController {

	private final int STARTFELT = 0;
	private GUIController guiController;
	private SpillerController spillerController;
	private NySpiller[] spillere;
	private int startKapital;

	public void playGame() {
		this.guiController = new GUIController();
		this.spillerController = new SpillerController();
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

		// Sæt brættet op;

	}

}
