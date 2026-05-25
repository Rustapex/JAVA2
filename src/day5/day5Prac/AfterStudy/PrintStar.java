package day5.day5Prac.AfterStudy;

import java.util.Scanner;

// 1.    별5개를 재귀매서드로 작성하시오  (별 한개씩을 출력해서 5개 출력하는 것)
public class PrintStar {
	
	public static void main(String[] args) {
		
		System.out.println("별을 출력할 수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int starCnt = Integer.parseInt(sc.nextLine());
		
		print(starCnt);
		
		
		
		
	}
	
	private static void print(int starCnt) {
		if(starCnt <=1 ) {
			System.out.print("*");
			return;
		} else {
			System.out.print("*");
			print(--starCnt);
		}
	}

}
