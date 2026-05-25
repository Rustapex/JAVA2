package day4.day4Prac.Calc;

public class DaisoCalc implements Calculator {
	
	@Override
	public int add(int su1, int su2) {
		System.out.println("다이소 계산기");
		return su1 + su2;
	}

}
