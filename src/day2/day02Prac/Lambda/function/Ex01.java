package day2.day02Prac.Lambda.function;

public class Ex01 {
	
	/* @FunctionalInterface
	 * interface Function<T, R>{
	 * 		R 반환, 
	 * }
	 */
	
	interface MyFunction<T,R>{
		R apply (T t);
	}
	
	public static void main(String[] args) {
		
		// 2배 만들기
		class A implements MyFunction<Integer,Integer>{

			@Override
			public Integer apply(Integer t) {
				return 2*t;
			}
			
		}
		MyFunction<Integer, Integer> f1 = new A();
		int result = f1.apply(3000);
		System.out.println(result);
		
		//2. 익명 클래스
		
		MyFunction<Integer, Integer> f2 = new MyFunction<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
		};
		
		int result2 = f2.apply(5000);
		
		// 3번
		MyFunction<Integer, Integer> f3 = (t) -> {return t*2;};
		int result3 = f3.apply(6000);
		System.out.println(result3);
		
		MyFunction<Integer, Integer> f4 = t -> t*2;
		int result4 = f4.apply(8000);
		System.out.println(result4);
				
	}

}
