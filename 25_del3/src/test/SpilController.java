package test;

public class SpilController {

	private final int STARTFELT = 0;
	private final int START_KAPITAL = 31;
	private GUIController guiController;
	private SpillerController spillerController;
	private BraetController braetController;
	private NySpiller[] spillere;

	public void playGame() {
		this.guiController = new GUIController();
		this.spillerController = new SpillerController();
		this.braetController = new BraetController();
		braetController.opretBraet();
		initializeGame();
		gameloop();
		
		
		
	}

	private void gameloop() {
		boolean noWinner = false;
		while (noWinner) {


			
		}
		
	}

	private void initializeGame() {
		// Find ud af antalSpillere
		int antalSpillere = guiController.getAntalSpillere();
		this.spillere = new NySpiller[antalSpillere];
		
		for (int i = 0; i < this.spillere.length; i++) {
			String navn = guiController.getNavnPåSpiller();
			this.spillere[i] = new NySpiller(navn, START_KAPITAL, STARTFELT);
		}
		
		guiController.addPlayers(spillere);
		//Sæt brættet op;
		
		
		
	}

}
