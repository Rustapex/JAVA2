package day3.day3Prac.stream3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<Acorn> list = new ArrayList<>();

		list.add(new Acorn("고지연", 89));
		list.add(new Acorn("김민정", 97));
		list.add(new Acorn("이현겸", 99));
		list.add(new Acorn("박세인", 86));
		list.add(new Acorn("여도현", 88));

		// 1. 80점 이상인 학생 출력하기
		list.stream().filter(item -> item.getScore() >= 80).forEach(item -> System.out.println(item));

		// 2. 80 이상인 인원 수 구하기

		long cnt = list.stream()
				.filter(item -> item.getScore() >= 80)
				.count();

		// 3. 80점 이상인 학생만 리스트로 만들기
		List<Acorn> list2 = list
				.stream()
				.filter(item -> item.getScore() >= 80)
				.toList();
		System.out.println(list2);

		// 4. Acorn 리스트에서 이름 리스트로 변환하기
		List<String> list3 = list
				.stream()
				.map(item -> item.getName())
				.toList();
		
		System.out.println(list3);
		
		// 5. 성적 순으로 정렬하고 출력하기
		
		System.out.println("============");
		list.stream()
		.sorted( (t1,t2) -> t1.getScore() - t2.getScore())
		.forEach(item -> System.out.println(item));
		
		list.stream()
		.sorted(Comparator.<Acorn, Integer>comparing(item -> item.getScore()))
		.forEach(item -> System.out.println(item));
		
		
		// 6. ArrayList<Acorn> -> Map<String, Acorn>
		Map<String, Acorn> map = 
				list
				.stream()
				.collect(Collectors.toMap(item -> item.getName(), item -> item));
		
		Acorn a = map.get("여도현");
		System.out.println(a);
		System.out.println(map);

	}

}
