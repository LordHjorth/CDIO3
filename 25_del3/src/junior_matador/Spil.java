package junior_matador;

public class Spil {

	private static int runde = 1;
	private static int[] felt = new int[5];
	private static boolean spilIgang = true;
	private static Terning terning = new Terning();
	


	
	public static void opretSpil() {

		while (spilIgang == true) {
			
			felt[runde] = 0;
			while (true) {
				Spiller.gui.getUserButtonPressed("kast terningen " + Spiller.player[runde - 1].getName(), "Kast");
				terning.random();
				Spiller.gui.setDice(terning.getTerning(), 2, 2, terning.getTerning(), 2, 2);

				if (felt[runde] + terning.getTerning() >= 24) {

					Bil.setCarFalse();
					setFelt(-24);
					setFelt(terning.getTerning());
					Bil.setCarTrue();
					Spiller.getSpiller(runde).setBalance(Spiller.getSpiller(runde).getBalance() + 2);

				} else {
					Bil.setCarFalse();
					setFelt(terning.getTerning());
					Bil.setCarTrue();

				}

				Spiller.gui.displayChanceCard(Platform.fields[getFelt()].getDescription());
				
				Konsekvenser.konsekvensAfFelter();
				findVinder();

				runde++;
				if (runde > Spiller.getAntal()) {
					runde = 1;
				}

			}

		}
		

	}
	
	public static int getRunde() {
		return runde;
	}
	
	public static int getFelt(){
		return felt[runde];
	}
	
	public static void setFelt(int i) {
		felt[runde] = felt[runde] + i;
	}
	
	public static void findVinder() {
		if (Spiller.getSpiller(runde).getBalance() < 0) {
			String vinder = Spiller.getSpiller(Spiller.getAntal()-1).getName();
			int vinderVærdi = 0;
			for (int i = 1; i<Spiller.getAntal(); i++) {
				
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
