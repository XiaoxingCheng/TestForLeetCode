package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		/*
		 * List<List<Integer>> list = new ArrayList<>(); List<Integer> sublist = new
		 * ArrayList<>(); sublist.add(1); sublist.add(2); list.add(sublist); sublist =
		 * Arrays.asList(1,2); System.out.println(list.containsAll(sublist));
		 */

		List<List<Integer>> list = threeSum(nums);
		for (int i = 0; i < list.size(); i++) {
			List<Integer> subList = list.get(i);
			Iterator it = subList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return list;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				break;
			if (i>0&&nums[i] == nums[i-1])
				continue;
			int head = i + 1;
			int tail = nums.length - 1;
			while (head < tail) {
				int sum = (nums[i] + nums[head] + nums[tail]);
				if (sum == 0) {
					list.add(Arrays.asList(nums[i], nums[head], nums[tail]));
					while (head < tail && nums[head] == nums[head+1])
						head++;
					while (head < tail && nums[tail] == nums[tail - 1])
						tail--;
					head++;
					tail--;
				} else if (sum < 0) {
					head++;
				} else if (sum > 0) {
					tail--;
				}
			}
		}
		return list;
	}
	/*
	 * public static List<List<Integer>> threeSum(int[] nums) { Set<List<Integer>>
	 * list = new HashSet<>(); if (nums == null || nums.length == 0) { return new
	 * ArrayList<>(list); } List<Integer> subList = new ArrayList<>(); int sum = 0;
	 * for (int i = 0; i < nums.length - 2; i++) { for (int j = i + 1; j <
	 * nums.length - 1; j++) { sum = 0; sum += (nums[i] + nums[j]); for (int k = j +
	 * 1; k < nums.length; k++) { subList = new ArrayList<>(); if (isMatch(sum,
	 * nums[k])) { subList.add(nums[i]); subList.add(nums[j]); subList.add(nums[k]);
	 * Collections.sort(subList); list.add(subList); } else { continue; } } } }
	 * return new ArrayList<>(list); }
	 * 
	 * public static boolean isMatch(int num1, int num2) { if (num1 + num2 == 0) {
	 * return true; } return false; }
	 */
}
