package test03_삼각형2;

public class Array02_2차원배열_삼각형2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//        4  3  2  1
//        7  6  5   
//        9  8      
//       10         
        int cnt = 0;
        for(int r = 0; r < arr.length; r++ ) {
        	for(int c=arr[r].length-r-1 ; c >= 0; c--) {
        		arr[r][c] = ++cnt;
        	}
        }
        
        for(int r = 0; r < arr.length; r++) {
        	for(int c = 0; c < arr[r].length; c++) {
        		if(arr[r][c] ==0) {
        			System.out.print("  ");
        		}
        		else{
        			System.out.printf("%-2d", arr[r][c]);
        		}
        	}
        	System.out.println();
        }

        
    }
}
