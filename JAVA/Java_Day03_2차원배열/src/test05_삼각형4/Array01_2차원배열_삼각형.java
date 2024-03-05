package test05_삼각형4;

public class Array01_2차원배열_삼각형 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//        4           
//        3  7        
//        2  6  9     
//        1  5  8  10 
        int cnt = 0;
        for(int c = 0; c<arr.length; c++) {
        	for(int r=arr.length-1; r >= c; r--) {
        		arr[r][c] = ++cnt;
        		
        	}
        }
        
        for(int r=0; r<arr.length; r++) {
        	for(int c=0; c<arr.length; c++) {
        		if(arr[r][c] == 0) {
        			System.out.print("   ");
        			
        		}
        		else {
        			System.out.printf("%3d",arr[r][c]);
        		}
        	}
        	System.out.println();
        	
        }

    }
}
