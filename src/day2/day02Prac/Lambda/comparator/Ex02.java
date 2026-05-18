package day2.day02Prac.Lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import day2.day02Prac.Lambda.consumer.Acorn;

public class Ex02 {

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

	/*	Collections.sort(list, Comparator.<Acorn, String>comparing((item) -> {
			return item.getName();
		}));
	*/
		// 생략 후 () 생략, return return 뒤 ; 생략
		Collections.sort(list, Comparator.<Acorn, String>comparing((item) -> item.getName()));

		System.out.println("이름 순 정렬");
		list.forEach((item) -> {
			System.out.println(item);
		});
		
		Collections.sort(list, new Comparator<Acorn>() {
			@Override
			public int compare(Acorn o1, Acorn o2) {
				return o1.getPw().compareTo(o2.getPw());
			}
			
		});
		
		

	}

}
