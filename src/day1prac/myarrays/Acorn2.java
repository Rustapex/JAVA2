package day1prac.myarrays;

public class Acorn2 implements Comparable<Acorn2> {
	
	String id;
	String name;
	int age;
	
	public Acorn2() {
	}
	
	public Acorn2(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Acorn2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//		if(o instanceof Acorn2) {
//			Acorn2 a = (Acorn2) o;
//			return this.age-a.age;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(Acorn2 o) {
		return this.age-o.age;
	}
	
	
	

}
