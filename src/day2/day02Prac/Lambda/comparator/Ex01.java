package day2.day02Prac.Lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

import day2.day02Prac.Lambda.consumer.Acorn;

public class Ex01 {
	public static void main(String[] args) {
		
		ArrayList<Acorn> list = new ArrayList<Acorn>();

		list.add(new Acorn("acorn1", "0000", "나해수"));
		list.add(new Acorn("acorn2", "1234", "손영석"));
		list.add(new Acorn("acorn3", "3456", "송주창"));
		list.add(new Acorn("acorn4", "1234", "김민경"));
		list.add(new Acorn("acorn5", "5678", "김민정"));
		list.add(new Acorn("acorn6", "1090", "박세인"));
		list.add(new Acorn("acorn7", "0000", "여도현"));
		list.add(new Acorn("acorn8", "0000", "이용찬"));
		list.add(new Acorn("acorn9", "1234", "이현겸"));
		
		// 출력하기
		list.forEach(new Consumer<Acorn>() {

			@Override
			public void accept(Acorn t) {
				System.out.println(t.getName());
			}
			
		});
		
		list.forEach((item) -> {System.out.println(item.getName());});
		
		list.forEach(item -> System.out.println(item.getName()));
		
		// 정렬하기
		// Arrays
		// Collections
		System.out.println("==========정렬 전 ========");
		list.forEach(item -> System.out.println(item.getName()));
		System.out.println();
		System.out.println();
		
		Collections.sort(list, new Comparator<Acorn>() {
			@Override
			public int compare(Acorn o1, Acorn o2) { 		// 오름차순 
				return o1.getName().compareTo(o2.getName()); 	// 기준이 크면 양수, 기준이 작으면 음수
			}
		});
		
//		
		System.out.println("==========정렬 후 ========");
		list.forEach(item -> System.out.println(item.getName()));
		
		Collections.sort(list, (o1, o2)->{ // 오름차순 
			return o1.getPw().compareTo(o2.getPw()); 	// 기준이 크면 양수, 기준이 작으면 음수
			
		});
		
		System.out.println("========== 비밀번호 정렬 후 ========");
		list.forEach(item -> System.out.println(item.getPw()));
		
		Collections.sort(list,  (o1,o2) -> o1.getPw().compareTo(o2.getPw())		);
		
//		Coparator.comparing 사용하기
		
		
		

	}

}
