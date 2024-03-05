package test01_object;

import com.google.gson.Gson;

public class Test2 {
	public static void main(String[] args) {
		String str = "{\"name\":\"Yang\",\"age\":45}";
		// JSON 문자열 -> 자바 객체

		Gson gson = new Gson();

		// gson.fromJson(문자열, 클래스정보)
//		gson.from
		Person p = gson.fromJson(str, Person.class);
		System.out.println(p);
	}

}
