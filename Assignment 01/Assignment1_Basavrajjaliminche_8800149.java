package Assignment;

import java.util.Scanner;

public class EnergyToHeatWater {

	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);

		// Promt the user to enter ammount of water in kg
		System.out.print("Enter ammount of water in kg:");
		double waterWeight = sc.nextDouble();

		// Putting conditions for water weight
		if (waterWeight < 0) {
			System.out.print("Water amount cannot be negative number");
		} else {
			// Promt the user to enter initial temprature
			System.out.print("Enter initial temperatures of the water:");
			double initialTemperature = sc.nextDouble();

			// Promt the user to enter final temprature
			System.out.print("Enter final temperatures of the water:");
			double finalTemperature = sc.nextDouble();

			// Compute the energy needed to heat water using formula
			double result = (waterWeight) * (finalTemperature - initialTemperature) * (4184);

			// Display Results
			System.out.print(
					"The energy needed to heat water from an initial temperature to a final temperature is:" + result);
		}

	}

}
