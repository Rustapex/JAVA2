package day4.day4Prac.reflect;

import java.lang.reflect.Method;

public class 메서드정보가져오기 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> clazz = Class.forName("day4.day4Prac.reflect.Member");
		
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
