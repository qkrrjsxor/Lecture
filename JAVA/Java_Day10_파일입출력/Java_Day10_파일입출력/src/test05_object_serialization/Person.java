package test05_object_serialization;

public class Person {

	String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
