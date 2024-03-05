
public class String_04_패턴매칭 {
	//고리타분한 알고리즘
	public static void main(String[] args) {
		String text = "This iss a book";
		String pattern = "iss";

		int result = patternMatching(text.toCharArray(), pattern.toCharArray());
		
		System.out.println(result);
	}

	public static int patternMatching(char[] text, char[] pattern) {
		//i : 패턴 비교 시작 위치
		//j : 문자 하나씩 비교하는 인덱스
		start: for (int i = 0; i <= text.length - pattern.length; i++) {
			pattern: for (int j = 0; j < pattern.length; j++) {
				if (text[i + j] != pattern[j]) {
					continue start;
				}
			}
			return i;
		}
		//패턴 없을 시
		return -1;
	}

}
