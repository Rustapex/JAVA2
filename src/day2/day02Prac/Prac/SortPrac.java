package day2.day02Prac.Prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
######################

복습실습1  :  다음의 문제를 푸시오
Collections.sort (    List list  ,  Comparator c ) 를 사용하여 파워순으로 정렬하시오 <오름차순>
Moving클래스 만들기   캐릭터이름, 암호명, 파워값 저장할 수 있는 Moving클래스 작성하기

class Moving{
     String name;
     String alias ;
     int power;
}
 
 Comparator 구현시
 1.  인터페이스를 구현한 클래스 이용하기
 2 . 익명클래스를 작성하여 사용하기 
 
Moving("장주원", "구룡포" , 100);
Moving( "이미현"  , "경기" , 80)
Moving("김두식"  ," 문산" , 90);
Moving("전영석", "봉평" , 88); 
 
 
!! forEach사용하기 (오늘 같이)

ArrayList<String>에  무빙의 등장인물을 저장한 뒤 forEach를 이용해서 출력하기
장주원  
이미현 
김두식
전계도
프랭크
김봉석
장희수
이강훈
  
  1) 인터페이스를 구현한 클래스를 만들고 사용하기
  2) 익명클래스를 작성하여 사용하기

 */

public class SortPrac {

	public static void main(String[] args) {

		ArrayList<Moving> list = new ArrayList<Moving>();

		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평", 88));
		list.add(new Moving("프랭크", "미국요원", 95));
		list.add(new Moving("김봉석", "비행", 70));
		list.add(new Moving("장희수", "무한재생", 85));
		list.add(new Moving("이강훈", "괴력", 92));

		// power 순 정렬 전
		System.out.println("=== power 오름차순 정렬 하기 전 ===");
		list.forEach(item -> System.out.println(item.getPower()));

		Collections.sort(list, new Comparator<Moving>() {
			@Override
			public int compare(Moving o1, Moving o2) { // 오름차순
				return o1.getPower() - o2.getPower(); // 기준(o1)의 power 가 더 크면 양수, 아니면 음수
			}
		});
		
		System.out.println("=== power 오름차순 정렬 한 후 ===");
		list.forEach(item -> System.out.println(item.getPower()));
		
		
//		---------------------------------------------------------------------

		ArrayList<Moving> list2 = new ArrayList<Moving>();

		list2.add(new Moving("장주원", "구룡포", 100));
		list2.add(new Moving("이미현", "경기", 80));
		list2.add(new Moving("김두식", "문산", 90));
		list2.add(new Moving("전영석", "봉평", 88));
		list2.add(new Moving("프랭크", "미국요원", 95));
		list2.add(new Moving("김봉석", "비행", 70));
		list2.add(new Moving("장희수", "무한재생", 85));
		list2.add(new Moving("이강훈", "괴력", 92));
		
		
		// power 순 정렬 전
		System.out.println("=== power 오름차순 정렬 하기 전 ===");
		list2.forEach(item -> System.out.println(item.getPower()));
				
		class PowerAscComparator implements Comparator<Moving>{

			@Override
			public int compare(Moving o1, Moving o2) { // 오름차순
				return o1.getPower() - o2.getPower() ;
			}
		}
		
		
		Collections.sort(list2, new PowerAscComparator());
		
		// power 순 정렬 후
		System.out.println("=== power 오름차순 정렬 한 후 ===");
		list2.forEach(item -> System.out.println(item.getPower()));
		

	}

}
