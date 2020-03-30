package test;

public class TestContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		if (height == null || height.length <= 1)
			return 0;
		int left = 0;
		int right = height.length - 1;
		int s = 0;
		while (left < right) {
			s = Math.max(Math.min(height[right], height[left]) * (right - left), s);
			if(height[left]<height[right]) {
				left++;
			}else {
				right--;
			}
		}
		return s;
	}

}
