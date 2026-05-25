package day4.day4Prac.reflect;

public class 객제생성하기4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> clazz = Class.forName("day4.day4Prac.reflect.Member");
		Member m = (Member) clazz.newInstance();
		
		m.printSquare(3);
		

	}

}
