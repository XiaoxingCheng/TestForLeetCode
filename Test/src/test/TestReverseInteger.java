package test;

public class TestReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1534236469;
		System.out.println(reverse(x));
	}
	public static int reverse(int x) {
		int t = Math.abs(x);
		int s=0;
		//ע������Ҫ��long,int��ת���ܻᳬ��int,��ʱ��long����ǿ��ת��ȥ
		long sum =0;
		while(t>0) {
			s = t %10;
			sum = sum*10+s;
			//ע��������Сֵ
			if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE) {
				return 0;
			}
			t /= 10;
		}
		return x>0?(int)sum:(int)(-sum);
	}

}
