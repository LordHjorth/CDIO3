package game;

import java.util.Random;

public class TerningController {
	
	//Terningens værdi er baseret på java.util.Random, som bruges til at fremskaffe en tilfældig værdi. Denne kan tilgås ved brug af getters

	Random random = new Random();

	private int terning;
	

	public TerningController(int terning) {
		this.terning = terning;	
	}
	
	public TerningController() {
		
	}

	public void kastTerning() {
		terning = random.nextInt(6) + 1; //Det er +1, fordi ellers ville den skrive ud mellem 1 og 5, men terningen har 6 øjne, derfor plus 1.
		
	}

	public int getTerning() {
		return terning;
	}
	
	
	
}
