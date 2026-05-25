package day5.day5Prac.EnumEx;

public class Ex02 {

	public static void main(String[] args) {

		int day;

		// 요일 상수로 다루기
		day = DAY.MONDAY; // 가독성 올라감
		day = 21000; // 요일정보가 아닌 다른 값이 들어가는 것을 막을 수 없음
		
		// enum ( 일 ~ 토 정보 나타내기)
		DAYEnum day2  = null;
		day2 = DAYEnum.FRIDAY;	// 가독성 , 안전성
		
		for(DAYEnum d : DAYEnum.values()) {
			System.out.println(d);
			System.out.println(d.name());
			System.out.println(d.ordinal());
		}
	}
}
