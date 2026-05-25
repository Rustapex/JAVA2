package day5.day5Prac.애너테이션;


public class 사원 {
	
	@MaxLen(length = 3)
	String name;
	
	@WeekDaysAvail({"Monday", "Sunday", "Friday"})
	String 쉬는요일;

	public 사원(String name, String 쉬는요일) {
		this.name = name;
		this.쉬는요일 = 쉬는요일;
	}

	@Override
	public String toString() {
		return "사원 [name=" + name + ", 쉬는요일=" + 쉬는요일 + "]";
	}
	
	

}
