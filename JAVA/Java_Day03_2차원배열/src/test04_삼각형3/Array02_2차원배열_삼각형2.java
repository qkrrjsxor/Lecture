package test04_삼각형3;

public class Array02_2차원배열_삼각형2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        
//        1  5  8  10 
//        2  6  9     
//        3  7        
//        4       
        int cnt = 0;
        for(int c = 0; c < arr.length; c++) {
        	for(int r = 0; r < arr.length - c; r++) {
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
