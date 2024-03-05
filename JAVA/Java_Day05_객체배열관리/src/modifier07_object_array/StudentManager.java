package modifier07_object_array;

public class StudentManager {
	private Student[] students = new Student[100];
	private int size = 0;
		
	//학생들의 배열을 갖고 있는객체
	//학생들의 배열을 관리
	//싱글턴 패턴을 적용해 하나만 생성되도록 만들기
	private static StudentManager instance = new StudentManager();
	
	private StudentManager() {
		
	}
    
	public static StudentManager getInstance() {
		return instance;
	}
	
	public void addStudent(Student st) {
		students[size] = st;
		size++;
	}
	
	public Student getStudent(String name) {
		for(int i = 0; i < size; i++) {
			if(name.equals(students[i].getName())) {
				return students[i];
			}
		}
		return null;
	}
    
	public void changeMagor(String name, String major) {
		Student st = getStudent(name);
		if(st != null) {
			st.setMajor(major);;
		}
		else {
			System.out.println("학생을 찾을 수 없습니다.");
		}
	}
	
}
