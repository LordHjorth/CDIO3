package junior_matador;

import java.util.Random;

import gui_fields.GUI_Field;

public class Chancekort {

	String tekst = "";
	int beløb = 0;
	int felt = 0;


	private static Chancekort[] chancekort = new Chancekort[7];

	public Chancekort(String tekst, int beløb, int felt) {
		this.tekst = tekst;
		this.beløb = beløb;
		this.felt = felt;
	}
	public Chancekort() {
	}
	
	public static Chancekort getChancekort() {
		Random random = new Random();
		int i = random.nextInt(7);
		
		chancekort[0] = new Chancekort("Ryk frem til Start og modtag 2 kroner", 2, 0);
		chancekort[1] = new Chancekort("Ryk 5 felter frem", 0, 5);
		chancekort[2] = new Chancekort("Ryk et felt frem", 0, 1);
		chancekort[3] = new Chancekort("Du har spist for meget slik. Betalt 2 kroner", -2, 0);
		chancekort[4] = new Chancekort("Ryk frem til Strandpromenaden", 0, 0); //felt skal lige justeres lidt
		chancekort[5] = new Chancekort("Det er din fødselsdag! Tillykke! Du modtager 1 krone", 1, 0);
		chancekort[6] = new Chancekort("Du har lavet alle dine lektier. Du modtager 2 kroner", 2, 0);
				
		return chancekort[i];

	}
	
	// private static int n;
	//
	//
	// public static String getChancekort() {
	//
	//
	// Random random = new Random();
	// n = random.nextInt(7);
	// chancekort = new String[7];
	//
	// chancekort [0] = "Ryk frem til Start og modtag 2 kroner";
	// chancekort [1] = "Ryk 5 felter frem";
	// chancekort [2] = "Ryk et felt frem eller tag et chancekort mere";
	// chancekort [3] = "Du har spist for meget slik. Betalt 2 kroner";
	// chancekort [4] = "Ryk frem til Strandpromenaden";
	// chancekort [5] = "Det er din fødselsdag! Tillykke! Du modtager 1 krone";
	// chancekort [6] = "Du har lavet alle dine lektier. Du modtager 2 kroner";
	//
	// return chancekort[n];
	// }
	//
	// public static void getKonsekvenser(int i) {
	//
	// switch(n+1) {
	//
	// case 1:
	// Platform.fields[Spiller.getSpiller(i).getNumber()].setCar(Spiller.getSpiller(i),
	// false);
	// Platform.fields[0].setCar(Spiller.getSpiller(i), true);
	// Spiller.setNyBalance(i, 2);
	// break;
	// case 2:
	// Platform.fields[Spiller.getSpiller(i).getNumber()].setCar(Spiller.getSpiller(i),
	// false);
	// Platform.fields[Spiller.getSpiller(i).getNumber()+5].setCar(Spiller.getSpiller(i),
	// true);
	// break;
	// case 3:
	// if (Spiller.gui.getUserButtonPressed("Hvad vil du", "Rykke et felt
	// frem","Trække nyt chancekort")=="Rykke et felt frem") {
	// Platform.fields[Spiller.getSpiller(i).getNumber()].setCar(Spiller.getSpiller(i),
	// false);
	// Platform.fields[Spiller.getSpiller(i).getNumber()+1].setCar(Spiller.getSpiller(i),
	// true);
	// }
	// else {
	// Chancekort.getChancekort();
	// }
	//
	// break;
	// case 4:
	// Spiller.setNyBalance(i, -2);
	// break;
	// case 5:
	// Platform.fields[Spiller.getSpiller(i).getNumber()].setCar(Spiller.getSpiller(i),
	// false);
	// Platform.fields[24].setCar(Spiller.getSpiller(i), true);
	// break;
	// case 6:
	// Spiller.setNyBalance(i, 1);
	//
	// break;
	// case 7:
	// Spiller.setNyBalance(i, 2);
	//
	// break;
	//
	//
	//
	// }
	//
	// }
	//
	//
	//
	//
	//
}
