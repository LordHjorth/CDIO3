package game;

import java.util.Random;

public class ChancekortController {

	private int value = 0;
	private String tekst = "";
	private int beløb = 0;
	private int felt = 0;

	public ChancekortController() {
	}
	
	public ChancekortController(String tekst, int beløb, int felt, int value) {
		this.setTekst(tekst);
		this.setBeløb(beløb);
		this.setFelt(felt);
		this.setValue(value);
		
	}
	
	private ChancekortController[] chancekortController = new ChancekortController[7];
	
	public void opretChancekort() {
		chancekortController[0] = new ChancekortController("Ryk frem til Start og modtag 2 kroner", 2, 0, 1);
		chancekortController[1] = new ChancekortController("Ryk 5 felter frem", 0, 5, 2);
		chancekortController[2] = new ChancekortController("Ryk et felt frem", 0, 1, 3);
		chancekortController[3] = new ChancekortController("Du har spist for meget slik. Betalt 2 kroner", -2, 0, 4);
		chancekortController[4] = new ChancekortController("Ryk frem til Strandpromenaden", -5, 23, 5);
		chancekortController[5] = new ChancekortController("Det er din fødselsdag! Tillykke! Du modtager 1 krone", 1, 0, 6);
		chancekortController[6] = new ChancekortController("Du har lavet alle dine lektier. Du modtager 2 kroner", 2, 0, 7);
	}

	public ChancekortController getChancekort() {
		Random random = new Random();
		int i = random.nextInt(chancekortController.length);
		return chancekortController[i];
	}

	public String getTekst() {
		return tekst;
	}
	
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public int getBeløb() {
		return beløb;
	}

	public void setBeløb(int beløb) {
		this.beløb = beløb;
	}

	public int getFelt() {
		return felt;
	}

	public void setFelt(int felt) {
		this.felt = felt;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
