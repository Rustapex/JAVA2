package day3.day3Prac.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] arr = {10,15,20,35,12};
		
		// 1. 합계 구하기
		
		IntStream is = Arrays.stream(arr);
		int result = is.sum();
		System.out.println(result);
		
		
		// 2. 짝수의 합계 구하기
		
		// 스트림 얻어오기
		is = Arrays.stream(arr);
		
		int sumResult = is
				.filter(item -> item%2 ==0)
				.sum();
		
		System.out.println(sumResult);
		
		
		// 3. 짝수의 개수 구하기
		is = Arrays.stream(arr);
		long countResult = is.count();
		System.out.println(countResult);
		
		// 4. 짝수 개수 구하기
		is = Arrays.stream(arr);
		
		// Yes Stream
		
		long evnetResult = is
				.filter(item -> item %2 ==0)
				.count();
		System.out.println(evnetResult);
		
		// No Stream 
		
		int eventCount =0;
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			if(num %2== 0) {
				eventCount++;
			}
		}
		System.out.println(eventCount);
		
		
		// 5. 통계 구하기 => 기본형 스트림에만 제공됨
		is = Arrays.stream(arr);
		IntSummaryStatistics summaray = is.summaryStatistics();
		System.out.println(summaray);
		
	}
}
