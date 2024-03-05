package class03;

import java.util.Random;

public class FunctionTest1 {
    public static void main(String[] args) {
//        System.out.println("아침에 일어난다.");
//        System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
//        System.out.println("오전 수업을 듣는다.");
//        System.out.println("점심을 먹는다.");
//        System.out.println("오후 수업을 듣는다.");
//        System.out.println("집으로 대중교통을 이용하여 이동한다.");
//        System.out.println("과제를 해결한다.");
//        System.out.println("잔다.");
//        
//        System.out.println("아침에 일어난다.");
//        System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
//        System.out.println("오전 수업을 듣는다.");
//        System.out.println("점심을 먹는다.");
//        System.out.println("오후 수업을 듣는다.");
//        System.out.println("집으로 대중교통을 이용하여 이동한다.");
//        System.out.println("과제를 해결한다.");
//        System.out.println("잔다.");
        
        이동("멀티캠퍼스","지하철");
        
        boolean homework =교육();
        if(homework)
        	System.out.println("숙제 한다");
        else
        	System.out.println("숙제가 없다");
        

        
    }
    
    static void 이동(String 장소, String 탈것) {
    	System.out.println(장소 + "로"+탈것+"을 이용ㅎ여 이동한다");
    }
    
    static boolean 교육() {
    	System.out.println("오전 수업을 듣는다");
    	System.out.println("점심을 먹는다");
    	System.out.println("오후 수업을 듣느다");
    	
    	Random random = new Random();
    	return random.nextBoolean();   //랜덤하게 true false 
    }
    
    
}
