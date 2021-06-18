package io.vnp.javavnp.Stream;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// Consumer<Integer> consumer = t -> System.out.println("Value is => " + t);
		// consumer.accept(10);

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().forEach(t -> System.out.println("Value to be printed => " + t));
	}
}