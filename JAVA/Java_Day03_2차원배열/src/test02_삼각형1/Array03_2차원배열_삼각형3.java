package test02_삼각형1;

public class Array03_2차원배열_삼각형3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//                 1  
//              2  3  
//           4  5  6  
//        7  8  9  10 
        int cnt = 0;
        for(int r= 0; r<arr.length; r++) {
        	for(int c=arr.length-1-r; c<arr.length; c++) {
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
