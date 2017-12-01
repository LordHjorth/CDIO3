package testafspil;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import game.Konto;

public class KontoTest1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		Konto kontoTest = new Konto(100);
		kontoTest.setKapital(100); // Sætter en værdi for kontoen
		int expected = 100;
		int actual = kontoTest.getKapital(); // Henter værdien og tester for det indsatte
		assertEquals("Testen virkede ikke", expected, actual);
	}

}
