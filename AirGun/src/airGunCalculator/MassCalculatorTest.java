package airGunCalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MassCalculatorTest {
	
	@Test
	void testToMassGram() {
		String massGrain1 = "1";
		String massGrain2 = "5";
		String massGrain3 = "9";

		assertEquals("0,0648", Calculator.toMassGram(massGrain1));
		assertEquals("0,3240", Calculator.toMassGram(massGrain2));
		assertEquals("0,5832", Calculator.toMassGram(massGrain3));
	}
	
	@Test
	void testToMassGrain() {
		String massGram1 = "1";
		String massGram2 = "5";
		String massGram3 = "0.5";
		
		assertEquals("15,4324", Calculator.toMassGrain(massGram1));
		assertEquals("77,1618", Calculator.toMassGrain(massGram2));
		assertEquals("7,7162", Calculator.toMassGrain(massGram3));
	}
	
	@Test
	void testCalculateMassGram() {
		String speedMps1 = "243.7";
		String speedMps2 = "287";
		String energy1 = "16.24";
		String energy2 = "15.24";
		
		assertEquals("0,5469", Calculator.calculateMassGram(speedMps1, energy1));
		assertEquals("0,3700", Calculator.calculateMassGram(speedMps2, energy2));
	}

}
