package test;

import java.util.HashMap;
import java.util.Map;

public class TestMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	public static int majorityElement(int[] nums) {
		if(nums == null||nums.length==0) return 0;
		Map<Integer,Integer> map = new HashMap<>();
		int count =0;
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else {
				Integer obj =(Integer)map.get(nums[i]);
				map.put(nums[i], ++obj);
				count = map.get(nums[i]);
				if(count>nums.length/2) {
					return nums[i];
				}
			}
		}
		return 0;
	}

}
