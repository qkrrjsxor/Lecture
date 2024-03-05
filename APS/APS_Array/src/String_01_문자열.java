
public class String_01_문자열 {

	public static void main(String[] args) {
		// 리터러 방식 초기화
		String str1 = "abc";
		//new 키워드 초기화
		String str2 = new String("abc");
		
		if(str1 == str2)
			System.out.println("두 문자열이 같습니다. ==");
		else
			System.out.println("다르다");
		
		if(str1.equals(str2))
			System.out.println("두 문자열이 같습니다. .equals");
		else
			System.out.println("다르다");
	}

}
