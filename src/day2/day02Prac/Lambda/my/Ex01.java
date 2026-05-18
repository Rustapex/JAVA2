package day2.day02Prac.Lambda.my;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * interface MySpeakable { void speak(); }
		 * 
		 */
	

//	1.
	class RunnableImp implements Runnable {

		@Override
		public void run() {
			System.out.println("룰루랄라");

		}
	}
	Runnable r1 = new RunnableImp();
	
	r1.run();
	
//	2. 익명
	Runnable r2 = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("익명 클래스");
		}
	};
	r2.run();
	
//	3. 람다식
	Runnable r3 = () -> {
		System.out.println("람다식");
	};
	r3.run();
	
	Runnable r4 = () -> System.out.println("람다 더 생략");
	r4.run();
	
	//	람다 생략 가능 한가?
	/*	람다식에서 매개변수가 한 개 있으면 괄호 생략 가능
	 *	수행할 코드가 한 줄이면 중괄호 블럭 생략
	 *	수행할 코드와 return 이 있는 경우 return 과 {} 블럭 생략 가능
	 */	
	
	
	}
}
