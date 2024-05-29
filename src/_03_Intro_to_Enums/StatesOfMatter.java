package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(0.0), LIQUID(25.55), GAS(100.0);

	private double celsiusTemp;

	private StatesOfMatter(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}

	public double convertToFahrenheit(double num) {
		return (num * 9 / 5) + 32;
	}

	public double getCelsiusTemp() {
		return celsiusTemp;
	}
}
