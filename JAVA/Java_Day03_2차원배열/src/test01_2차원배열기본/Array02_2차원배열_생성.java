package test01_2차원배열기본;

import java.util.Arrays;

public class Array02_2차원배열_생성 {
    public static void main(String[] args) {
        int [][] arr1 = new int[3][4];  //자료의 기본형으로 초기화
        int [][] arr2 = new int[][] {
        	{1,2,3,4},
        	{5,6,7,8},
        	{9,10,11,12}
        };
        int[][] arr3 = {
        		{1,2,3,4}, {5,6,7}, {8}
        };
        int[][] arr4 = new int[3][4];
        
        System.out.println(arr3[1][2]);
        System.out.println(arr4[0][1]);
        
        arr4[0] = new int[] {1,3,5};
        System.out.println(arr4[0][1]);
        //arr4[0][1] = new int(3);
        System.out.println(arr4[0][1]);
        arr4[1] = new int[] {6, 2, 8, 1, 5, 7};
        System.out.println(arr4[1][5]);
    }
}
