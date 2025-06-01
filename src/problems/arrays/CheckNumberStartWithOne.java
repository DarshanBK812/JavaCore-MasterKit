package problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class CheckNumberStartWithOne {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 72 , 110 };

		List<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			int check = i;
			while (check > 10) {
				check = check / 10;
			}
			if (check == 1)
				list.add(i);
		}
		System.out.println(list);
	}

}
