
import java.util.Arrays;

public class 카운팅정렬 {
	public static void main(String[] args) {
		int[] arr = {32, 55, 27, 94, 75, 69};
		int[] sortedArr= countingSort(arr);
		System.out.println(Arrays.toString(sortedArr));
	}

	private static int[] countingSort(int[] arr) {
		
		//count 배열의 길이 = arr 밸류 중 최대값
		int[] count = new int[100]; 
		
		//count 배열 플러스
		for(int i = 0 ; i <arr.length; i++) {
			count[arr[i]]++;
		}
		
		//누적합으로 만들기
		for(int i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}
		
		int[] sortedArr = new int[arr.length];
		
		//역방향 순회를 하면서 누적합 배열을 보고 위치를 찾아준다
		for(int i = arr.length-1; i >= 0; i--) {
			sortedArr[--count[arr[i]]] = arr[i];
		}
		
		return sortedArr;
	}
}
