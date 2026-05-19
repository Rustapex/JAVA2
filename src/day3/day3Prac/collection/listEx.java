package day3.day3Prac.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listEx {

	public static void main(String[] args) {

		List<String> list = null;

//		list = new ArrayList<>();
		list = new LinkedList<String>();
		
		list.add("딸기");
		list.add("포도");
		list.add("복숭아");
		
		String r1 = list.get(0);
		String r2 = list.get(1);
		String r3 = list.get(2);
		
		list = new LinkedList<String>();
		list.add("딸기");
		list.add("포도");
		list.add("복숭아");
		
		r1 = list.get(0);
		r2 = list.get(1);
		r3 = list.get(2);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		
	}

}
