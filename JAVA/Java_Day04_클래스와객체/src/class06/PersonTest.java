package class06;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 45;
        p.name= "Yang";
        p.hobby="Youtube";
        
        Person a = new Person("Yang",35,"Youtube");
        System.out.println(a.age);
    }
}
