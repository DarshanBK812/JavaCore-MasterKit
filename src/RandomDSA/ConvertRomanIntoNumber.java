package RandomDSA;

import java.util.HashMap;

public class ConvertRomanIntoNumber {

	// Using Collection
	public static void number(String str) {
		int length = str.length() - 1;
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);
		int sum = 0;
		for (int i = 0; i <= length; i++) {

			Integer value = hashMap.get(str.charAt(i));
			// (i+1) < length n bcz this condition helps to avoid being getting a
			// arraindexOutOfBounce exception when we try to get access a i+1 element
			if ((i + 1) < length && (value < hashMap.get(str.charAt(i + 1)))) {
				sum = sum - value;
			} else {
				sum = sum + value;
			}

		}
		System.out.println(sum);

	}

	// Using Switch
	public static void number2(String str) {
		int length = str.length() - 1;
		int sum = 0;
		for (int i = 0; i <= length; i++) {
			int num = getNumber(str.charAt(i));
			if (i + 1 < length && num < getNumber(str.charAt(i + 1))) {
				sum -= num;
			} else {
				sum += num;
			}
		}
		System.out.println(sum);

	}

	static int getNumber(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'M':
			return 500;
		case 'D':
			return 1000;
		default:
			return 0;
		}

	}

	public static void main(String[] args) {
		String roman = "VI";
//		number(roman);
		number2(roman);
	}

}
