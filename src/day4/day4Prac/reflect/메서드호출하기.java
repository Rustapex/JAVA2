package day4.day4Prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 메서드호출하기 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

		Class<?> clazz = Class.forName("day4.day4Prac.reflect.Member");
		Constructor c = clazz.getDeclaredConstructor();
		Member m = (Member) c.newInstance();
		
		// printInfor
		
		// printSquare
		
		Method method = (Method) clazz.getDeclaredMethod("printInfo");
		
		// 메서드 정보를 가진 객체
		
		// invoke 호출하다
		
		method.invoke(m);
	}

}
