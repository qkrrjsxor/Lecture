import java.util.Arrays;

public class 병합정렬 {
	static int[] arr = {32, 55, 27, 94, 75, 69};
	static int[] sortedArr = new int[arr.length];
	
	public static void main(String[] args) {
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		mergeSort(0, arr.length-1);
		
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

	private static void mergeSort(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
