package day2.day02Prac.supplier;


interface MySupplier<T> {
	T get();
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 1. 이름있는 클래스
		class A implements MySupplier<Integer>{

			@Override
			public Integer get() {
				return (int) (Math.random() * 100);
			}
			
		}
		MySupplier<Integer> s1 = new A();
		System.out.printf("s1 : %d%n", s1.get());
		
		// 2. 익명 클래스
		MySupplier<Integer> s2 = new MySupplier<>() {
			@Override
			public Integer get() {
				return 4;
			}
		};
		
		System.out.printf("s2 : %d%n", s2.get());
		
		// 3. () -> {}
		MySupplier<Integer> s3 = ()-> {return 3;};
		System.out.printf("s3 : %d%n", s3.get());
		
		
		MySupplier<Integer> s4 = ()-> 2;
		System.out.printf("s4 : %d%n", s4.get());
	}

}
