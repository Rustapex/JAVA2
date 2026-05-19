package day3.day3Prac.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapEx {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("kakao", "kakaoPassword");
		map.put("naver", "naverPassword");
		map.put("google", "googlePassword");

		String pw1 = map.get("kakao");
		String pw2 = map.get("naver");
		String pw3 = map.get("google");

		System.out.println(pw1);

		// key만
		Set<String> keys = map.keySet();

		// set 출력하기 iterator 사용(반복자)
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("key :" + key);
		}
		
		// forEach
		keys.forEach((item) -> System.out.println(item));

		// value 만
		Collection<String> values = map.values();
//		values.forEach((item) -> {System.out.println(item);});
		
		values.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// key , value => Entry Set 로 다루기
		
		// entrySet key, value 세트로 가져옴
		for(Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("key : %s, value : %s%n", key,value);
		}
		
		System.out.println();
		System.out.println();
		// forEach
		
		map.forEach((key, value) -> {System.out.printf("key : %s, value : %s%n", key,value);});

	}

}
