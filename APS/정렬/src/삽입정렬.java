import java.util.Arrays;

public class 삽입정렬 {
	public static void main(String[] args) {
		int[] arr = {32, 55, 27, 94, 75, 69};
		
		//정렬되지 않은 집합(U)의 원소를 하나씩 순회
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			
			//정렬된 집합(S)의 원소와 뒤에서부터 비교하면서 위치를 찾는다
			int j;
			for(j = i-1; j >= 0 && arr[j]>key; j--) {
				arr[j +1] = arr[j];
			}
			
			arr[j+1] = key;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
