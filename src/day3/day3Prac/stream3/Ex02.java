package day3.day3Prac.stream3;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// Random 스트림 얻어오기
		
		IntStream is = new Random().ints(1,46); //start , end
		
		is.distinct()
		.limit(6)
		.sorted()
		.forEach(item -> System.out.println(item));
		
		// 더 생략한 형태
		/*
		is.distinct()
		.limit(6)
		.sorted()
		.forEach(System.out::println);
		*/
		
		IntStream is2 = new Random().ints(6,1,46); //size, start, end
		is2.sorted()
		.forEach(item -> System.out.println(item));		
		
		
	}

}
