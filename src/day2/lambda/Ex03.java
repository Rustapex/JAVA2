package day2.lambda;

import java.util.function.Consumer;

public class Ex03 {
	
	public static void main(String[] args) {
		
		
		class C<T> implements Consumer<T>{

			@Override
			public void accept(T t) {
				System.out.println(" 당신이 입력한 것 : " + t);
			}
		}
		
		Consumer<Double> c1 = new C<>();
		Consumer<Integer> c2 = new C<>();
		
		c1.accept(45.5);
		c2.accept(80);
		
		Consumer<String> c3 = new Consumer<String>(){
			@Override
			public void accept(String t) {
				System.out.println("당신이 입력 한 것 : " + t);
			}
		};
		
		c3.accept("asf");
		
		
		
		
	}

}
