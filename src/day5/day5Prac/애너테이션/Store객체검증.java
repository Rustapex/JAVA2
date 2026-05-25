package day5.day5Prac.애너테이션;

import java.lang.reflect.Field;

public class Store객체검증 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		Store s = new Store(10, 3, 5);

		검증하기(s);
	}

	private static void 검증하기(Store s) throws IllegalArgumentException, IllegalAccessException {
		
		/* s 객체의 클래스 정보 얻어오기
		* 필드 정보 얻어오기		
		* 필드의 애너테이션 정보 얻어오기		
		* 실제 값과 애너테이션 값을 비교
		*/
		
		// s 객체의 클래스 정보 얻어오기
		Class<?> clazz = s.getClass();

		// 필드 정보 얻어오기
		Field[] fileds = clazz.getDeclaredFields();

		// 필드의 애너테이션 정보 얻어오기
		for (Field f : fileds) {

			Count annotation = f.getAnnotation(Count.class);
			
			if(annotation != null) {
				//private 접근자 필드도 접근할 수 있음
				f.setAccessible(true);
				int value = (int) f.get(s);
				System.out.println(value + "실제 값");
				
				// 필드에 붙어있는 애너테이션 값 얻어오기
				int countValue = annotation.value();
				
				// 두 값을 비교
				if(value != countValue) {
					 System.out.println("다르다");
//					throw new IllegalArgumentException(f.getName() + "항목은" + countValue + "와 같아야 한다 !!");
				} else {
					System.out.println("성공");
				}
			}
		}

		// 실제 값과 애너테이션 값을 비교
	}

}
