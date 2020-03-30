package test;

public class TestMinKNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 0, 2, 3, 2, 1, 1, 2, 0, 4 };
		int k = 10;
		//quickSort(arr, 0, arr.length - 1);
		int[] result = getLeastNumbers(arr, k);
		System.out.println(result);
	}

	public static int[] getLeastNumbers(int[] arr, int k) {
		int[] leastNums = new int[k];
		if (arr == null || arr.length == 0 || arr.length < k)
			return leastNums;
		partitionArray(arr, 0, arr.length - 1, k);
		for (int i = 0; i < k; i++) {
			leastNums[i] = arr[i];
		}
		return leastNums;
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}
	}

	public static void partitionArray(int[] arr, int start, int end, int k) {
		int index = partition(arr, start, end);
		if (start < end) {
			if (index == k) {
				return;
			} else if (index > k) {
				partitionArray(arr, start, index - 1, k);
			} else {
				partitionArray(arr, index + 1, end, k);
			}
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start;
		int j = end;
		while (i < j) {
			while (i < j && arr[j] >= pivot) {
				j--;
			}
			arr[i] = arr[j];
			while (i < j && arr[i] <= pivot) {
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i] = pivot;
		return i;
	}
	/*
	 * public static int[] getLeastNumbers(int[] arr, int k) { int[] leastNums = new
	 * int[k]; if (arr == null || arr.length == 0 || arr.length < k) return
	 * leastNums; Arrays.sort(arr); for (int i = 0; i < k; i++) { leastNums[i] =
	 * arr[i]; } return leastNums; }
	 */
}
