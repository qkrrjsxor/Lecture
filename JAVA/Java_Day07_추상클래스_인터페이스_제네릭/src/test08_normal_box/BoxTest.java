package test08_normal_box;

class Box {
    private Object obj;
    
    public Object getObj() {
        return obj;
    }
    
    public void setObj(Object obj) {
        this.obj = obj;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj("Hi");
        box.setObj(11);
        box.setObj(22.1);
        //Object로 설계도를 만들면 모든 자료형 매개변수로 입력 가능
        //입력할 땐 편하지만 뺄 때는 번거롭다
        //항상 Object로 리턴 하므로 형변환을 해줘야 한다.
        Object obj = box.getObj();
        double d = (double) obj;
        
        if(obj instanceof Double) {
        	System.out.println("실수입니다");
        } 
        else if(obj instanceof String) {
        	System.out.println("문자열입니다.");
        }
        
    }
}