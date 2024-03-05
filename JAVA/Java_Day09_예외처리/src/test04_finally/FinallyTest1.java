package test04_finally;

public class FinallyTest1 {
    public static void main(String[] args) {

        int num = 0;
        int[] nums = {10};
        
        //예외 발생 시 : 1 3 4 5
        //정상 실행 시 : 1 2 3 4
        //예외 미처리 시 : 1 4 (중단)
        
        try {
            System.out.println("1");
            int i = 1 / num;
            System.out.println("2");
        } catch (ArithmeticException e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
        System.out.println("5");
    }

}
