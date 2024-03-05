package test01_bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest3 {
	public static  void main(String[] args) {
		//ByteStream을 이용해서 이미지(파일) 입출력
		
		//Test1 파일이 코드가 복잡해서 자동 반환 구문으로
		
		
		try(FileInputStream fis=new FileInputStream("dog.jpg");
				FileOutputStream fos = new FileOutputStream("dog-copy.jpg");
				) {
			//	try() 안에 내가 사용할 변수 선언 & 생성
			//	; 로 끝나는 여러 문장 가능
				
			int b; //File로부터 읽어올 데이터를 임시저장할 변수
					//1바이트씩 저장, 더이상 읽을 값이 없으면 -1
			
			byte[] buffer = new byte[10];
			
			while((b=fis.read(buffer)) != -1) {//1바이트를 읽어와서 -1이 아니라면
				//b에 바이트를 하나 읽어왔음
				fos.write(buffer, 0, b);
				
			}	
			System.out.println("복사 끝");
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		
		
	}
}
