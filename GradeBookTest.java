import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
		private GradeBook g1;
		private GradeBook g2;
	@BeforeEach
	void setUp() throws Exception {
		
		
		
		g1 = new GradeBook(5);
		g1.addScore(19);
		g1.addScore(43);
		g1.addScore(24);
		g1.addScore(17);
		g1.addScore(4);
		
		g2 = new GradeBook(5);
		g2.addScore(64);
		g2.addScore(25);
		g2.addScore(86);
		g2.addScore(94);
		g2.addScore(9);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		g1 = null;
		g2 = null;
		
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("19.0,43.0,24.0,17.0,4.0"));
		assertTrue(g2.toString().equals("64.0,25.0,86.0,94.0,9.0"));
	}

	@Test
	void testSum() {
		assertEquals(107, g1.sum(), .0001);
		assertEquals(278, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(4, g1.minimum(), .001);
		assertEquals(9, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(103, g1.finalScore(), .001);
		assertEquals(269, g2.finalScore(), .001);
	}

	@Test
	void testGetscoreSize() {

	}

	@Test
	void testTostring() {
		
	}

}
