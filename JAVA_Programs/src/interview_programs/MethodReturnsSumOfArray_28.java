package interview_programs;

public class MethodReturnsSumOfArray_28 {
	
	
	static int a[] = {1,2,3,4,5};
	int sum = sumArray(a);

	public static void main(String[] args) {
		
		MethodReturnsSumOfArray_28 ab = new MethodReturnsSumOfArray_28();
		System.out.println(ab.sumArray(a));
		int mulResult = MulNumber(5,7);
		System.out.println("the Multiplication is "+mulResult);
	}

	private static int MulNumber(int i, int j) {
		// TODO Auto-generated method stub
		int k=1;
		int sum=0;
		while(k<=j) {
			
			sum=sum+i;
			k++;
		}
		return sum;
	}

	private int sumArray(int[] a) {
		int sum = 0;
		// TODO Auto-generated method stub
		for (int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		return sum;
	}

}
