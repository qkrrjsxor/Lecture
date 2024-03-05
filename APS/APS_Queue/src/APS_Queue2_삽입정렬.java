import java.util.Arrays;

public class APS_Queue2_삽입정렬 {
	public static void main(String[] args) {
		int[] data = {69, 10, 30, 2,7, 16, 8, 31, 22};
		
		
		//정렬되지 않은 집합 U 의 원소를 하나씩 순회
		for(int i = 1; i<data.length; i++) {
			int key = data[i];
			
			int j;
			//정렬된 집합 S의 원소와 뒤에서부터 비교
			for(j = i-1; j>=0; j--) {
				if(data[j] <= key)	break;
				
				
				//비교 다 끝나고 옮기지 말고 아예 비교하면서 한칸씩 옮기자
				data[j+1] = data[j];		//data[j+1]의 값은 이미 key에 저장되어있다
			}
			
			data[j+1] = key;
		}
		
		System.out.println(Arrays.toString(data));
	}
}
