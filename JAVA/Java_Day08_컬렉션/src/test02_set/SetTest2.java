package test02_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest2 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        
        Person p1 = new Person("사람1", "111111");
        Person p2 = new Person("사람1", "111111");
        
        set.add(p1);
        set.add(p2);
        
        // 사람이 한 사람만? 아니면 두 사람?
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());	//Object로부터 물려받은 계산 로직이 아니라
        
        System.out.println("사람1".hashCode());
        System.out.println("사람1".hashCode());
        
    }
}
