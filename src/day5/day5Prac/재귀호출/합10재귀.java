package day5.day5Prac.재귀호출;

public class 합10재귀 {

	public static void main(String[] args) {

		int sum = getSum();
	}

	private static int getSum() {
		int sum = 0;
		
		//처리
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		
		// 출력
		System.out.println(sum);
		
		return sum;
	}

}
