import java.util.Arrays;

public class 조합1_재귀함수2 {
	//데이터 배열
	static String[] 재료 = {"상추", "패티", "치즈", "피클"};
	static int N, R;
	static String[] sel;
	
	public static void main(String[] args) {
		N=4;
		R=2;
		sel = new String[R];
		combination(0,0);
	}
	
	//idx : 현재 내가 판단할 재료
	//sidx : 조합할 재료의 인덱스
	private static void combination(int idx, int sidx) {
		//base case
		if(sidx>=R) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		if(idx >= N) {
			return;
		}
		
		//recursive case
		sel[sidx] = 재료[idx];
		combination(idx+1, sidx+1);
		
		combination(idx+1, sidx);
		
	}
	
	
}
