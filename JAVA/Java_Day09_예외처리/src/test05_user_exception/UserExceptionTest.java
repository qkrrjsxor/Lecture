package test05_user_exception;

public class UserExceptionTest {

	public static String[] fruits;

	public static void main(String[] args) {

		fruits = new String[] { "사과", "사과", "오렌지", "토마토" };

		boolean result = eatFruit("사과");

	}

	public static boolean eatFruit(String name) {
		for (int i = 0; i < fruits.length; i++) {
			if (name.equals(fruits[i])) {
				fruits[i] = null;
				System.out.println(name + "(을)를 먹었습니다.");
				return true;
			}
		}
		return false;
	}

}
