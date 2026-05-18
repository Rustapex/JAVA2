package day2.day02Prac.Lambda;


public class AddInterfaceImp implements AddInterface {

//	public interface AddInterface {
//		int add(int x, int y);
//	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
//		인터페이스를 구현하는 방법 3가지 ( 함수형 인터페이스 )
/*		1. 이름있는 클래스로 구현하기
*		2. 익명 클래스로 구현하기
*		3. 람다식으로 구현하기 (익명 클래스에서 추론이 가능한 모든 코드를 생략하고 사용하기)
*/
		//지역 내부 클래스
		class A implements AddInterface{

			@Override
			public int add(int x, int y) {
				return x+y;
			}
		
		}
		
		AddInterface f1 = new A();
		int result = f1.add(5, 3);
		System.out.println(result);
		
//		2. 익명클래스로 구현하기
		
		// AddInterface f2 = new AddInterface(){}; // 익명 클래스구현, 생성한 클래스로 객체 생성하기 new
		
		AddInterface f2 = new AddInterface() {
			
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		
		int result2 = f2.add(3, 5);
		System.out.println(result2);
		
		
//		3. 람다식 (매개변수) -> {} ;
		
		AddInterface f3 = (x,y)-> {return x+y;};
		int result3 = f3.add(5, 11);
		System.out.println(result3);
		
		AddInterface f4 = (x,y)->  x+y;
		int result4 = f4.add(2, 30);
		System.out.println(result4);
	}

}
