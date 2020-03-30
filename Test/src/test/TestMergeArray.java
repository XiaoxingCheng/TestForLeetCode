package test;

public class TestMergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0};
		int m=0;
		int[] b= {1};
		int n=1;
		merge(a,m,b,n);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	 public static void merge(int[] A, int m, int[] B, int n) {
	        int right_border = A.length-1;
	        int cur = m-1;
	        for(int i=n-1;i>=0;){
	            if(cur<0){
	                for(int j=0;j<=right_border;j++){
	                    A[j]=B[j];
	                }
	                break;
	            }
	            if(A[cur]<B[i]){
	                A[right_border]=B[i];
	                i--;
	                right_border--;
	            }else{
	                A[right_border]=A[cur];
	                cur--;
	                right_border--;
	            }
	        }
	    }

}
