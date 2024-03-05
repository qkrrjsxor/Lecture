package test03_super;

public class Student extends Person{
   
    String major;
    
    public Student(String name, int age, String major) {
		super(name, age); //부모클래스의 생성자 호출
		this.major = major;
		System.out.println("Student의 생성자입니다.");
    }
 
    public void study() {
        System.out.println("공부를 한다.");
        super.eat();
    }
    
}
