package test02_class_reflection;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		//Class<T> : 클래스 자체에 대한 정보를 담고 있는 클래스
		//-메타데이터
		
		//Person => 객체의 타입을 지정할 때
		//Class<Person> : Person이란 클래스 자체에 대한 정보..
		//	-이 클래스의 이름이 뭔지, 생성자는 몇 개 있는지, 필드는 뭔지 등등ㄷ
		
		Class<Person> personClassInfo = Person.class;
		
		System.out.println(personClassInfo.getName());
		System.out.println(personClassInfo.isInterface());
		System.out.println(Arrays.toString(personClassInfo.getConstructors()));
	}

}	
