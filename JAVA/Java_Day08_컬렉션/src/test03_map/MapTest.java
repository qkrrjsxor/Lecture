package test03_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Map
        //딕셔너리와 같은 자료구조
        //키&값의 쌍으로 저장
    	//key로 구별, 값은 중복 가능
    
    	Map<String, String> map = new HashMap<>();
    	
    	map.put("서울 5반", "현경찬");
    	map.put("서울 6반", "옥진석");
    	map.put("서울 7반", "육예진");
    	map.put("서울 8반", "서경덕");
    	
    	System.out.println(map);
        System.out.println(map.get("서울 7반"));
        
        map.put("서울 6반", "홍길동");
        System.out.println(map);
        
        System.out.println(map.containsKey("서울 7반"));
        System.out.println(map.containsValue("육예진"));
        
        System.out.println(map.keySet());		//key 값을 set로 반환
        
        for(Map.Entry<String, String> entry : map.entrySet()) {
        	System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
