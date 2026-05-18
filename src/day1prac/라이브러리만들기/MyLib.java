package day1prac.라이브러리만들기;

public class MyLib {
	
	// 별 세번 출력
	public void printStar() {
		String star= "";
		for(int i=0; i<3; i++) {
			star += "*";
		}
		
		System.out.println(star);
		System.out.println();
	}
	
	// 원하는 문자를 3번 출력
	public void printChar(String str) {
		String result= "";
		
		for(int i=0; i<3; i++) {
			result += str;
			result += " ";
		}
		System.out.println(result);
		System.out.println();
	}
	
	// 원하는 코드를 3번 실행
	public void repeatCode(Runnable r) {
		for(int i=0; i<3; i++) {
			r.run();
		}
	}
	
	//당신의 코드 => 인터페이스 사용 (약속 정하기) : 약속을 지키면서 당신의 코드를 작성하세요.
	
	public void codeRun(CodeRunnable r) {
		r.codeRun();
	}
}
