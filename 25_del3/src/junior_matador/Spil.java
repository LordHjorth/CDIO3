package junior_matador;

public class Spil {

	private static int runde = 1;
	private static int[] felt = new int[5];
	private static boolean spilIgang = true;

	public static int getRunde() {
		return runde;
	}


	
	public static void opretSpil() {

		Terning terning = new Terning();


		while (spilIgang == true) {
			felt[runde] = 0;
			while (Spiller.gui.getUserButtonPressed("kast terningen " + Spiller.player[runde - 1].getName(),
					"Kast") == "Kast") {
				terning.random();
				Spiller.gui.setDice(terning.getTerning(), 2, 2, terning.getTerning(), 2, 2);

				if (felt[runde] + terning.getTerning() >= 24) {

					Bil.setCarFalse();
					felt[runde] = felt[runde] - 24;
					felt[runde] = felt[runde] + terning.getTerning();
					Bil.setCarTrue();
					Spiller.getSpiller(runde).setBalance(Spiller.getSpiller(runde).getBalance() + 2);

				} else {
					Bil.setCarFalse();
					felt[runde] = felt[runde] + terning.getTerning();
					Bil.setCarTrue();

				}

				Spiller.gui.displayChanceCard(Platform.fields[getFelt()].getDescription());
				Konsekvenser.konsekvensAfFelter();
				findVinder();

				runde++;
				if (runde > Spiller.antal) {
					runde = 1;
				}

			}

		}
		

	}
	
	
	public static int getFelt(){
		
		return felt[runde];
		
	}
	
	public static void setFelt(int i) {
		felt[runde] = felt[runde] + i;
	}
	
	public static void findVinder() {
		if (Spiller.getSpiller(runde).getBalance() < 0) {
			String vinder = Spiller.getSpiller(Spiller.antal-1).getName();
			int vinderVærdi = 0;
			for (int i = 1; i<Spiller.antal; i++) {
				
				if (Spiller.getSpiller(i).getBalance() > vinderVærdi) {
					vinderVærdi = Spiller.getSpiller(i).getBalance();
					vinder = Spiller.getSpiller(i).getName();
				}
			}
			Spiller.gui.showMessage(vinder.toUpperCase() + " HAR VUNDET");
			System.exit(0);
		}
	}
	
	
	
	

}
