package test04_삼각형3;

public class Array03_2차원배열_삼각형3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//                 7  
//              4  8  
//           2  5  9  
//        1  3  6  10 
        int cnt = 0;
        for(int c=0; c<arr.length; c++) {
        	for(int r=arr.length-1-c; r<arr.length; r++) {
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
