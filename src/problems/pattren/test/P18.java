package problems.pattren.test;

public class P18 {

	public static void main(String[] args) {
		
		int arr[] = { 2, 3, 4, 5, 6 };
		int target = 3;
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			
			
			if (arr[mid] == target) {
				System.out.println(":found");
				return;
			} else if (arr[mid] > target) {
				r = mid - 1;
			} else if (arr[mid] < target) {
				l = mid + 1;
			}
		}
		System.out.println("not");
	}
//	
//	method(int arr , l , r)
//	if(l<r) {
//		pivot = findPivote(arr , l , h);
//		method(arr , l , p-1);
//		mehtod(arr , p+1 , r);
//	}
//	
//	int findPivote(arr , l , h){
//		pivot = h
//		i = l-1;
//		for(j = l , till h) {
//			if(arr[l] > pivote) {
//				i++;
//				swap i and pivote value;
//			}
//		}
//		
//		in ith index smale element is there
//		swap arr[i+1] with arr[h];
//		return i+1;
//	}
	

}
