package day1prac.generic;

public class GenericMethod {
	
//	generic은 반듷시 객체 타입이어야 한다.
	public static <T> void print(T item) {
		System.out.println(item);
	}
	
	public static void main(String[] args) {
		
//		명시적으로 드러내기, 드러내지 않기
		GenericMethod.<Integer>print(7);
		GenericMethod.print(6);
		
		
		GenericMethod.print("GOHOME");
		GenericMethod.print(57.8);
		
		GenericMethod.print(new Acorn("acorn1", "김건희"));
	}

}
