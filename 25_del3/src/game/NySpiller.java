package game;


public class NySpiller{
	
	private Konto konto;
	private String navn;
	private int placering;
	
	public NySpiller(String navn, int kapital, int startfelt) {
		this.setKonto(new Konto(kapital));
		this.setNavn(navn);
		this.setPlacering(startfelt);
	}

	
	
	public String getNavn() {
		return navn;
	}

	public Konto getKonto() {
		return konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getPlacering() {
		return placering;
	}

	public void setPlacering(int placering) {
		this.placering = placering;
	}


}
