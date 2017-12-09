package game;

import java.util.*;

public class SpilController {

	private final int STARTFELT = 0;
	private GUIController guiController;
	private NySpiller[] spillere;
	private int startKapital;
	private boolean noWinner = true; //sættes til true, fordi der ikke er nogen vinder fra start af
	ChancekortController chancekort = new ChancekortController();
	BraetController braetController = new BraetController();

	public void playGame() { //opsamler metoder og objekter i en enkelt metode, som derefter kan kaldes i main.
		this.guiController = new GUIController(braetController);
		initializeGame();
		gameloop();
	}
	
	private void gameloop() { 
		while (noWinner) {
			for (int i = 0; i < spillere.length; i++) {
				int faceValue = guiController.setDice();

				guiController.setBilFalse(spillere[i].getPlacering(), i); //fjerner nuværende bil fra brættet, også snart der rykkes tilføjes bilen efterfølgende på den nye placering i linje 36

				if (spillere[i].getPlacering() + faceValue > 23) { //i tilfælde af at arrayets størrelse overskrides, startes en ny runde. (passerer start)
					passerStart(i);
					spillere[i].setPlacering(spillere[i].getPlacering() + faceValue - 24);

				} else {
					spillere[i].setPlacering(spillere[i].getPlacering() + faceValue);
				}

				guiController.setBilTrue(spillere[i].getPlacering(), i); //sætter ny bil for spilleren
				konsekvensAfFelter(i); //finder konsekvensen af det felt man lander på.
				guiController.setNyBalance(i, spillere[i].getKonto().getKapital()); //opdaterer spillerens balance for hver gang der slås

				System.out.println("Spiller navn: " + spillere[i].getNavn() + " Spiller kapital: "
						+ spillere[i].getKonto().getKapital() + " Spiller placering: " + spillere[i].getPlacering()); 
				//udskriver spillerens navn, kapital og placering for at udviklingen af spillet, kan følges i konsollen.
				
				pickAWinner(i); //tjekker om der er nogen vinder, altså hele tiden om en af spilleren i arrayet's balance ryger under 0
			}
		}
	}

	private void pickAWinner(int spiller) { //tjekker for vindere
		int vinderBalance = 0;
		List<String> vinderNavn = new ArrayList<String>();

		if (spillere[spiller].getKonto().getKapital() < 0) {
			noWinner = false;
			for (int i = 0; i < spillere.length; i++) {
				if (spillere[i].getKonto().getKapital() > vinderBalance) {
					vinderNavn.clear();
					vinderNavn.add(spillere[i].getNavn());
					vinderBalance = spillere[i].getKonto().getKapital();
				} else if (spillere[i].getKonto().getKapital() == vinderBalance) {
					vinderNavn.add(spillere[i].getNavn());
					vinderBalance = spillere[i].getKonto().getKapital();
				}
			}
			guiController.getVinderBesked(vinderNavn);
			System.exit(0); //lukker guien og spiller stopper når en vinder er fundet.
		}
	}

	private void initializeGame() {
		// Finder antal af spillere
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

		this.spillere = new NySpiller[antalSpillere]; //opretter et nyt arrayer for NySpiller

		for (int i = 0; i < this.spillere.length; i++) { //sætter spillerne i arrayet
			String navn = guiController.getNavnPåSpiller();
			this.spillere[i] = new NySpiller(navn, startKapital, STARTFELT);
		}
		guiController.addPlayers(spillere); //tilføjer spillerne til gui'en
		chancekort.opretChancekort(); //opretter chancekortene
	}

	private void konsekvensAfFelter(int i) { //finder konsekvensen af et vilkårligt felt

		switch (spillere[i].getPlacering() + 1) { //spillerens placering bestemmer hvilken case man ender i.

		case 1: // start
			break;
		case 2:
			landOnField(i, -1);
			break;
		case 3:
			landOnField(i, -1);
			break;
		case 4:// chance
			landOnChancekort(i);
			break;
		case 5:
			landOnField(i, -1);
			break;
		case 6:
			landOnField(i, -1);
			break;
		case 7:// jail på besøg
			guiController.showMessage("PÅ BESØG");
			break;
		case 8:
			landOnField(i, -2);
			break;
		case 9:
			landOnField(i, -2);
			break;
		case 10: // chance
			landOnChancekort(i);
			break;
		case 11:
			landOnField(i, -2);
			break;
		case 12:
			landOnField(i, -2);
			break;
		case 13:// free parking
			guiController.showMessage("FREE PARKING");
			break;
		case 14:
			landOnField(i, -3);
			break;
		case 15:
			landOnField(i, -3);
			break;
		case 16:// chance
			landOnChancekort(i);
			break;
		case 17:
			landOnField(i, -3);
			break;
		case 18:
			landOnField(i, -3);
			break;
		case 19: // Go to jail
			guiController.showMessage("GÅ I FÆNGSEL");
			guiController.setBilFalse(spillere[i].getPlacering(), i);
			spillere[i].setPlacering(spillere[i].getPlacering()-12);
			guiController.setBilTrue(spillere[i].getPlacering(), i);
			break;
		case 20:
			landOnField(i, -4);
			break;
		case 21:
			landOnField(i, -4);
			break;
		case 22:// chance
			landOnChancekort(i);
			break;
		case 23:
			landOnField(i, -5);
			break;
		case 24:
			landOnField(i, -5);
			break;
		}
	}

	private void landOnChancekort(int i) { //konsekvenser for at lande på et chancekort

		ChancekortController chancekortet = chancekort.getChancekort();
		landOnField(i, chancekortet.getBeløb());
		guiController.setBilFalse(spillere[i].getPlacering(), i);
		
		if (chancekortet.getValue() == 2 || chancekortet.getValue() == 1 || chancekortet.getValue() == 5) { //speciel for 2 specifikke chancekort, da KUN placering opdateres på anderledes måde end de andre
			if(chancekortet.getValue() == 2 && spillere[i].getPlacering() == 21) { //hvis spilleren står på sidste chancekort OG skal rykke 5 felter frem, så startes runde forfra.
				spillere[i].setPlacering(spillere[i].getPlacering()-24); //en ny runde startes
				passerStart(i);
			}
			spillere[i].setPlacering(chancekortet.getFelt()); 
		}
		else {
			spillere[i].setPlacering(spillere[i].getPlacering() + chancekortet.getFelt());
		}
		if (chancekortet.getValue() == 2 || chancekortet.getValue() == 3) { 
			konsekvensAfFelter(i);
		}

		guiController.setBilTrue(spillere[i].getPlacering(), i); //flytter spillerens bil rundt på bordet.
		guiController.showMessage(chancekortet.getTekst());
	}
	

	private void landOnField(int i, int nyBalance) { //opdaterer blance for at lande på et "normalt", som IKKE er chancekort felt.
		spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + nyBalance);
	}
	private void passerStart(int i) { //giver spillere 2 point for at passere start
		spillere[i].getKonto().setKapital(spillere[i].getKonto().getKapital() + 2);
	}
}
