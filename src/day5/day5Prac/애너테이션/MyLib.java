package day5.day5Prac.애너테이션;

public class MyLib {
	
	@BeforeAndAfter(before = "메서드 실행되기 전에 출력", after="메서드 실행 후 실행")
	public void printStar() {
		System.out.println("**********");
	}

}
