package test02_set;

public class Person {
    String name;
    String id;
    
    public Person(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }

	@Override
	public int hashCode() {
//		return super.hashCode();  --> 원본 코드, super의 해시코드가 아니라
		return id.hashCode();		//id의 해시코드 리턴
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person other = (Person) obj;
			return id.equals(other.id);
		}
		return super.equals(obj);
	}
    
    //id가 일치하면 같은 사람이다
    
}
