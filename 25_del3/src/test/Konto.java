package test;

public class Konto {

	private int kapital = 0;

	public Konto(int kapital) {
		this.setKapital(kapital);
	}

	public int getKapital() {
		return kapital;
	}

	public void setKapital(int kapital) {
		this.kapital = kapital;
	}

}
