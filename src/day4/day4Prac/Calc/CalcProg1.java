package day4.day4Prac.Calc;

import java.util.Scanner;

public class CalcProg1 {
	
	// 의존성 (Dependency)
	LGCalc calculator = new LGCalc(); // lg 계산기
	SamCalc calculator2 = new SamCalc();

	public void run() {
		System.out.println("두 수를 계산해드림");
		Scanner sc = new Scanner(System.in);
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		// 계산
		System.out.println(calculator.addLG(su1, su2));
	}
	
	public static void main(String[] args) {
		CalcProg1 p = new CalcProg1();
		p.run();
	}

}
