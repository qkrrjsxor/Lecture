package test09_generic_box;

//제네릭 클래스 : 타입을 매개변수화
class Box<T>{ // T : String, Double, Integer ...
    private T t;
    
    public T getT() {
        return t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        intBox.setT(123); 	//타입 체크를 해준다
        
        Box<String> strBox = new Box<String>();
        strBox.setT("HI");
        String str = strBox.getT();
    }
}
