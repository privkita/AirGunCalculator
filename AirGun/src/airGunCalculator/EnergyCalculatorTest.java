package airGunCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EnergyCalculatorTest {

	@Test
	void testCalculateEnergy() {
		String speedMps1 = "243.7";
		String speedMps2 = "287";
		String massGram1 = "0.5469";
		String massGram2 = "0.3700";
		
		assertEquals("16,24", Calculator.calculateEnergy(speedMps1, massGram1));
		assertEquals("15,24", Calculator.calculateEnergy(speedMps2, massGram2));
	}

}
