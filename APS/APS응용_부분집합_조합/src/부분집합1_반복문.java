import java.util.Arrays;

public class 부분집합1_반복문 {
	public static void main(String[] args) {

		String[] 재료 = { "단무지", "참치", "헴", "소고기" };
		int n = 4;
		int[] sel = new int[n];


		
		
		
		
		//너무 많은 for문으로 인한 비효율적 코드
//		for (int i = 0; i < 2; i++) {
//			sel[0] = i;
//			for (int j = 0; j < 2; j++) {
//				sel[1] = j;
//				for (int k = 0; k < 2; k++) {
//					sel[2] = k;
//					for (int l = 0; l < 2; l++) {
//						sel[3] = l;
//						System.out.println(Arrays.toString(sel));
//
//						for (int m = 0; m < n; m++) {
//							if (sel[m] == 1) {
//								System.out.println(재료[m]);
//							}
//						}
//					}
//				}
//			}
//		}
	}
}
