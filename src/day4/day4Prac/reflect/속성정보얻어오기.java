package day4.day4Prac.reflect;

import java.lang.reflect.Field;

public class 속성정보얻어오기 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> clazz = Class.forName("day4.day4Prac.reflect.Member");
		Field[] fields =  clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field);
		}
	}

}
