package day2.day02Prac.Lambda.my;


public class DiscountInterfaceImp implements DiscountInterface {

	
//	인터페이스를 구현하는 방법 3가지 ( 함수형 인터페이스 )
/*		1. 이름있는 클래스로 구현하기
*		2. 익명 클래스로 구현하기
*		3. 람다식으로 구현하기 (익명 클래스에서 추론이 가능한 모든 코드를 생략하고 사용하기)
*/
	
	// 1. 이름있는 클래스로 구현하기
	//기본 할인 (10%)
	@Override
	public double discount(int price) {
		// 할인율 10% 
		return price * 0.9;
	}
	
	public static void main(String[] args) {
		
		int price = 10000;
		
		
		DiscountInterfaceImp d1 = new DiscountInterfaceImp();
		
		double disPrice1 = d1.discount(price);
		System.out.printf("%d 가격에서 할인되어 %.1f 원입니다.%n", price, disPrice1);
		
//		1. 지역 내부 클래스
//		할인율 20% (추가할인)
		class A implements DiscountInterface{

			@Override
			public double discount(int price) {
				return price * 0.8;
			}
		}
		
		DiscountInterface d2 = new A();
		double disPrice2 = d2.discount(price);
		System.out.printf("%d 가격에서 할인되어 %.1f 원입니다.%n", price, disPrice2);
		
		
//		2. 익명 클래스로 구현하기
//		할인율 : 30%
		DiscountInterface d3 = new DiscountInterface() {
			
			@Override
			public double discount(int price) {
				return price * 0.7;
			}
		};
		double disPrice3 = d3.discount(price);
		System.out.printf("%d 가격에서 할인되어 %.1f 원입니다.%n", price, disPrice3);
		
		
//		3. 람다식( 매개변수) -> {};
//		할인율 40%
		DiscountInterface d4 = (x) -> {return x*0.6;};
		double disPrice4 = d4.discount(price);
		System.out.printf("%d 가격에서 할인되어 %.1f 원입니다.%n", price, disPrice4);
		
//		할인율 50%
		DiscountInterface d5 = (x) -> x*0.5;
		double disPrice5 = d5.discount(price);
		System.out.printf("%d 가격에서 할인되어 %.1f 원입니다.%n", price, disPrice5);
		
		
		
	}
		

}
