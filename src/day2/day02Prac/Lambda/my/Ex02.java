package day2.day02Prac.Lambda.my;

public class Ex02 {
	
	/*
	 * @FunctionalInterface
		interface MyGreeting {
    		void greet();
		}
	 */
	public static void main(String[] args) {
		
//		인사하기
//		이름있는 클래스
		class RunnableImp2 implements Runnable{

			@Override
			public void run() {
				System.out.println("안녕하세요");
			}
		}
		RunnableImp2 r1 = new RunnableImp2();
		r1.run();
		
//		익명클래스
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("반갑습니다.");
				
			}
		};
		r2.run();
		
//		람다식
		Runnable r3 = () -> {
			System.out.println("좋은 하루 보내세요");
		};
		
		r3.run();
		
		Runnable r4 = () -> System.out.println("좋은 하루");
		r4.run();
	}

}
