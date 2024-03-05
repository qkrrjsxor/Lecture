package test04_overriding;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Hong", 25);
        // p.
        Student st = new Student("Yang", 45, "Computesr");
        // st.
        st.eat();
    }
}
