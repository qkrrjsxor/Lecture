package test05_object;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Hong", 25);
        // p.
        Student st = new Student("Yang", 45, "Computesr");
        // st.
        st.eat();
        
        System.out.println(p.toString());
        System.out.println(st.toString()); // Object.toString(): 참조값
    
        Student st2 = new Student("Yang", 46, "Computer");
        
        System.out.println(p);
        System.out.println(st == st2);
        System.out.println(st.equals(st2));
    }
}
