package class02;

public class PersonTest {
    public static void main(String[] args) {
        
    	//클래스(Person)은 변수(생성될 객체)의 타입으로 사용
    	//=>클래스는 사용자 정의 자료형이다.
    	
    	//객체 생성
    	//클래스명 변수명 = new 클래스명();
    	Person yang = new Person();
    	
    	//yang : instance
    	//객체의 멤버변수에 접근할 때는 . 연산자  사용
    	yang.name = "Yang";
    	yang.age = 45;
    	yang.hobby = "Youtube";
    	
        
        
    }
}
