package testafspil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.Konto;

class KontoTest {

	@Test
	void test1() {
		Konto kontotest = new Konto(100); 
			kontotest.setKapital(100); //Sætter en værdi for kontoen 
			int expected = 100;
			int actual = kontotest.getKapital(); //Henter værdien og tester for det indsatte
		assertEquals (expected, actual);
		
	}

}
