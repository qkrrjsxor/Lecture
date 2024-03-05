package test01_2차원배열기본;

public class Array03_2차원배열_생성2 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][4];
        int[][] arr2 = new int[3][];
        
        System.out.println(arr2[0]);
        
        arr2[0] = new int[] {1, 2, 3};
        arr2[1] = new int[] {4, 5, 6, 7, 8};
        arr2[2] = new int[] {9};
        
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);
        
        for(int r=0; r < arr2.length; r++) {
        	for(int c = 0; c< arr2[r].length; c++) {
        		System.out.print(arr2[r][c]);
        	}
        	System.out.println();
        }

    }
}
