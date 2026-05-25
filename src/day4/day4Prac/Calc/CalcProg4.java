package day4.day4Prac.Calc;

import java.util.Scanner;

public class CalcProg4 {

	Calculator calculator;

	// 계산기 외부에서 주입(Injection) => 느슨한 결합 / setter, constructor(parameter O) 사용

	

	public CalcProg4() {
	}


	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	

	public void run() {
		System.out.println("두 수를 입력:");
		Scanner sc = new Scanner(System.in);

		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		int result = calculator.add(su1, su2);
		System.out.println(result + "입니다.");
		
	}

	public static void main(String[] args) {
		
		CalcProg4 p = new CalcProg4();
		p.setCalculator(new DaisoCalc());
		p.run();
		

	}

	

}
