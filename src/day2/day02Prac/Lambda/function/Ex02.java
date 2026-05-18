package day2.day02Prac.Lambda.function;

import java.util.Arrays;
import java.util.function.Function;

public class Ex02 {

	public static void main(String[] args) {
		
		// 1. 익명 클래스
		Function<Integer, String[]> f1 = new Function<>() {

			@Override
			public String[] apply(Integer t) {
				
				String[] result = new String[t];
				
				for(int i = 0; i < result.length; i++) {
					result[i] = "화이팅" + (i + 1);
				}
				
				return result;
			}
		};
		
		String[] r = f1.apply(3);
		System.out.println(Arrays.toString(r));
		
		
		// 2. 람다식
		Function<Integer, String[]> f2 = (num) -> {
			
			String[] result = new String[num];
			
			for(int i = 0; i < result.length; i++) {
				result[i] = "화이팅" + (i + 1);
			}
			
			return result;
		};
		
		String[] r2 = f2.apply(5);
		System.out.println(Arrays.toString(r2));
		
		
		// 3. 람다식 더 간단한 예시
		Function<String, String> f3 = name -> name + "님 화이팅!";
		
		String r3 = f3.apply("홍길동");
		System.out.println(r3);
	}
}