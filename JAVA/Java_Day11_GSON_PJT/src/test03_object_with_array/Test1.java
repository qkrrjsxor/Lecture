package test03_object_with_array;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("Yang", 45, new String[] {"Youtube", "Golf"});
		
		Gson gson = new Gson();
		
		String str = gson.toJson(p);
		
		System.out.println(str);
		
	}
}
