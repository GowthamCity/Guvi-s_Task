package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		// Using Java Stream API to filter out empty strings

		List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

		System.out.println("Non-empty strings: " + nonEmptyStrings);
	}
}