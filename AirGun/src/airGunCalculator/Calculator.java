package airGunCalculator;

public class Calculator {

	public static String toSpeedMps(String speedFps) {
		return String.format("%.2f", Double.parseDouble(speedFps) * 0.3048);
	}

	public static String toSpeedFps(String speedMs) {
		return String.format("%.2f", Double.parseDouble(speedMs) * 3.280839895);
	}

	public static String calculateSpeedMps(String massGram, String energy) {
		return String.format("%.2f",
				Math.sqrt((2 * Double.parseDouble(energy)) / (Double.parseDouble(massGram) / 1000)));
	}

	public static String toMassGram(String massGrain) {
		return String.format("%.4f", Double.parseDouble(massGrain) * 0.06479891);
	}

	public static String toMassGrain(String massGram) {
		return String.format("%.4f", Double.parseDouble(massGram) * 15.432358352);
	}

	public static String calculateMassGram(String speedMps, String energy) {
		return String.format("%.4f",
				((2 * Double.parseDouble(energy)) / Math.pow(Double.parseDouble(speedMps), 2)) * 1000);
	}

	public static String calculateEnergy(String speedMps, String massGram) {
		return String.format("%.2f",
				0.5 * (Double.parseDouble(massGram) / 1000) * Math.pow(Double.parseDouble(speedMps), 2));
	}

}
