package test04_object_array;

import java.util.Arrays;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) {
		Person[] arr = new Person[3];
		
		arr[0] = new Person("Yang", 45);
		arr[1] = new Person("Kim", 33);
		arr[2] = new Person("lee", 55);
		
		System.out.println(Arrays.toString(arr));
		
		Gson gson = new Gson();
		
		String str = gson.toJson(arr);
		
		System.out.println(str);
	}
}
