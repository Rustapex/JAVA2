package day2.day02Prac.Lambda.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

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

		// forEach
		list.forEach(new Consumer<Acorn>() {

			@Override
			public void accept(Acorn t) {
				System.out.println(t.getName());
			}

		});

		list.forEach((t) -> {
			System.out.println(t.getName() + "&&");
		});

//		메서드 참조
		list.forEach((t) -> System.out.println(t.getPw() + "&생략&"));

	}
}
