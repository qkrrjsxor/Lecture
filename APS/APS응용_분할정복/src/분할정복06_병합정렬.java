import java.util.Arrays;

public class 분할정복06_병합정렬 {
	static int[] arr = { 5, 22, 32, 26 , 57, 19, 32, 55 , 84};
	static int[] sortedArr = new int[arr.length]; 		//임시로 저장할 배열
	
	public static void main(String[] args) {
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		//값 두개만 인자로 넣자
		mergeSort(0, arr.length-1);
		System.out.println("정렬 후 : " + Arrays.toString(sortedArr));
	}

	//left는 구간의 시작 위치, right는 구간의 끝 위치
	private static void mergeSort(int left, int right) {
//		if(left >= right) return;  이렇게 제한 하거나
		
		if(left < right) {
			int mid = (left + right)/2;
			mergeSort(left, mid);
			mergeSort(mid+1, right);
			merge(left, mid, right);
		}
		
	}
	
	static void merge(int left, int mid ,int right) {
		int L = left;
		int R = mid +1;
		int idx = left;
		
		//서로 아직 비교할 수 있는 값들이 남아있을 때
		while(L <= mid && R <= right) {
			
		}
	}
}
