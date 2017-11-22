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
				konsekvensAfFelter();
				

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
			Spiller.gui.showMessage(Spiller.getSpiller(runde).getName().toUpperCase() + "ER UDE AF SPILLET");
		}
	}
	
	public static void konsekvensAfFelter() {
		Chancekort chancekort = new Chancekort();
		chancekort = Chancekort.getChancekort();
		
		switch (felt[runde] + 1) {
		
		case 1:
			break;
		case 2:
			Spiller.setNyBalance(runde, -1);
			break;
		case 3:
			Spiller.setNyBalance(runde, -1);
			break;
		case 4:// chance felt
			chancekort.konsekvens();
			break;
		case 5:
			Spiller.setNyBalance(runde, -1);
			break;
		case 6:
			Spiller.setNyBalance(runde, -1);
			break;
		case 7:// jail
			break;
		case 8:
			Spiller.setNyBalance(runde, -2);
			break;
		case 9:
			Spiller.setNyBalance(runde, -2);
			break;
		case 10: // chance
			chancekort.konsekvens();
			break;
		case 11:
			Spiller.setNyBalance(runde, -2);
			break;
		case 12:
			Spiller.setNyBalance(runde, -2);
			break;
		case 13:// free parking
			break;
		case 14:
			Spiller.setNyBalance(runde, 3);
			break;
		case 15:
			Spiller.setNyBalance(runde, -3);
			break;
		case 16:// chance kort
			chancekort.konsekvens();
			break;
		case 17:
			Spiller.setNyBalance(runde, -3);
			break;
		case 18:
			Spiller.setNyBalance(runde, -3);
			break;
		case 19:
			Spiller.setNyBalance(runde, -3);
			break;
		case 20:
			Spiller.setNyBalance(runde, -4);
			break;
		case 21:
			Spiller.setNyBalance(runde, -4);
			break;
		case 22:// chance
			chancekort.konsekvens();
			break;
		case 23:
			Spiller.setNyBalance(runde, -5);
			break;
		case 24:
			Spiller.setNyBalance(runde, -5);
			break;

		}
	}
	
	

}
