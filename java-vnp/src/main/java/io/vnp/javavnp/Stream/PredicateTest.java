package io.vnp.javavnp.Stream;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;

public class PredicateTest {

	/*
	 * @Override public boolean test(Integer t) { if (t % 2 == 0) return true; else
	 * return false; }
	 */

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> predicate = new PredicateTest();
		 * System.out.println(predicate.test(5));
		 */

		/*
		 * Predicate<Integer> predicate = t -> t % 2 == 0;
		 * System.out.println(predicate.test(10));
		 */

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Even values => " + t));
	}
}
