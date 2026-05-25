package day5.day5Prac.애너테이션;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class 다이어트식품검증하기 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		List<Food> foodList  = new ArrayList<>();
		
		foodList.add( new Food("비빔밥" ,530));
		foodList.add( new Food("샐러드" ,270));
		foodList.add( new Food("어묵" ,180));
		foodList.add( new Food("돈까스" ,480));
		foodList.add( new Food("우동" , 180));
		
		List<Food> dietList = new ArrayList<>();
		
		for(Food f : foodList) {
			boolean result = 검증하기(f);
			if(result) {
				dietList.add(f);
			}
		}
		System.out.println("다이어트식품리스트");
		System.out.println(dietList);
		
	}

	private static boolean 검증하기(Food food) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		boolean result=false;
		
		Class clazz  =food.getClass();
		Field  field  = clazz.getDeclaredField("calroie");
		
		//필드의 값
		//애너테이션 설정값
		
		int value  =(int) field.get(food);		
		MAXCalorie   annotation  = field.getAnnotation(MAXCalorie.class);
		
		if(annotation != null ) {		
			//
			int 애너테이션설정값  = annotation.value();
			if( value   <  애너테이션설정값 ) {
				 result =true;
			}
		}
		
		return result;
	}

}


