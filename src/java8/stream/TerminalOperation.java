package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperation {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 1, 2, 5, 4);

		// 1.forEach
//		integers.stream().sorted().forEach(( Integer i) -> System.out.println(i));

		// 2.toArray()
//		System.out.println(Arrays.toString(integers.stream().sorted().distinct().toArray()));

		// 3.reduce
//		Optional<Integer> optional = integers.stream().distinct().reduce((Integer i1, Integer i2) -> i1 + i2);
//		System.out.println(optional.get());
		
		//4.Max
		Optional<Integer> i  = integers.stream().distinct().min((Integer i1 , Integer i2) -> i1 - i2);
		System.out.println(i.get());
		
	}

}
