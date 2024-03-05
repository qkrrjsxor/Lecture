package test04_삼각형3;

public class Array04_2차원배열_삼각형4 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//        1  2  4  7  
//           3  5  8  
//              6  9  
//                 10 
        int cnt = 0;
        for(int c= 0; c<arr.length; c++) {
        	for(int r=0; r<c+1; r++) {
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
