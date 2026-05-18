package day1prac.myarrays;

import java.util.Arrays;
import java.util.Comparator;

public class Acorn2Sort {

	public static void main(String[] args) {

		Acorn2 a1 = new Acorn2("T1", "장해든", 20);
		Acorn2 a2 = new Acorn2("T2", "박세인", 23);
		Acorn2 a3 = new Acorn2("T3", "김건희", 18);

		Acorn2[] list = { a1, a2, a3 };

		MyArrays.sort(list);

//		Acorn2 => Comparable 구현하였음
		System.out.println(Arrays.toString(list));
		

		Arrays.sort(list, new Comparator<Acorn2>() {

			@Override
			public int compare(Acorn2 o1, Acorn2 o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
		Arrays.sort(list, new A());
		
		System.out.println(Arrays.toString(list));

	}

}
