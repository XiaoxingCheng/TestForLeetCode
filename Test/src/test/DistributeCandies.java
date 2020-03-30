package test;

public class DistributeCandies {

	public static void main(String[] args) {
		int candies = 7;
		int num_people = 4;
		int[] str_people = distributeCandies(candies, num_people);
		for (int num : str_people) {
			System.out.println(num);
		}
	}

	public static int[] distributeCandies(int candies, int num_people) {
		int[] str_people = new int[num_people];
		int cur = 0;
		int sum = 0;
		for (int i = 0; sum < candies; i++) {
			cur = i % num_people;
			str_people[cur] += ((i + 1) > (candies - sum) ? (candies - sum) : (i + 1));
			sum += (i + 1);
		}

		return str_people;
	}

}
