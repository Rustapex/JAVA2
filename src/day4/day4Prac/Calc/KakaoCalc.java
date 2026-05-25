package day4.day4Prac.Calc;

public class KakaoCalc implements Calculator {
	
	@Override
	public int add(int su1, int su2) {
		System.out.println("kakao 계산기");
		return su1+su2;
	}

}
