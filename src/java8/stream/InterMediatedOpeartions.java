package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterMediatedOpeartions {

	public static void main(String[] args) {

		// Creation of stream
//		Stream<String> stream = Stream.of("Darshan", "Chandu", "Bhavana", "Cat");

		// 1.filter element
//		List<String> list = stream.filter((String name) -> name.length() > 3).toList();// toList convert stream to list
//		System.out.println(list);

		// 2.map element
//		List<String> list = stream.map((String name)-> name.toLowerCase()).toList();
//		System.out.println(list);

		// 3.flatMap
//		List<List<String>> list = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));
//		list.stream().flatMap((List<String> names) -> names.stream().map((String name) -> name.toLowerCase()));
//		System.out.println(list);

		// 4.Distinct terminal operation used to remove duplicates
//		int arr[] = { 2, 1, 3, 1, 2, 5, 3, 4 };
//		IntStream stream = Arrays.stream(arr).distinct();
//		System.out.println(Arrays.toString(stream.toArray()));

		// Sort the array in a dissanding manner
//		Stream<Integer> stream2 = Arrays.stream(arr).distinct().boxed().sorted((Integer i1, Integer i2) -> i2 - i1);
//		System.out.println(Arrays.toString(stream2.toArray()));

//		List<Integer> integers = Arrays.asList(2, 1, 3, 1, 2, 5, 3, 4);
//		System.out.println(integers.stream().limit(3).toList());

		// All intermediate operation of stream
		List<Integer> integers = Arrays.asList(1, 2, 1, 3, 5, 4, 1);
		List<Integer> list = integers.stream().filter((Integer i) -> i <= 4)
				.peek((Integer val) -> System.out.println("Filter " + val)).map((Integer val) -> val * -1)
				.peek((Integer val) -> System.out.println("Negative val : " + val)).sorted()
				.peek((Integer i) -> System.out.println("Sorted" + i)).distinct()
				.peek((Integer i) -> System.out.println("Unique" + i)).toList();

		System.out.println(list);

	}

}
