package org.demo.improve;

import org.demo.improve.utils.HumanConstants;

// Class to calculate Human Body Mass Index (BMI)
public class HumanIMB {
	private double weight; // Weight of the human in kilograms
	private double height; // Height of the human in meters

	// Constructor to initialize weight and height
	public HumanIMB(double weight, double height) {
		if (weight <= 0 || height <= 0) {
			throw new IllegalArgumentException("Weight and height must be positive values.");
		}
		this.weight = weight;
		this.height = height;
	}

	// Method to calculate BMI based on weight and height
	public double calculateBMI() {
		return weight / (height * height);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Method to determine BMI status
	public String calculateBMIStatus() {
		double bmi = calculateBMI();
		if (bmi >= HumanConstants.BMI_NORMAL_LOWER && bmi < HumanConstants.BMI_NORMAL_UPPER) {
			return "Normal";
		} else if (bmi >= HumanConstants.BMI_OVERWEIGHT_LOWER && bmi < HumanConstants.BMI_OVERWEIGHT_UPPER) {
			return "Overweight";
		} else if (bmi >= HumanConstants.BMI_OBESE_LOWER) {
			return "Obese";
		} else {
			return "Underweight";
		}
	}
}
