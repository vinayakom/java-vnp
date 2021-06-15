package io.vnp.javavnp;

interface Calculator {
	// void calculateAdd();
	// void add(int inputOne);
	int substract(int i, int y);
}

public class CalculatorImpl {

	public static void main(String[] args) {
		/*
		 * Calculator calculator = () -> System.out.println("Calculate Add !!!");
		 * calculator.calculateAdd();
		 */

		/*
		 * Calculator calculator = (inputOne) -> System.out.println("Addition => " +
		 * inputOne); calculator.add(2);
		 */

		Calculator calculator = (i, y) -> {
			if (y < i) {
				throw new RuntimeException("Error");
			} else {
				return y - i;
			}
		};
		System.out.println("Substracted value => " + calculator.substract(12, 23));
	}
}
