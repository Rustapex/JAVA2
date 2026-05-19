package day3.day3Prac.stream;

import java.util.ArrayList;

public class ZeroStepStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("hello");
		list.add("bye");
		list.add("hello");
		list.add("hi");
		
		list.stream().filter(
				(item)->{return item.equals("hello");}
				).forEach(
						(item)->{System.out.println(item);
						});
		
		list.stream().filter(
				item->item.equals("hello")
				).forEach(item->System.out.println(item));
		
		// 2. "hi" 같은 문자열의 개수 구하기
		long cnt = list.stream().filter(
				item -> item.equals("hi")
				).count();
		
		System.out.println(cnt);
		
		// 2. "hi" 같은 문자열의 개수 구하기 => stream 을 사용하지 않고 구하기
		
		int count =0;
		for(String str : list) {
			if(str.equals("hi")) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
