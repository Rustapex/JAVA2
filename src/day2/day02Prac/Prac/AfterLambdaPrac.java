package day2.day02Prac.Prac;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AfterLambdaPrac {

	public static void main(String[] args) {

//		1. Runnable  :      버킷리스트 출력하기  

//		1. 인터페이스 구현 클래스
		class RunnableImp implements Runnable {
			@Override
			public void run() {
				System.out.println("번지 점프 하기!");
			}
		}
		Runnable r1 = new RunnableImp();
		r1.run();

//		2. 익명 클래스
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("1년동안 국외 여행");
			}
		};

		r2.run();
//		3. 람다식
		Runnable r3 = () -> System.out.println("F1 경기 보기");
		r3.run();

//		2. Consumer<T>	: void accept( T t)  :   장보기 

//		1. 인터페이스 구현 클래스
		class ConsumerImp implements Consumer<Integer> {
			@Override
			public void accept(Integer t) {
				System.out.println("입력 금액 : " + t + " 만원");

				int kimchi = 8000;
				System.out.println("김치 : " + kimchi + "원");
				t -= kimchi;
				System.out.println("남은 금액 : " + t);

			}
		}

		Consumer<Integer> c1 = new ConsumerImp();
		c1.accept(30000);

//		2. 익명 클래스

		Consumer<Integer> c2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("익명 클래스");
				System.out.println("입력 금액 : " + t + " 만원");

				int kimchi = 9000;
				System.out.println("김치 : " + kimchi + "원");
				t -= kimchi;
				System.out.println("남은 금액 : " + t);
			}
		};

//		3. 람다식
		Consumer<Integer> c3 = (t) -> {
			System.out.println("익명 클래스");
			System.out.println("입력 금액 : " + t + " 만원");

			int kimchi = 10000;
			System.out.println("김치 : " + kimchi + "원");
			t -= kimchi;
			System.out.println("남은 금액 : " + t);
		};
		c3.accept(40000);

//		3. Supplier :    요리만들기   (레시피 정보 출력하고  반환값은  요리명을 반환해 주세요 !)

//		1. 인터페이스 구현 클래스

		class CookingSupplier implements Supplier<String> {

			@Override
			public String get() {
				System.out.println("=== 김치볶음밥 레시피 ===");
				System.out.println("1. 김치, 밥, 대파, 계란을 준비합니다.");
				System.out.println("2. 팬에 재료를 볶은 뒤 밥을 넣고 함께 볶습니다.");
				return "김치볶음밥";
			}
		}

		Supplier<String> s1 = new CookingSupplier();
		String dishName1 = s1.get();
		System.out.println(dishName1);

//		2. 익명 클래스

		Supplier<String> s2 = new Supplier<String>() {
			@Override
			public String get() {
				System.out.println("=== 된장찌개 레시피 ===");
				System.out.println("1. 된장, 두부, 애호박, 양파, 대파를 준비합니다.");
				System.out.println("2. 물에 된장을 풀고 재료를 넣어 끓입니다.");
				return "된장찌개";
			}
		};
		String dishName2 = s2.get();
		System.out.println(dishName2);

//		3. 람다식

		Supplier<String> s3 = () -> {
			System.out.println("=== 계란말이 레시피 ===");
			System.out.println("1. 계란, 소금, 대파, 당근을 준비합니다.");
			System.out.println("2. 풀어놓은 계란물을 팬에 조금씩 부어가며 말아줍니다.");
			return "계란말이";
		};
		String dishName3 = s3.get();
		System.out.println(dishName3);

//		4. Predicate  :      입력으로 받은 요리가 내가만든요리인 경우 true, false반환하기 

//		1. 인터페이스 구현 클래스
		class IsMyDish implements Predicate<String> {

			@Override
			public boolean test(String dishName) {
				return dishName.equals("김치볶음밥");
			}
		}

		Predicate<String> p1 = new IsMyDish();
		System.out.println("김치볶음밥은 내가 만든 요리인가? " + p1.test("김치볶음밥"));
		System.out.println("라면은 내가 만든 요리인가? " + p1.test("라면"));

//		2. 익명 클래스
		Predicate<String> p2 = new Predicate<String>() {

			@Override
			public boolean test(String dishName) {
				return dishName.equals("된장찌개");
			}
		};

		System.out.println("된장찌개는 내가 만든 요리인가? " + p2.test("된장찌개"));
		System.out.println("김밥은 내가 만든 요리인가? " + p2.test("김밥"));

//		3. 람다식
		Predicate<String> p3 = (dishName) -> {
			return dishName.equals("계란말이");
		};

		System.out.println("계란말이는 내가 만든 요리인가? " + p3.test("계란말이"));
		System.out.println("돈까스는 내가 만든 요리인가? " + p3.test("돈까스"));

//		5. Function  :       입력하나 반환있는 함수 만들기  ( 2개 이상만 작성하기)

//		1. 인터페이스 구현 클래스
		class SquareFunction implements Function<Integer, Integer> {

			@Override
			public Integer apply(Integer number) {
				return number * number;
			}
		}

		Function<Integer, Integer> f1 = new SquareFunction();
		System.out.println("5의 제곱 : " + f1.apply(5));

//		2. 익명 클래스
		Function<Integer, Integer> f2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer bound) {
				return (int) (Math.random() * bound) + 1;
			}
		};

		System.out.println("1부터 10까지 난수 : " + f2.apply(10));

//		3. 람다식
		Function<Integer, String> f3 = (amount) -> {
			int fiftyThousand = amount / 50000;
			amount %= 50000;

			int tenThousand = amount / 10000;
			amount %= 10000;

			int fiveThousand = amount / 5000;
			amount %= 5000;

			int oneThousand = amount / 1000;
			amount %= 1000;

			return "5만원권: " + fiftyThousand + "장, " + "1만원권: " + tenThousand + "장, " + "5천원권: " + fiveThousand + "장, "
					+ "1천원권: " + oneThousand + "장, " + "남은 금액: " + amount + "원";
		};

		System.out.println(f3.apply(78600));

	}

}
