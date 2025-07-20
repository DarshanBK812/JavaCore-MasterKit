package java8.stream.problems;

import java.util.Arrays;

public class Sort_And_Remove_DuplicatesElements {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 1, 2, 3, 4 };
		System.out.println(Arrays.toString(Arrays.stream(arr).sorted().distinct().toArray()));

	}

}
