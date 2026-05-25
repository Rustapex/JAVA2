package day5.day5Prac.EnumEx;


public class Ex01 {
	
	public static void main(String[] args) {
		
		// 상수
		// final String mode
		
		// 변수
		String mode = "DARK";
		mode = "abc";	// 지정된 값 이외의 값을 막을 수 없다.
		
		// enum 사용하기
		Mode enumMode = null;
		
		enumMode = Mode.DRARK;
		enumMode = Mode.LIGHT;
		
	}

}
