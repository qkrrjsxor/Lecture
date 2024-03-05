package class06;

public class Person {
    String name;
    int age;
    String hobby;
    
    //파라미터가 있는 생성자
    Person(String n, int a, String h){
    	name = n;
    	age = a;
    	hobby = h;
    }
    
    //기본 생성자
    Person(){
    	
    }
    Person(String name, int age){
    	this(name, age, "취미없음");
    }
    
    //this는 멤버 변수와 파라미터를 구분하기 위해서 사용
    
    void info() {
    	System.out.println("이름은"+name +"이고 나이는"+age+"세 취미는 "+hobby);
    
    }
    
}
