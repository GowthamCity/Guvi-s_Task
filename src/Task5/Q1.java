package Task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1 {
	public static void main(String[] args) {

		Stream<String> names = Stream.of("K", "BrO", "oat");

		// Using MAP() function
		List<String> uppercaseList = names.map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("Uppercase List: " + uppercaseList);
	}
}