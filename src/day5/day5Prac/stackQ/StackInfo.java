package day5.day5Prac.stackQ;

import java.util.Stack;

public class StackInfo {
	
	public static void main(String[] args) {
		
		// stack : 데이터 저장 - push , 꺼내기 - pop (LI FO)
		
		Stack<String> list = new Stack<>();
		
		list.push("파란접시");
		list.push("빨간접시");
		list.push("초록접시");
		
		// 현재 위치의 데이터 보여주기
		String current = list.peek();
		System.out.println(current);
		
		// 데이터 하나씩 꺼내기 LIFO
		for(String dish : list) {
			System.out.println(dish);
		}
		
		System.out.println("//////////////////");
		// 데이터 하나씩 꺼내기 LIFO
		while(! list.isEmpty()) {
			System.out.println(list.pop()); 
		}
		
		
	}

}
