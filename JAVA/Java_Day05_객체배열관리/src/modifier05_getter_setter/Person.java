package modifier05_getter_setter;

//getter와 setter를 이용한 캡슐화 구현

public class Person {
    //1. 멤버 변수(데이터 필드)는 외보에서 접근 못하도록 private로 막는
	private String name;
    private int age;
    private String hobby;
    
    //2. 합법적인 통로를 열어준다
    // - 접근자 & 설정자
    
    //접근자(getter)
    //public 자료형 get멤버변수명{
    //	return 멤버변수;
    //}
    //메소드 명 : camelCase로 작성
    public String getName() {
    	return name;
    }
    
    //설정자(setter)
    //public void set멤버변수명(자료형 매개변수){
    //	멤버변수 = 매개변수값;
    //}
    public void setName(String name) {
    	this.name = name;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 1) {
			System.out.println("나이가 음수가 될 수 없다");
			return;
		}
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
    
	
}
