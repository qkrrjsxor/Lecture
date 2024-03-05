package modifier05_getter_setter;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        
        //p.name = "Park"; //private 멤버변수에 직접 접근 불가
        //위의 방법이 할 수 있는 것은 값을 할당하는 것 밖에 할 수 없음!
        // => 기타 로직(검증 로직)의 추가가 불가능하
        p.setName("Park");
        //
        //p.age = -10;  => 로직 추가가 불가능
        p.setAge(-10);
        
    }
}
