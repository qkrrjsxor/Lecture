package test05_object_serialization;

import java.io.ObjectOutputStream;

public class StudentWriterTest {
	public static void main(String[] args) {
		
		Student s = new Student("김", "7반");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))){
			
		}
	}
}
