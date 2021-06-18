package io.vnp.javavnp.Stream;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Supplier;

public class SupplierTest {

	/*
	 * @Override public String get() { return "Hi !"; }
	 */

	public static void main(String[] args) {
		/*
		 * Supplier<Integer> supplier = new SupplierTest();
		 * System.out.println(supplier.get());
		 */

		/*
		 * Supplier<String> supplier = () -> { return "Hi !"; };
		 */
		/*
		 * Supplier<String> supplier = () -> "Hi !"; System.out.println(supplier.get());
		 */

		// Supplier<String> supplier = () -> "Hi !";

		List<String> list1 = Arrays.asList("a", "b");
		System.out.println(list1.stream().findAny().orElseGet(() -> "Hi !"));
	}

}
