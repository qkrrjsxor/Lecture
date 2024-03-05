package test08_type_casting;

public class Test {
    public static void main(String[] args) {
        // 기초자료형의 형변환.
        // - 묵시적 형변환, 명시적 형변환.
        
        // 객체의 형변환.
        // 1. 묵시적 형변환 : 자손 객체의 타입 => 조상 타입
        Person p =new Person(); //Person type의 p 객체
        Object obj = p;			//Person type p 객체를 Object로 바라본다 -> 묵시적 가능
        Student st = new Student(); //Student type의 st 객체
        Object obj2 = st;		//Student type의 st 객체를 Object로 바라본다 ->묵시적 가능
   
        
        // 2. 명시적 형변환 : 조상 타입 => 자손 타입
        Person p2 = (Person)obj;	//Object (조상) 타입을 Person(자손) 타입으로 캐스팅
        Student st2 = (Student)obj2;//Object (조상) 타입을 Student(자손) 타입으로 캐스팅
        p2.eat();					//Person class의 메소드 출력됨
        st2.study();				//Student class의 메소드 출력됨
        
        Student st3 = (Student) p;	//애초부터 Person 타입이었던 p를 Student 타입으로 캐스팅
        st3.study();				//p 객체에 study() 메모리에 없으므로 에러남
        
        //instanceof 연산자를 사용하면 해당 객체가 그 클래스의 인스턴스인지 확인할 수 있으
        //객체 instanceof 클래스
        //클래스가 자신 클래스이거나 부모클래스이면 true
        if(obj instanceof Person)	
            ((Person)obj).eat();	

        
        if(obj2 instanceof Student)
            ((Student)obj2).eat();

        
        if(obj2 instanceof Person)
            ((Person)obj2).eat();
        
        
        
        
    }
}
