package test01_list;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
    	//List
    	//1. 순서가 있다.
    	//2. 중복이 허용된다.
    	
    	List<String> names = new ArrayList<>(); //인터페이스로는 객체 생성 불가능, 클래스로 
    	
    	//원소 추가
    	names.add("박건택");
    	names.add("김");
    	names.add("이");
    	
    	System.out.println(names);
    	
    	//삭제
    	//1. 인덱스
    	names.remove(0);
    	System.out.println(names);
    	//2. 값
    	names.remove("김");
    	System.out.println(names);
    	//3. 전부 삭제
    	names.clear();
    	System.out.println(names);
    	
    	names.add("학생 1");
    	names.add("학생 1");
    	names.add("학생 2");
    	names.add("학생 1"); //학생 1 중복
    	
    	//삭제할 때 주의할점
    	//삭제 시 리스트 크기도 바뀌고, 원소들의 index도 바뀐다.
    	for(int i = 0; i < names.size(); i++) {
    		if(names.get(i).equals("학생 1"))
    			names.remove(i);
    	}
    	System.out.println(names);
    	
    	for(int i=names.size() -1; i>=0; i--) {
    		if(names.get(i).equals("학생 1"))
    			names.remove(i);
    	}
    	System.out.println(names);
    }
}
