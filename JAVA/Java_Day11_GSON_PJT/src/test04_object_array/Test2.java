package test04_object_array;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Test2 {
	public static void main(String[] args) {
		String str = "[{\"name\":\"Yang\",\"age\":45},{\"name\":\"Kim\",\"age\":33},{\"name\":\"lee\",\"age\":55}]";
		
		//객체 배열의 문자열 => 객체 배열로
		
		Gson gson = new Gson();
		
		Person[] arr = gson.fromJson(str, Person[].class);
		
		System.out.println(Arrays.toString(arr));
		
//		먼저 배열로 받은 다음에 → 리스트로 변환 하는게 더 이해하기 편할 것
//
//		바로 리스트로 받으려면 => Gson 라이브러리 TypeToken
//
//		ArrayList 사용한다면?
		
		Type listType = new TypeToken<ArrayList<Person>>() {}.getType();
		
		ArrayList<Person> list = gson.fromJson(str, listType);
		
		System.out.println(list);
	}
}
