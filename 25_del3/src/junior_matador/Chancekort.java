package junior_matador;

public class Chancekort {

	private static String[] chancekort;
	
	
	
	public static String getChancekort() {
		
		int n;
		
		n = (int) (Math.random()*chancekort.length);
		System.out.println(n);
		chancekort = new String[7];
		
		chancekort [0] = "Ryk frem til Start og modtag 2 kroner";
		chancekort [1] = "Ryk 5 felter frem";
		chancekort [2] = "Ryk et felt frem eller tag et chancekort mere";
		chancekort [3] = "Du har spist for meget slik. Betalt 2 kroner";
		chancekort [4] = "Ryk frem til Strandpromenaden";
		chancekort [5] = "Det er din fødselsdag! Tillykke! Du modtager 1 krone";
		chancekort [6] = "Du har lavet alle dine lektier. Du modtager 2 kroner";
		
		return "";
	}
	
	
	
	
}
