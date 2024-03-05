package modifier06_singleton;

//싱글턴 패턴을 이용해 구현하라
//스코어 관리하는 객체
public class ScoreManager {
	//객체의 멤버 변수
	private int score;
	
	//2. 객체를 단 한 번만 생성해서 갖고있는다.
	private static ScoreManager instance = new ScoreManager();
	
	//1. 생성자를 private로 막아서, 외부에서 생성하지 못하도록 차단
	private ScoreManager() {
		
	}
	
	//3. 외부에서 접근할 수 있는 합법적 통로를열어준다.
	//4. static으로 만들어서 객체 생성 없이 접근 가능하도록 해야한다.
	public static ScoreManager getInstance() {
		return instance;
	}
	
    
}
