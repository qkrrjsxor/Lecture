
public class APS06_Stack2_피보나치 {
	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;
	static int[] memorization = new int[100];

	public static void main(String[] args) {

		int result1 = fibo_recursion(11);
		int result2 = fibo_memorization(11);
		int result3 = fibo_iteration(11);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		System.out.println("recursion count : " + count1);
		System.out.println("memorization count : " + count2);
		System.out.println("iteration count : " + count3);
	}
	
	//재귀를 통한 피보나치
	public static int fibo_recursion(int n) {

		if (n <= 1)
			return n;
		count1 += 1;
		return fibo_recursion(n - 1) + fibo_recursion(n - 2);
	}

	//memorization을 통한 피보나치
	public static int fibo_memorization(int n) {
		if (n <= 1)
			return n;

		if (memorization[n] != 0)
			return memorization[n];
		
		memorization[n] = fibo_memorization(n - 1) + fibo_memorization(n - 2);
		count2 += 1;
		return memorization[n];
	}

	//반복문을 통한 피보나치
	public static int fibo_iteration(int n) {
		if (n <= 1)
			return n;
		
		int num1 = 0;
		int num2 = 1;
		int temp = 0;

		for (int i = 2; i <= n; i++) {
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			count3 += 1;
		}

		return temp;

	}
}
