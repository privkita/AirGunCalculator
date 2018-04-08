package airGunCalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SpeedCalculatorTest {
	
	@Test
	void testToSpeedMps() {
		String speedFps1 = "1";
		String speedFps2 = "200";
		String speedFps3 = "250";
		
		assertEquals("0,30", Calculator.toSpeedMps(speedFps1));
		assertEquals("60,96", Calculator.toSpeedMps(speedFps2));
		assertEquals("76,20", Calculator.toSpeedMps(speedFps3));
	}
	
	@Test
	void testToSpeedFps() {
		String speedMs1 = "1";
		String speedMs2 = "35";
		String speedMs3 = "70";
		
		assertEquals("3,28", Calculator.toSpeedFps(speedMs1));
		assertEquals("114,83", Calculator.toSpeedFps(speedMs2));
		assertEquals("229,66", Calculator.toSpeedFps(speedMs3));
	}
	
	@Test
	void testCalculateSpeedMps() {
		String massGram1 = "0.5469";
		String massGram2 = "0.3700";
		String energy1 = "16.24";
		String energy2 = "15.24";
		
		assertEquals("243,70", Calculator.calculateSpeedMps(massGram1, energy1));
		assertEquals("287,02", Calculator.calculateSpeedMps(massGram2, energy2));
	}

}
