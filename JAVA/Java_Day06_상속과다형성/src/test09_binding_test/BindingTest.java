package test09_binding_test;


class Parent {
    String x = "parent x";
    
    public void method() {
        System.out.println("parent method.");
    }
}

class Child extends Parent{	//Parent class 상속
    String x = "child x";	//Parent class에서 상속받은 멤버변수 x를 다시 정의?
    						//이것은 overriding(재정의?) 아니다. Hiding이다.
    
    @Override
    public void method() {
        System.out.println("child method.");
    }
}

public class BindingTest {
    
    public static void main(String[] args) {
        Parent a = new Parent();
        Child b = new Child();
        
        System.out.println(a.x);
        a.method();
        
        System.out.println(b.x);	//Hiding
        b.method();					//Overriding
        
        
        //다형성
        Parent c = new Child();		//Child type 객체 c를 Parent로 묵시적 형변환
        System.out.println(c.x);	//변수는 hiding 하였지만 Parent의 변수가 나옴
        c.method();					//행위(메소드)는 Child의 행동
        
        //실제 객체가 child 이므로 행위는 child의 행위를 할것임
        //(부모클래스의 타입으로 참조한다 하더라도)
        
        //다형성 : 실제 객체의 행위가 나온다
        //멤버 메서드는 부모의 관점으로 바라보더라도 자식에서 재정의한 행위가 발생 => 다형성
        //멤버 변수는 다형성을 따르지 않고 부모의 관점에서 본 변수
        
        //이것을 동적 바인딩이라 부른다
    }

}
