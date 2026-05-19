package day3.day3Prac.collection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex01 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		Collection<String> col = list;
		
		list.add("딸기");
		list.add("포도");
		list.add("사과");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		
		Iterator<String> it2 = col.iterator();
		while(it2.hasNext()) {
			String item = it2.next();
			System.out.println(item);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
