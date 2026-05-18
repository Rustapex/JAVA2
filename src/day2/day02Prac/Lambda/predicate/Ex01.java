package day2.day02Prac.Lambda.predicate;

interface MyPredicate<T>{
	Boolean test(T t);
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 1. 이름 있는 클래스 / 지역 내부 클래스
		class A implements MyPredicate<String>{

			@Override
			public Boolean test(String t) {
				return t.startsWith("쌀");
			}
		}
		
		MyPredicate<String> p1 = new A();
		
		if(p1.test("쌀국수")) {
			System.out.println("쌀로 시작합니다.");
		} else {
			System.out.println("쌀로 시작하지 않습니다.");
		}
		
		
		// 2. 익명 클래스
		MyPredicate<String> p2 = new MyPredicate<String>() {
			@Override
			public Boolean test(String t) {
				return t.startsWith("쌀");
			}
		};
		
		if(p2.test("쌀피자")) {
			System.out.println("쌀로 시작합니다.");
		} else {
			System.out.println("쌀로 시작하지 않습니다.");
		}
		
		
		// 3. 람다식
		MyPredicate<String> p3 = (t) -> {
			return t.startsWith("쌀");
		};
		
		if(p3.test("밀국수")) {
			System.out.println("쌀로 시작합니다.");
		} else {
			System.out.println("쌀로 시작하지 않습니다.");
		}
		
		
		// 4. 람다식 생략형
		MyPredicate<String> p4 = t -> t.startsWith("쌀");
		
		if(p4.test("쌀떡볶이")) {
			System.out.println("쌀로 시작합니다.");
		} else {
			System.out.println("쌀로 시작하지 않습니다.");
		}
	}
}