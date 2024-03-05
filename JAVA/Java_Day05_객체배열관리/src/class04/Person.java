package class04;

public class Person {
	
	//static 변수
	//-메소드 영역(static 영역)에 메모리 할당
	//-인스턴스 생성하기 전에 이미 클래스 로딩 시점에 메모리 할당됨
	//-객체 생성 없이 클래스 이름으로 바로 접근 가능
	//-모든 인스턴스가 공유 **
	static int pCount; // 사람의 수를 세는 변수
	
	//멤버 변수 : 객체가 가지고 있는 변수
	//non-static 변수
    String name;
    int age;
    String hobby;
    
    
    //non-static 메소드
    //메소드 - 클래스 안에 정의된 함수
    //멤버 메소드 : 객체가 가지고 있는 메소드
    void info() {
    	System.out.println("이름은"+name +"이고 나이는"+age+"세 취미는 "+hobby);
    }
    
    //static 메소드
    static void hello() {
    	System.out.println("hello");
    }
}
