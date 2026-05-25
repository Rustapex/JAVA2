package day5.day5Prac.애너테이션;

public class Food {
	
	String name;
	
	@MAXCalorie(value=290)
	int calroie;

	
	
	public Food() {
	}

	public Food(String name, int calroie) {
		this.name = name;
		this.calroie = calroie;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", calroie=" + calroie + "]";
	}
	
}
