package day2.day02Prac.Lambda.consumer;

import java.util.function.Consumer;


/*
 * 
 * interface Consumer<T>{
 * 		void accept(T t)
 * }
 */

interface MyConsumer<T>{
	void accept(T t);
}

public class Ex01 {
	
	public static void main(String[] args) {
		// 1. 이름 있는 클래스
		class A implements MyConsumer<Integer>{

			@Override
			public void accept(Integer t) {
				System.out.println(t + "원 아이스티 샀어요.");
			}
			
		}
		
		MyConsumer c1 = new A();
		c1.accept(4000);
		
		// 2.  람다식
		MyConsumer<Integer> c2 = new MyConsumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t + "원 젤라또 샀음 익명");
				
			}
		};
		c2.accept(6000);
		
//		3. 람다식
		MyConsumer<Integer> c3 = (money) -> {System.out.println("젤라또 샀음 + 람다식");};
		c3.accept(8000);
		
		MyConsumer<Integer> c4 = money -> System.out.println("젤라또 샀음 람다식 생략");
		c4.accept(10000);
			
		
		Consumer<Integer> c5 = (t) ->{
			System.out.println("받은 돈" + t);
			System.out.println("지우개 500 소비 ");
			t -= 500;
			
			System.out.println("남은 돈 : " + t);
			};
		c5.accept(11000);
			
			
		
	}

}
