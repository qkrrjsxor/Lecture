package test01_2차원배열기본;

public class Array04_2차원배열_순회 {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        
        //이중 for문
        //행 우선순회
        for(int r=0; r<3; r++) {
        	for(int c=0; c<4; c++) {
        		System.out.print(arr[r][c]+" ");
        	}
        	System.out.println();
        }
        System.out.println("---");
        //열 우선순회
        //바깥쪽 for문 : 열, 안쪽 fod문 : 행
        for (int c=0; c<4; c++) {
        	for(int r=0; r<3; r++) {
        		System.out.print(arr[r][c] + " ");
        	}
        	System.out.println();
        }
        System.out.println("---");
        //지그재그 순회
        //행 우선순회를 기본으로
        //0, 2, 4 ... 행 => 정방향
        //1, 3, 5 ... 행 => 역방향
        for(int r=0; r<3; r++) {
        	if(r%2==0) {
        		for(int c=0; c<4; c++) {
        			System.out.print(arr[r][c] + " ");
        		}
        	}
        	else {
        		for(int c=3; c>=0; c--) {
        			System.out.print(arr[r][c] + " ");
        		}
        	}
        	System.out.println();
        }
        System.out.println("---");
    }
}
