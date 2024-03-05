package test03_delete_method;

public class ChefTest {
    public static void main(String[] args) {
        Chef[] chefs = new Chef[2];
        
        chefs[0] = new KFoodChef();
        chefs[1] = new JFoodChef();
        
        //chef 부모 클래스에서 쓰이지 않는 cook() 메서드를 삭제 했더니
        // 자식 객체가 cook()메서드를 갖고 있다 하더라도 접근 불가
        //부모 클래스 Chef[] 로 KFoodChef, JFoodChef 접근하고 있기 때문에
        for(Chef chef:chefs) {
        	chef.eat();
        	//chef.cook();	 참조할 수 없는 에러가 발생  - 다형성 활용 불가, 동적바인딩 불가
        }
    }
}
