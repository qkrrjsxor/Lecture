package test11_generic_restriction;

class Box<T> {
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}

class FlyBox<T extends AbleToFly> { //AbleToFly 인터페이스를 구현한 타입만 올 수 있는 Box
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}

class BirdBox<T extends Bird> {	//Bird의 자손 클래스 타입만 올 수 있는 Box
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}
//Bird의 자손이면서 AbleToFly와 AbleToSwim을 구현한 타입만 올 수 있는
class FlyingAndSwimmingBirdBox<T extends Bird & AbleToFly & AbleToSwim> {
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}


public class Test {
    public static void main(String[] args) {
        FlyBox<Butterfly> f1 = new FlyBox<>();	//Butterfly만 들어갈 수 있다.
        f1.setT(new Butterfly());
//        f1.setT(new Duck());
        FlyBox<AbleToFly> f2 = new FlyBox<>();
        f2.setT(new Butterfly());
        f2.setT(new Duck());
        f2.setT(new Swan());
        System.out.println(f2.getT());
        
        BirdBox<Bird> b1 = new BirdBox<>();
//        b1.setT(new Butterfly());
        b1.setT(new Duck());
        
        FlyingAndSwimmingBirdBox<Duck> b2 = new FlyingAndSwimmingBirdBox<>();
        FlyingAndSwimmingBirdBox<Swan> b3 = new FlyingAndSwimmingBirdBox<>();
        
        b2.setT(new Duck());
        
        
    }
}
