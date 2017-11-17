package junior_matador;

public class Spil {

	public static void opretSpil() {

		Terning terning = new Terning();


		int[] felt = new int[5];
		int i = 1;
		while (i <= Spiller.antal) {
			felt[i] = 0;
			while (Spiller.gui.getUserButtonPressed("kast terningen " + Spiller.player[i-1].getName(), "Kast") == "Kast") {
				terning.random();
				Spiller.gui.setDice(terning.getTerning(), 2, 2, terning.getTerning(), 2, 2);

				Platform.fields[felt[i]].setCar(Spiller.getSpiller(i), false);
				felt[i] = felt[i] + terning.getTerning();
				Platform.fields[felt[i]].setCar(Spiller.getSpiller(i), true);

				i++;
				if (i > Spiller.antal) {
					i = 1;
				}

			}

		}

		// while (true) {
		//
		// int i = 1;
		// switch (i) {
		//
		// case 1:
		// Platform.fields[0].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 2:
		// Platform.fields[1].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 3:
		// Platform.fields[2].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 4:
		// Platform.fields[3].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 5:
		// Platform.fields[4].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 6:
		// Platform.fields[5].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 7:
		// Platform.fields[6].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 8:
		// Platform.fields[7].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 9:
		// Platform.fields[8].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 10:
		// Platform.fields[9].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 11:
		// Platform.fields[10].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 12:
		// Platform.fields[11].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 13:
		// Platform.fields[12].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 14:
		// Platform.fields[13].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 15:
		// Platform.fields[14].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 16:
		// Platform.fields[15].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 17:
		// Platform.fields[16].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 18:
		// Platform.fields[17].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 19:
		// Platform.fields[18].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 20:
		// Platform.fields[19].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 21:
		// Platform.fields[20].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 22:
		// Platform.fields[21].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 23:
		// Platform.fields[22].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 24:
		// Platform.fields[23].setCar(Spiller.getSpiller(i), true);
		// break;
		// case 25:
		// break;
		// case 26:
		// break;
		// case 27:
		// break;
		// case 28:
		// break;
		// case 29:
		// break;
		// case 30:
		// break;
		// case 31:
		// break;
		// case 32:
		// break;
		// case 33:
		// break;
		// case 34:
		// break;
		// case 35:
		// break;
		// case 36:
		// break;
		// case 37:
		// break;
		// case 38:
		// break;
		// case 39:
		// break;
		// case 40:
		// break;
	}

}
