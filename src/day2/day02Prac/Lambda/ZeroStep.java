package day2.day02Prac.Lambda;

import java.util.ArrayList;

public class ZeroStep {
	public static void main(String[] args) {

		ArrayList<String> foods = new ArrayList<String>();

		foods.add("케익");
		foods.add("커피");
		foods.add("스무디");
		foods.add("빙수");

//		foods 출력하기

//		get(index);
		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}

		// forEach
		for (String f1 : foods) {
			System.out.println(f1);
		}

		// 익명함수(람다식)
		// 반복을 내부적으로 수행 - 반복하면서 수행할 일 (수행할 코드 작성) => consumer 인터페이스 사용
		foods.forEach((item) -> {
			System.out.println(item);
		});
		foods.forEach(item -> System.out.println(item));
	}

}
