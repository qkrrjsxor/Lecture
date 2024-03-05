package test05_object;

public class Student extends Person {
    
    String major;
    
    public Student(String name, int age, String major) {
		super(name, age); //부모클래스의 생성자 호출
		this.major = major;
		System.out.println("Student의 생성자입니다.");
    }
    
    public void study() {
        System.out.println("공부를 한다.");
    }
    
    //부모의 eat()을 수정한다
    //자식 클래스에서 재정의
    @Override
    public void eat() {
    	System.out.println("지식을 먹는다");
    }

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// 이름 String만 같으면
		return name.equals(((Student)obj).name);
	}


	
    
    
}
