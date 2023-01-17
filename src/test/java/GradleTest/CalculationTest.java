package GradleTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void testInterestCalculation() {
//		fail("Not yet implemented");
		Calculation c = new Calculation();
		float exp = c.interestCalculation(2000, 10, 10);
		float act = 2000;
		assertEquals(exp, act,0.0);
	}

}
