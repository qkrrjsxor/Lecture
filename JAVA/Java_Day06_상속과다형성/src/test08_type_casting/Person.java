package test08_type_casting;

public class Person {
    String name;
    int age;
    
    public Person() {
        super(); 
    }

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("음식을 먹는다.");
    }
}
