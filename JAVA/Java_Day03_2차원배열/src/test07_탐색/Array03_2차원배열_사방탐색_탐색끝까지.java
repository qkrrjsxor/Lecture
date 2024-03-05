package test07_탐색;

public class Array03_2차원배열_사방탐색_탐색끝까지 {
    public static void main(String[] args) {
        
        // 다음 배열에서 1이 들어있는 칸을 포함한 행과 열에 
        // 모두 2를 채워 넣는다.(1이 들어있는 칸 제외)
        
        int[][] arr = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        
        int N = 7;
        
      //델타배열 만들기
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        //1. 행 우선 순회
        for(int r = 0; r< N; r++) {
        	for(int c = 0; c<N; c++) {
        		if(arr[r][c] == 1) {   //1인 원소를 발견했다면
        			//(r, c) => 1인 원소의 좌표
        			System.out.println("r: "+r+", c: "+c);
        			//(r, c)를 기준으로 상하좌우의 인접 좌표를 만든다
        			
        			for(int d=0; d<4; d++) {
        				//새로운 좌표
        				
//        				for(int l = 1; l<=2; l++) {
//    					int nr = r+l*dr[d];
//    					int nc = c+l*dc[d];
        				
//        				while(nr>=0 && nr < N && nc>=0 && nc<N) {
//        					arr[nr][nc] = 2;
//        					nr += dr[d];
//        					nc += dr[d];
//    					}
        				
        				
        			}
        		}
        	}
        }
	    for(int r=0; r<N;  r++) {
	    	for(int c=0; c<N; c++) {
	    		System.out.printf("%2d", arr[r][c]);
	    	}
	    	System.out.println();
	    }
        
    }
}
