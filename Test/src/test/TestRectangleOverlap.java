package test;

public class TestRectangleOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rec1 = { 5, 15, 8, 18 };
		int[] rec2 = { 0, 3, 7, 9 };
		System.out.println(isRectangleOverlap(rec1, rec2));
	}

	public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if (rec1 == null || rec1.length < 4 || rec2 == null || rec2.length < 4)
			return false;
		return !(rec1[2] <= rec2[0] || rec1[0] >= rec2[2] || rec1[3] <= rec2[1] || rec1[1] >= rec2[3]);

	}
}
