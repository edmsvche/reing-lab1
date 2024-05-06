package org.demo.improve;

public class Main {
	public static void main(String[] args) {
		HumanIMB humanIMB = new HumanIMB(80, 1.52);
		System.out.println("Weight: " + humanIMB.getWeight());
		System.out.println("Height: " + humanIMB.getHeight());
		System.out.println("BMI: " + humanIMB.calculateBMI());
		System.out.println("BMI Status: " + humanIMB.calculateBMIStatus());
	}
}
