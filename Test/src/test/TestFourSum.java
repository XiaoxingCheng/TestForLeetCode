package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestFourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,0,0};
		int target = 0;
		Arrays.sort(nums);
		List<List<Integer>> list = fourSum(nums, target);
		System.out.println(list);
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Set<List<Integer>> set = new HashSet<>();
		List<Integer> subList = new ArrayList<>();
		if (nums == null)
			return null;
		/*int[] num = {};
		if (nums.length == 0) {
			subList.add(Integer.parseInt(String.valueOf(num)));
			list.add(subList);
			return list;
		}*/
		int sum = 0;
		int index = 0;
		while (index < nums.length - 3) {
			/*if(nums[index]==nums[index+1]) {
				index++;
				continue;
			}*/
			int next = index + 1;
			while (next < nums.length - 2) {
				int left = next + 1;
				int right = nums.length - 1;
				while (left < right) {
					sum =(nums[index]+nums[next]+nums[left] + nums[right]);
					if (sum == target) {
						subList = new ArrayList<>();
						subList.add(nums[index]);
						subList.add(nums[next]);
						subList.add(nums[left]);
						subList.add(nums[right]);
						set.add(subList);
						while (left < right && nums[left] == nums[left + 1])
							left++;
						while (left < right && nums[right] == nums[right - 1])
							right--;
						left++;
						right--;
					} else if (sum > target) {
						right--;
					} else {
						left++;
					}
				}
				next++;
			}
			index ++;
		}
		return new ArrayList<>(set);
	}
}
