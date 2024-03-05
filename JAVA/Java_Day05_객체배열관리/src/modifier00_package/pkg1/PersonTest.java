package modifier00_package.pkg1;

import modifier00_package.pkg1.pkg2.Person;
//기본적으로는 같은 패키지 안에 있는 것을 사용하지만
//import를 하면 그 패키지를 하용한다.

public class PersonTest {
    public static void main(String[] args) {
    	Person p2 = new Person();
    	System.out.println(p2.pkg);
    	
    	//만약 서로 다른 패키지에 있지만 이름이 같은 클래스를 동시에 사용하고 싶다면?
    	//풀패키지명을 사용한다 =
    	modifier00_package.pkg1.pkg2.pkg3.Person p3 = new modifier00_package.pkg1.pkg2.pkg3.Person();
    	modifier00_package.pkg1.Person p1 = new modifier00_package.pkg1.Person();
    	
    	System.out.println(p1.pkg);
    	System.out.println(p2.pkg);
    	System.out.println(p3.pkg);
    }
}
