package test;

public class TestZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String convert(String s, int nrows) {
		if (s == null || s.length() == 0 || nrows <= 1)
			return s;
		StringBuilder res = new StringBuilder();
		int size = 2 * nrows - 2;
		for (int i = 0; i < nrows; i++) {
			for (int j = i; j < s.length(); j+=size) {
				res.append(s.charAt(j));
				if (i != 0 && i != nrows - 1) {
					int temp = j + size - 2 * i;
					if (temp < s.length()) {
						res.append(s.charAt(temp));
					}
				}
			}
		}
		return res.toString();
	}

}
