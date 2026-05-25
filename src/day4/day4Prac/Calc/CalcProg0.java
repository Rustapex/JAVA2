package day4.day4Prac.Calc;

import java.util.Scanner;

public class CalcProg0 {
	
	public void run() {
		System.out.println("두 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		// 계산하기, 직접 계산하기
		
		int result = su1+ su2;
		System.out.println(result + "입니다.");
		
			
	}
	
	public static void main(String[] args) {
		CalcProg0 p = new CalcProg0();
		p.run();
		
	}

}
