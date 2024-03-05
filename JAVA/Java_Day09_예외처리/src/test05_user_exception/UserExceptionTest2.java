package test05_user_exception;

import java.util.Arrays;

public class UserExceptionTest2 {

	public static String[] fruits;

	public static void main(String[] args) {

		fruits = new String[] { "사과", "사과", "오렌지", "토마토" };
		
		try {
			eatFruit("사과");
		}catch(FruitNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void eatFruit(String name) throws FruitNotFoundException{
		for (int i = 0; i < fruits.length; i++) {
			if (name.equals(fruits[i])) {
				fruits[i] = null;
				System.out.println(name + "(을)를 먹었습니다.");
				
			}
		}
		//사용자 정의 예외 발생
		//throw new 예외 클래스 생성자();
		System.out.println(Arrays.toString(fruits));
		throw new FruitNotFoundException(name);
	}

}
