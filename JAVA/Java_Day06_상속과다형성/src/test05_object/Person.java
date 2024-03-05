package test05_object;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		//생성자의 첫줄에넌 super; 가 생략되어있다.
		//super() : 부모 생성자 호출은 첫줄에 와야함
		//this() : 자신의 다른 생성자 호출, 을 사용한다면 this()는 첫줄에 와야함.
		// 둘 중에 하나만 쓸 수 있다.
		this.name = name;
		this.age = age;
		System.out.println("Person의 생성자입니다");
		
	}
	public void eat() {
		System.out.println("음식을 먹는다.");
	}
}
