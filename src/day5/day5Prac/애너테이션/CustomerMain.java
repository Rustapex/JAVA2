package day5.day5Prac.애너테이션;

import java.lang.reflect.Field;


public class CustomerMain {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Customer c1 = new Customer("010-1234");
		Customer c2 = new Customer("010-1234-12341");

		검증하기(c1);
		검증하기(c2);

	}

	private static void 검증하기(Customer c)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<?> clazz = c.getClass();

//		Field[] fields = clazz.getDeclaredFields();
//		
//		for(Field field : fields) {
//			System.out.println(field);
//		}

		Field field = clazz.getDeclaredField("tel");

		// 필드의 실제 값
		String value = (String) field.get(c);

		// 애너테이션에 설정된 값 얻어오기
		System.out.println(value);

		MaxLen annotation = field.getAnnotation(MaxLen.class);

		if (annotation != null) {
			int 애너테이션값 = annotation.length();
			
			// 비교하기
			
			if(value.length() > 애너테이션값) {
				System.out.println(애너테이션값 + "이내여야 한다.");
			}

		}
	}

}
