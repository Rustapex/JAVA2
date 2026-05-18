package day1prac.generic;

import day1.generic클래스.printer.Main;

public class BoxGMain {
	
	public static void main(String[] args) {
		
		BoxG<Integer> box1 = new BoxG<Integer>();
		box1.add(7);
		box1.add(8);
		
//		꺼내기 
		int n1 = box1.get(0);
		int n2 = box1.get(1);
		int n3 = box1.get(2);
		
		BoxG<String> box2 = new BoxG();
		box2.add("커피");
		box2.add("운동화");
		box2.add("맛집");
		
	}

}
