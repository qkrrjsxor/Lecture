package test01_object;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) {
		//외부 라이브러리를 인식시키는 방법?
		//1. JRE system Library 폴더에 끼워넣어도 되지만 이렇게 하지 말기
		//2. 프로젝트 폴더 외부에 존재하는 jar 파일 인식시켜주기
		//	-프로젝트를 다른 곳으로 이사할 경우 인식이 안 될 수도 있음
		//3. 프로젝트 폴더 내부에 jar 파일을 복사 한 다음, 인식시키기
		//	- 1. jar 파일 프로젝트 내부에 복사
		//	- 프로젝트 우클릭 > Build Path > Configure Build Path
		//	- Library 탭에서 Add Jars. Classpath에다가
		
		//4. Maven 프로젝트로 바꾸고 pom.xml dependency 추가하기
		Gson gson = new Gson();
		
		Person p = new Person("Yang", 45);
		
		System.out.println(p);
		
		//자바 객체 -> JSON 문자열
		String str = gson.toJson(p);
		
		System.out.println(str);
	}
}
