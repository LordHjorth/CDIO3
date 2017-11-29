package testafspil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.TerningController;

class TerningControllerTest {

	@Test
	public void random() {
		
		TerningController testTerning = new TerningController ();
		
		int [] sum = {0,0,0,0,0,0,};
		
		int i = 0; 
		while (i < 100000) {
			
			
			testTerning.kastTerning();
			
			switch(testTerning.getTerning()) {
			
			case 1:
				sum[0]++; 
			break; 
			
			case 2: 
				sum[1]++; 
			break; 
			
			case 3:
				sum[2]++;
			break; 
			
			case 4: 
				sum[3]++; 
			break; 
			
			case 5: 
				sum[4]++; 
			break; 
			case 6: 
				sum[5]++; 
			break;
		
			}
			
			i++; 
		} 
        System.out.println("Sum\tForekomst af øjne");
        
        for (int v = 0; v < sum.length; v++) {
        	System.out.print(v+1);
        	System.out.print("\t");
        	System.out.println(sum[v]);
        }
			
			
			}
			
			
		}
	


