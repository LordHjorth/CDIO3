package junior_matador;

import java.util.Random;

public class Terning {

	

		Random random = new Random();

		private int terning;
		

		public Terning(int terning) {
			this.terning = terning;	
		}
		
		public Terning () {
			
		}

		public void random() {
			terning = random.nextInt(6) + 1;
			
		}

		public int getTerning() {
			return terning;
		}
		

	
	
	
}
