package day3.day3Prac.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex03 {

	public static void main(String[] args) {

		ArrayList<Acorn> list = new ArrayList<>();

		list.add(new Acorn("고지연", 89));
		list.add(new Acorn("김민정", 97));
		list.add(new Acorn("이현겸", 99));
		list.add(new Acorn("박세인", 86));
		list.add(new Acorn("여도현", 88));

		// 1. 정렬하고 출력하기

		list.stream().sorted((o1, o2) -> o1.getScore() - o2.getScore()).forEach(item -> System.out.println(item));

		list.stream().sorted(new Comparator<Acorn>() {
			@Override
			public int compare(Acorn o1, Acorn o2) {
				return o2.getScore()- o1.getScore();
			}
		}).forEach(item -> System.out.println(item));
		
		// Comparator.comparing
		
		list
		.stream()
		.sorted(Comparator
				.<Acorn, Integer>comparing(
				(item) -> {return item.getScore();}
				)).forEach(item -> {System.out.println(item);});
		
		System.out.println("============");
		
		list
		.stream()
		.sorted(Comparator
				.<Acorn, String>comparing(
				item -> item.getName()
				)).forEach(item -> System.out.println(item));
		
	}

}
