
public class 분할정복02_거듭제곱_재귀 {
	public static void main(String[] args) {
		int C = 2;
		int N = 10;

	}

	public static int pow(int C, int N) {
		// 기저조건
		if (N == 1)
			return C;

		// 재귀 부분
		if (N % 2 == 0) { // 짝수이면
			return pow(C, N / 2) * pow(C, N / 2);
		} else {
			return pow(C, (N - 1) / 2) * pow(C, (N - 1) / 2)* C;
		}
	}
	
	public static int pow2(int C, int N) {
		// 기저조건
		if (N == 1)
			return C;

		// 재귀 부분
		int tmp;
		if (N % 2 == 0) { // 짝수이면
			tmp = pow(C, N/2);
			return tmp*tmp;
		} else {
			tmp = pow(C, (N-1)/2);
			return tmp*tmp *C;
		}
	}
	
	public static int pow3(int C, int N) {
		// 기저조건
		if (N == 1)
			return C;

		// 재귀 부분
		int tmp = pow(C, N/2);
		if (N % 2 == 0) { // 짝수이면
			tmp = pow(C, N/2);
			return tmp*tmp;
		} else {
			tmp = pow(C, (N-1)/2);
			return tmp*tmp *C;
		}
	}
	
	
}
