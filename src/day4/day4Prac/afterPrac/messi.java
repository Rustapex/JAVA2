package day4.day4Prac.afterPrac;

public class messi {

	String name;
	String team;
	int age;
	int footsize;

	public messi() {
		super();
	}

	public messi(String name, String team, int age, int footsize) {
		this.name = name;
		this.team = team;
		this.age = age;
		this.footsize = footsize;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getFootsize() {
		return footsize;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "messi [name=" + name + ", team=" + team + ", age=" + age + ", footsize=" + footsize + "]";
	}
	
	public void Champion() {
		System.out.println("신은 보고 싶다면 기도를 하지말고 spoTV를 틀 것");
	}
	
	
	

}
