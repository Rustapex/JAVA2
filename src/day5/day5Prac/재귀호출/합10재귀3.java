package day5.day5Prac.재귀호출;

public class 합10재귀3 {
	
	public static void main(String[] args) {
		int result = getSumR(10);
		System.out.println(result);
	}
	
	// 재귀 함수
	// 탈출 조건을 명시하기
	public static int getSumR(int su) {
		if(su ==1) {
			return 1;
		}
		else {
			return su + getSumR(su-1);
		}
	}
	
	

}
