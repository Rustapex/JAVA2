package day3.day3Prac.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("딸기");
		set.add("포도");
		set.add("복숭아");
		set.add("복숭아"); // 중복 데이터는 Set에 한 번만 저장됨

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		Set<Moving> set2 = new HashSet<Moving>();

		set2.add(new Moving("장주원", "구룡포", 100));
		set2.add(new Moving("이미현", "경기", 80));
		set2.add(new Moving("김두식", "문산", 90));
		set2.add(new Moving("장주원", "봉평", 100)); // 해시코드도 같고 equals의 값도 true이므로 추가되지 않음
		set2.add(new Moving("장주원", "경기", 10));
		
		Iterator<Moving> it2 = set2.iterator();
		while(it2.hasNext()) {
			Moving m = it2.next();
			System.out.println(m);
		}
		
//		equals overriding
//		hashCode overriding
	}
}