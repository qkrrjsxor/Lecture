package test03_삼각형2;

public class Array03_2차원배열_삼각형3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//                  1
//               3  2
//            6  5  4
//        10  9  8  7
        int cnt = 0;
        for(int r= 0; r<arr.length; r++) {
        	for(int c=arr.length-1; c>=arr.length-r-1; c--) {
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
