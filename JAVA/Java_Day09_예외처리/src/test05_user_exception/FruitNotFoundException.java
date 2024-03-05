package test05_user_exception;

//Exception을 상속 받으면 ; Checked Exception
//Runtime Exception을 상속받으면 : unchecked exception
public class FruitNotFoundException extends Exception{

		//생성자
	public FruitNotFoundException(String name) {
		super(name +"에 해당하는 과일은 없습니다.");
		//문자열을 넣어서 => 에러 메세지
	}

}
