package day1.오늘의요리사;

public class LHKCook extends Cook implements 일식가능한 {

	public LHKCook(String name) {
		super(name);
		System.out.println("자식 기본 생성자");
	}

	@Override
	public String toString() {
		return "LHKCook [name=" + name + "]";
	}

	@Override
	public String 초밥만들기() {
		// TODO Auto-generated method stub
		return "광어초밥 삭삭";
	}	
	
}
