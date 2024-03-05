package class05;

public class Person {
    String name;
    int age;
    String hobby;
    
    void study(int time) {
    	System.out.println(time + "시간 공부 합니다");
    }
    
    void study(String subject, int time) {
    	System.out.println(subject+"를"+time+"시간 공부합니다 (1)");
    }
    
    void study(int time, String subject) {
    	System.out.println(subject+"를"+time+"시간 공부합니다 (2)");
    }
    
}
