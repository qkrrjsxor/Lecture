
public class String_02_문자열뒤집기 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		//Strin class -> toCharArray
		char[] ch = str.toCharArray();

		//swap 횟수 : str length 의 절반 (홀수여도 소수점 버리기)
		for(int i = 0; i<str.length()/2; i++) {
			char tmp = ch[i];
			ch[i] = ch[str.length()-1-i];		//str.length가 여러번 호출되니까 비효율적 -> 따로 변수에 넣으면 좋다
			ch[str.length()-1-i] = tmp;
		}
		
		System.out.println(ch);
	}

}
