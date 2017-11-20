package junior_matador;

public class Spil {

	public static void opretSpil() {

		Terning terning = new Terning();

		int[] felt = new int[5];
		int i = 1;
		while (true) {
			felt[i] = 0;
			while (Spiller.gui.getUserButtonPressed("kast terningen " + Spiller.player[i - 1].getName(),
					"Kast") == "Kast") {
				terning.random();
				Spiller.gui.setDice(terning.getTerning(), 2, 2, terning.getTerning(), 2, 2);

				if (felt[i] + terning.getTerning() >= 24) {

					Platform.fields[felt[i]].setCar(Spiller.getSpiller(i), false);
					felt[i] = felt[i] - 24;
					felt[i] = felt[i] + terning.getTerning();
					Platform.fields[felt[i]].setCar(Spiller.getSpiller(i), true);
					Spiller.getSpiller(i).setBalance(Spiller.getSpiller(i).getBalance() + 2);
					// System.out.println(Spiller.getNyBalance());
					// System.out.println(Spiller.getSpiller(i).getBalance());

				} else {
					Platform.fields[felt[i]].setCar(Spiller.getSpiller(i), false);
					felt[i] = felt[i] + terning.getTerning();
					Platform.fields[felt[i]].setCar(Spiller.getSpiller(i), true);

				}
				switch (felt[i]) {

				case 1:
					break;
				case 2:
					Spiller.setNyBalance(i, -1);
					break;
				case 3:
					Spiller.setNyBalance(i, -1);
					break;
				case 4:
					//chance felt
					break;
				case 5:
					Spiller.setNyBalance(i, -1);
					break;
				case 6:
					Spiller.setNyBalance(i, -1);
					break;
				case 7:
					//jail 
					break;
				case 8:
					Spiller.setNyBalance(i, -2);
					break;
				case 9:
					Spiller.setNyBalance(i, -2);
					break;
				case 10:
					//chance
					break;
				case 11:
					Spiller.setNyBalance(i, -2);
					break;
				case 12:
					Spiller.setNyBalance(i, -2);
					break;
				case 13:
//					free parking
					break;
				case 14:
					Spiller.setNyBalance(i, 3);
					break;
				case 15:
					Spiller.setNyBalance(i, -3);
					break;
				case 16:
//					chance kort
					break;
				case 17:
					Spiller.setNyBalance(i, -3);
					break;
				case 18:
					Spiller.setNyBalance(i, -3);
					break;
				case 19:
					Spiller.setNyBalance(i, -3);
					break;
				case 20:
					Spiller.setNyBalance(i, -4);
					break;
				case 21:
					Spiller.setNyBalance(i, -4);
					break;
				case 22:
//					chance
					break;
				case 23:
					Spiller.setNyBalance(i, -5);
					break;
				case 24:
					Spiller.setNyBalance(i, -5);
					break;

				}
				i++;
				if (i > Spiller.antal) {
					i = 1;
				}

				Chancekort.getChancekort();
			}

		}

	}
}
