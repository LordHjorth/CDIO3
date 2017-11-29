package test;

import java.util.Random;

public class TerningController {

	Random random = new Random();

	private int terning;
	

	public TerningController(int terning) {
		this.terning = terning;	
	}
	
	public TerningController() {
		
	}

	public void kastTerning() {
		terning = random.nextInt(6) + 1;
//		terning = 3;
		
	}

	public int getTerning() {
		return terning;
	}
	
	
	
}
