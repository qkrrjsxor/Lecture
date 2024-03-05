
public class 분할정복04_이진검색_재귀 {
	static int[] arr;
	static int key;

	public static void main(String[] args) {
		arr = new int[] { 2, 4, 6, 8, 9, 17, 28 };
		key = 6;

		System.out.println(binarySearch(0, arr.length));
	}

	public static boolean binarySearch(int st, int ed) {
		if (st > ed)
			return false; // 못찾았어( 교차가 되니 그만해)

		int mid = (st + ed) / 2;

		// 같다면
		if (arr[mid] == key)
			return true;
		// 크다면
		else if (arr[mid] > key)
			return binarySearch(st, mid - 1);
		// 작다면
		else
			return binarySearch(mid + 1, ed);
	}
}
