package testafspil;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import game.NySpiller;

public class TestPlacering {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	NySpiller spiller = new NySpiller();
	@Test
	public void test() {
		int expected = 20;
		spiller.setPlacering(20);
		int actual = spiller.getPlacering();
		assertEquals("Stemmer ikke overens", expected, actual);
		
	}

}
