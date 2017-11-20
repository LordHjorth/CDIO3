package junior_matador;

public class Spil {

	private static int runde = 1;
	
	public static int getRunde() {
		return runde;
	}
	public static void opretSpil() {

		Terning terning = new Terning();

		int[] felt = new int[5];
		
		while (true) {
			felt[runde] = 0;
			while (Spiller.gui.getUserButtonPressed("kast terningen " + Spiller.player[runde - 1].getName(),
					"Kast") == "Kast") {
				terning.random();
				Spiller.gui.setDice(terning.getTerning(), 2, 2, terning.getTerning(), 2, 2);

				if (felt[runde] + terning.getTerning() >= 24) {

					Platform.fields[felt[runde]].setCar(Spiller.getSpiller(runde), false);
					felt[runde] = felt[runde] - 24;
					felt[runde] = felt[runde] + terning.getTerning();
					Platform.fields[felt[runde]].setCar(Spiller.getSpiller(runde), true);
					Spiller.getSpiller(runde).setBalance(Spiller.getSpiller(runde).getBalance() + 2);

				} else {
					Platform.fields[felt[runde]].setCar(Spiller.getSpiller(runde), false);
					felt[runde] = felt[runde] + terning.getTerning();
					Platform.fields[felt[runde]].setCar(Spiller.getSpiller(runde), true);

				}
				switch (felt[runde]+1) {

				case 1:
					break;
				case 2:
					Spiller.setNyBalance(runde, -1);
					break;
				case 3:
					Spiller.setNyBalance(runde, -1);
					break;
				case 4://chance felt
					Chancekort hej = new Chancekort();
					hej = Chancekort.getChancekort();
					Spiller.gui.displayChanceCard(hej.tekst);
					Spiller.setNyBalance(runde, hej.beløb);
					Platform.fields[felt[runde]].setCar(Spiller.getSpiller(runde), false);
					Platform.fields[felt[runde]+hej.felt].setCar(Spiller.getSpiller(runde), true);
					
					break;
				case 5:
					Spiller.setNyBalance(runde, -1);
					break;
				case 6:
					Spiller.setNyBalance(runde, -1);
					break;
				case 7:
					//jail 
					break;
				case 8:
					Spiller.setNyBalance(runde, -2);
					break;
				case 9:
					Spiller.setNyBalance(runde, -2);
					break;
				case 10:	//chance
					Chancekort hej1 = new Chancekort();
					hej = Chancekort.getChancekort();
					Spiller.gui.displayChanceCard(hej1.tekst);
					Spiller.setNyBalance(runde, hej1.beløb);
					Platform.fields[felt[runde]].setCar(Spiller.getSpiller(runde), false);
					Platform.fields[felt[runde]+hej1.felt].setCar(Spiller.getSpiller(runde), true);
			
					break;
				case 11:
					Spiller.setNyBalance(runde, -2);
					break;
				case 12:
					Spiller.setNyBalance(runde, -2);
					break;
				case 13:
//					free parking
					break;
				case 14:
					Spiller.setNyBalance(runde, 3);
					break;
				case 15:
					Spiller.setNyBalance(runde, -3);
					break;
				case 16:
//					chance kort
					Chancekort hej2 = new Chancekort();
					hej = Chancekort.getChancekort();
					Spiller.gui.displayChanceCard(hej2.tekst);
					Spiller.setNyBalance(runde, hej2.beløb);
					Platform.fields[felt[runde]].setCar(Spiller.getSpiller(runde), false);
					Platform.fields[felt[runde]+hej2.felt].setCar(Spiller.getSpiller(runde), true);
					
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
				case 22:
//					chance
					Chancekort hej3 = new Chancekort();
					hej = Chancekort.getChancekort();
					Spiller.gui.displayChanceCard(hej3.tekst);
					Spiller.setNyBalance(runde, hej3.beløb);
					Platform.fields[felt[runde]].setCar(Spiller.getSpiller(runde), false);
					Platform.fields[felt[runde]+hej3.felt].setCar(Spiller.getSpiller(runde), true);
					
					break;
				case 23:
					Spiller.setNyBalance(runde, -5);
					break;
				case 24:
					Spiller.setNyBalance(runde, -5);
					break;

				}
				runde++;
				if (runde > Spiller.antal) {
					runde = 1;
				}

				
			}

		}

	}
}
