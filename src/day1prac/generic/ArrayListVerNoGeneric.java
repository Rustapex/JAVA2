package day1prac.generic;

import java.util.ArrayList;

public class ArrayListVerNoGeneric {
	
	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		list.add(new Score( "홍길동", 99, 100));
		list.add(new Score( "김길동", 80, 40));
		list.add(new Score ("동길홍", 100, 10));
		list.add("hello");
		
		for(int i=0; i<list.size(); i++) {
			Object item = list.get(i);
			Score scoreItem = (Score) item;
			System.out.println(scoreItem.getName());
		}
		
		// 제네릭 클래스 
		// 컴파일 타임에 타입 체크 해줌.
		// 다운캐스팅을 해줌 => 불편함을 해소
		
		
	}

}
