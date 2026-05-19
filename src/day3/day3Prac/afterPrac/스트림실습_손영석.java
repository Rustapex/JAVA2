package day3.day3Prac.afterPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class 스트림실습_손영석 {

	/*
	 * ############################# 스트림 실습예제 #############################
	 * 
	 * 1. String 여러개 다루기 String[] , ArrayList : 스트림으로 다루기
	 * 
	 * 2. 난수 스트림을 만들고 짝수의 합 구하기
	 * 
	 * 
	 * 3. Customer 클래스 id, name, grade , point grade : vvip , vip ,bronze ArrayList
	 * 고객 10명정도 stream
	 * 
	 * 3-1. 고객등급이 vvip 사람이 몇명인지 3-2. 고객등급이 vip사람만 출력 3-3. 포인트가 높은 사람순으로 정렬해서 출력
	 */

	public static void main(String[] args) {
		
		// 1. String 여러 개 다루기 - 배열 선언
		String[] foods = {
		    "김밥",
		    "라면",
		    "떡볶이",
		    "순대",
		    "튀김"
		};
		
//		1-1 1) String[] foods 배열에  stream을 사용해서 "라"가 포함된 음식만 출력하시오.
		
		Arrays.stream(foods)
		.filter(item -> item.contains("라"))
		.forEach(item -> System.out.println(item));
		
//		1-1 2) String[] foods 배열에 , stream을 사용해서 메뉴이 2글자인 메뉴만 출력하시오.
		
		Arrays.stream(foods)
		.filter(item -> item.length() == 2)
		.forEach(item -> System.out.println(item));
		
		
		// 1. String 여러 개 다루기 - ArrayList 만들기
		ArrayList<String> subjects = new ArrayList<>();

		subjects.add("java");
		subjects.add("oracle");
		subjects.add("html");
		subjects.add("css");
		subjects.add("spring");
		
//		1-2 1) subjects에 저장된 과목명을 stream을 사용해서 오름차순으로 정렬하여 출력하시오.
		
		subjects.stream()
		.sorted((s1, s2) -> s1.compareTo(s2))
		.forEach(item -> System.out.println(item));
		
//		1-2 2) subjects에 저장된 과목명을 stream을 사용해서 모두 대문자로 변환하여 출력하시오.
		
		subjects.stream()
		.map(subj -> subj.toUpperCase())
		.forEach(subj -> System.out.println(subj));
		
//		2. 난수 스트림을 만들고 짝수의 합 구하기
		IntStream is = new Random().ints(10,1,46); // 1~45 까지 난수를 10개 만든다.
		
		int sumResult = is.filter(num -> num%2 ==0).sum();
		
		System.out.println("합은 : " + sumResult);
		

		// 3. Customer ArrayList 만들기
		ArrayList<Customer> customers = new ArrayList<>();

		customers.add(new Customer("c001", "김민수", "vvip", 9500));
		customers.add(new Customer("c002", "이서연", "vip", 7200));
		customers.add(new Customer("c003", "박지훈", "bronze", 2500));
		customers.add(new Customer("c004", "최유진", "vip", 6800));
		customers.add(new Customer("c005", "정현우", "vvip", 12000));
		customers.add(new Customer("c006", "강하늘", "bronze", 1800));
		customers.add(new Customer("c007", "조민지", "vip", 8100));
		customers.add(new Customer("c008", "윤도현", "vvip", 10500));
		customers.add(new Customer("c009", "한지민", "bronze", 3200));
		customers.add(new Customer("c010", "오세훈", "vip", 7600));
		
//		3-1. 고객등급이 vvip 사람이 몇명인지 
		long count = customers.stream()
		.filter(cust -> cust.getGrade().equals("vvip"))
		.count();
		
		System.out.println("vvip인 사람은 : "+ count);
		
		
//		3-2. 고객등급이 vip사람만 출력 
		customers.stream()
		.filter(cust -> cust.getGrade().equals("vip"))
		.forEach(cust -> System.out.println(cust));
		
		
//		3-3. 포인트가 높은 사람순으로 정렬해서 출력
		customers.stream()
		.sorted((c1, c2) -> c2.getPoint()-c1.getPoint())
		.forEach(cust -> System.out.println(cust));
		
	}

}
