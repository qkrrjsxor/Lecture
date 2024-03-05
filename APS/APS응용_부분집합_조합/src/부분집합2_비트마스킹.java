
public class 부분집합2_비트마스킹 {

	public static void main(String[] args) {
		String[] 재료 = { "단무지", "참치", "헴", "소고기" };
		int n = 4;
		int[] sel = new int[n];
		
		// n개의 재료로 만들 수 있는 부분집합 가지수 : 2^n = 1<<n
		
		for (int i = 0; i < (1 << n); i++) {
			// i = 0 부터 2^n 까지 -> 0000 ~ 1111
			// i라는 값은 -> 부분집합의 값
			// i의 재료가 뭐로 구성되어있는가>?

			String tmp = "";
			// 모든 i의 비트에 대해서 오른쪽부터 1과 비트 비교해가면서 1이면 재료 추가
			for (int j = 0; j < n; j++) {

				if ((i & (1 << j)) > 0) {
					tmp += 재료[j];
				}
			}
			System.out.println(tmp);
		}

	}
}
