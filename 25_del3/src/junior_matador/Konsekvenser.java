package junior_matador;

public class Konsekvenser {

	public static void konsekvensAfChancekort() {
		Spiller.gui.showMessage("Du er landet på et Chancekort");
		Chancekort kort = Chancekort.getChancekort();
		Spiller.gui.displayChanceCard(kort.tekst);
		Spiller.setNyBalance(Spil.getRunde(), kort.beløb);

		if (kort == Chancekort.chancekort[0]) {

			Bil.setCarFalse();
			Spil.setFelt(Spil.getFelt() * -1);
			Bil.setCarTrue();

		} else if (kort == Chancekort.chancekort[4]) {
			
			Bil.setCarFalse();
			Spil.setFelt(23 - Spil.getFelt());
			Bil.setCarTrue();
			
		} else {
			
			Bil.setCarFalse();
			if ((Spil.getFelt() + kort.felt) > Platform.fields.length) {
				Spil.setFelt(Platform.fields.length*-1);
			}
			Spil.setFelt(kort.felt);
			Bil.setCarTrue();
			
		}
	}
	
	
	
	public static void konsekvensAfFelter() {
		
		switch (Spil.getFelt() + 1) {
		
		case 1:
			break;
		case 2:
			Spiller.setNyBalance(Spil.getRunde(), -1);
			break;
		case 3:
			Spiller.setNyBalance(Spil.getRunde(), -1);
			break;
		case 4:// chance felt
			konsekvensAfChancekort();
			break;
		case 5:
			Spiller.setNyBalance(Spil.getRunde(), -1);
			break;
		case 6:
			Spiller.setNyBalance(Spil.getRunde(), -1);
			break;
		case 7:// jail
			break;
		case 8:
			Spiller.setNyBalance(Spil.getRunde(), -2);
			break;
		case 9:
			Spiller.setNyBalance(Spil.getRunde(), -2);
			break;
		case 10: // chance
			konsekvensAfChancekort();
			break;
		case 11:
			Spiller.setNyBalance(Spil.getRunde(), -2);
			break;
		case 12:
			Spiller.setNyBalance(Spil.getRunde(), -2);
			break;
		case 13:// free parking
			break;
		case 14:
			Spiller.setNyBalance(Spil.getRunde(), 3);
			break;
		case 15:
			Spiller.setNyBalance(Spil.getRunde(), -3);
			break;
		case 16:// chance kort
			konsekvensAfChancekort();
			break;
		case 17:
			Spiller.setNyBalance(Spil.getRunde(), -3);
			break;
		case 18:
			Spiller.setNyBalance(Spil.getRunde(), -3);
			break;
		case 19:
			Spiller.setNyBalance(Spil.getRunde(), -3);
			break;
		case 20:
			Spiller.setNyBalance(Spil.getRunde(), -4);
			break;
		case 21:
			Spiller.setNyBalance(Spil.getRunde(), -4);
			break;
		case 22:// chance
			konsekvensAfChancekort();
			break;
		case 23:
			Spiller.setNyBalance(Spil.getRunde(), -5);
			break;
		case 24:
			Spiller.setNyBalance(Spil.getRunde(), -5);
			break;

		}
	}
}
