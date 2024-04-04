import java.util.Arrays;
import java.util.Scanner;

public class 동적계획법_01_피보나치 {
	static int[] callFibo = new int[100];
	static int[] memo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		memo = new int[N+1];
		Arrays.fill(memo, -1);
		memo[0] = 0;
		if(N > 0) {
			memo[1] = 1;
		}
		
		System.out.println(fibo3(N));
		System.out.println(Arrays.toString(memo));
	}
	
	//일반 재귀로 구현한 피보나치
	public static int fibo1(int n)
	{
		callFibo[n]++;
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fibo1(n-1) + fibo1(n-2);
	}
	
	
	//Memoization을 활욯한 재귀 DP
	public static int fibo2(int n) {
		if(memo[n] == -1) {
			memo[n] = fibo2(n-1) + fibo2(n-2);
		}
		
		
		return memo[n];
	}
	
	
	//for문을 이용한 DP 알고리즘
	public static int fibo3(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i < n+1; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
}
