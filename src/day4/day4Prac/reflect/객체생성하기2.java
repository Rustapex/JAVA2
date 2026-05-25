package day4.day4Prac.reflect;

public class 객체생성하기2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		// 1. 클래스 정보 얻어오기, 클래스 정보를 가지고 객체 생성하기

		// ? == ? extends Object
		Class<?> clazz = Member.class;
		
		Member m1 = (Member) clazz.newInstance();
		m1.printSquare(3);

	}

}
