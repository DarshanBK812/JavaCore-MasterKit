package problems.string;

public class VowelSum {

//	static int value(char ch ) {
//		switch(ch) {
//		case ('A' || 'a') : {
//			
//		}
//		}
//	}

	public static void main(String[] args) {
		String str = "i love edabit";
		int sum = 0;
		
		for(char ch : str.toCharArray()) {
			switch(Character.toLowerCase(ch)) {
			case 'a' : {
				sum += 4;
				break;
			}
			case 'e' : {
				sum += 3;
				break;
			}
			case 'i' : {
				sum += 1;
				 break;
			}
			}
		
		}
		System.out.println(sum);
	}

}
