package junior_matador;

import java.util.Random;

public class Chancekort {

	String tekst = "";
	int beløb = 0;
	int felt = 0;

	static Chancekort[] chancekort = new Chancekort[7];

	public Chancekort(String tekst, int beløb, int felt) {
		this.tekst = tekst;
		this.beløb = beløb;
		this.felt = felt;
	}

	public Chancekort() {
	}

	public static Chancekort getChancekort() {
		Random random = new Random();
		int i = random.nextInt(chancekort.length);

		chancekort[0] = new Chancekort("Ryk frem til Start og modtag 2 kroner", 2, 0);
		chancekort[1] = new Chancekort("Ryk 5 felter frem", 0, 5);
		chancekort[2] = new Chancekort("Ryk et felt frem", 0, 1);
		chancekort[3] = new Chancekort("Du har spist for meget slik. Betalt 2 kroner", -2, 0);
		chancekort[4] = new Chancekort("Ryk frem til Strandpromenaden", 5, Platform.fields.length-1);
		chancekort[5] = new Chancekort("Det er din fødselsdag! Tillykke! Du modtager 1 krone", 1, 0);
		chancekort[6] = new Chancekort("Du har lavet alle dine lektier. Du modtager 2 kroner", 2, 0);

		return chancekort[i];

	}

}
