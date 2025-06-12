package problems.string;

public class VowelSum {

//	static int value(char ch ) {
//		switch(ch) {
//		case ('A' || 'a') : {
//			
//		}
//		}
//	}

	public static void count(String str) {
		char ch[] = str.toCharArray();
		int sum = 0;
		int vS = 0 , c= 0 , d = 0 , sc = 0;
		for (char c1 : ch) {
			if (Character.isLetter(c1)) {
				switch (c1) {
				case 'a':
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' :
					vS++;
					System.out.println(c1 + " ");
					sum = sum +  vS;
					break;
				default : 
					c++;
				} 
			}else if(Character.isDigit(c1)) {
				d++;
			} else {
				if(c1 == ' ') {
					continue;
				}
				sc++;
			}
		}
		System.out.println(vS + " " + sum );
		System.out.println(c);
	}

	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		int sum = 0;
		count(str);
//		for (char ch : str.toCharArray()) {
//			switch (Character.toLowerCase(ch)) {
//			case 'a': {
//				sum += 4;
//				break;
//			}
//			case 'e': {
//				sum += 3;
//				break;
//			}
//			case 'i': {
//				sum += 1;
//				break;
//			}
//			}
//
//		}
//		System.out.println(sum);
	}

}
