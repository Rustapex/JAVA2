package day5.day5Prac.애너테이션;

import java.lang.reflect.Field;

public class FoodMain {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Food food = new Food("스파게티",560);
		
		검증하기(food);
		
		Food food2 = new Food("곤약국수", 600);
		
		검증하기(food2);
	}
	
	private static void 검증하기(Food food) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Class clazz = food.getClass();
		Field field = clazz.getDeclaredField("calroie");
		
		// 
		
		int value = (int) field.get(food);
		
		System.out.println(value);
		
		MAXCalorie annotation = field.getAnnotation(MAXCalorie.class);
		
		if(annotation != null) {
			int annoValue = annotation.value();
			
			if(value > annoValue) {
				System.out.println("다이어트 식품 x");
			} else {
				System.out.println("다이어트 식품 O ");
			}
		}
		
	}

}
