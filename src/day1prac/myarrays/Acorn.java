package day1prac.myarrays;

// 클래스 정의하기 (사용자 정의 자료형처럼 인식) 객체를 만들기 위한 틀

public class Acorn implements MyComparable{
	private String id;
	private String name;
	private int age;
	
	public Acorn() {
	}

	public Acorn(String id, String name, int age) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object other) {
		Acorn a;
		if(other instanceof Acorn) {
			a= (Acorn) other;
		} else {
			a = new Acorn();
		}
		
		
		return this.age - a.age;
	}
	
	
}
