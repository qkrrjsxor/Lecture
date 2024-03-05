package class05;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 45;
        p.name= "Yang";
        p.hobby="Youtube";
        

        p.study(10);
        p.study((byte)1); //묵시적 형변환 
        p.study((char)2);
        
    }
}
