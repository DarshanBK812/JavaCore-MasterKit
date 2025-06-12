package problems.important;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int left = 0, right = height.length - 1;
		int maxArea = 0;
		while (left < right) {
			int area = Math.min(height[left], height[right]) * (right - left);
			System.out.println(area);
			maxArea = Math.max(maxArea, area);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		
		System.out.println(maxArea);
	}

}
