import java.util.Arrays;

public class String_03_atoi {
	public static void main(String[] args) {
		String str = "123546";
		
		int result = atoi(str);
		

		System.out.println(result);
	}
	
	public static int atoi(String str) {
		int value = 0;
		
		for(int i =0; i<str.length(); i++) {
			char c= str.charAt(i);
			if('0' <= c && c <= '9') {
				value = value*10 + (c-'0');
			}else {
				System.out.println("no");
				return -111;
			}
			
		}
		return value;
	}
}
