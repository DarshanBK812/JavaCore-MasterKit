package problems.leet;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maximum_Difference_Between_Even_and_Odd_Frequency {

	public static void main(String[] args) {

		String str = "xkxzkkk";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int oddFre = 0;
		int evenFre = 0;
//		int maxValue = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			int val = entry.getValue();
			
//			System.out.println(val < );
			
			System.out.println(val);
			if (val > oddFre && val % 2 != 0) {
				oddFre = val;
//				System.out.println(oddFre);

			} else if (val  > evenFre &&   val % 2 == 0) {
//				System.out.println(val % 2 == 0);
				int evenFre1 = val;
				if(evenFre != 0) {
					evenFre = Math.min(evenFre, evenFre1);
					continue;
				}
				evenFre = evenFre1;
				
//				
//				break;
			}
		}
		System.out.println("evenFre " + evenFre);
		System.out.println("oddFre " + oddFre);


//		if (evenFre > oddFre)
//			System.out.println(evenFre - oddFre);
//		else
			System.out.println(oddFre - evenFre);

	}

}
