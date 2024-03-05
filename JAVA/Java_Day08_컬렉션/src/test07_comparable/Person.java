package test07_comparable;

//컬렉션 프레임워크에서 정렬 가능하도록 만들려면
//Comparable 인터페이스
public class Person implements Comparable<Person>{
    String name;
    int age;
    
    
    
    
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

	@Override
//	public int compareTo(Person o) {
//		//this 와 o 객체를 비교해서 정수값을 반환
//		
//		//나이순으로 정렬한다면
//		//오름차순 3, 8, 11, 22
//		//앞 숫자가 작고 뒤 숫자가 크다
//		//앞-뒤 = 음수
//		
//		//만약나이가 같다면 이름순으로
//		//이름 : 문자열 => string의 compareTo가 있다
//		if(this.age == o.age) {
//			return this.name.compareTo(o.name);
//		}
//		return this.age - o.age;
//	}

	public int compareTo(Person o) {
		//이름 순 정렬
		//이름이 같으면 나이순 정렬
		if(this.name.equals(o.name)) {
			return this.age - o.age;
		}
		return this.name.compareTo(o.name);
	}
    
}
