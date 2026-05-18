package day1prac.라이브러리만들기;

public class MyLibMain {
	public static void main(String[] args) {
		
		MyLib lib = new MyLib();
		
		lib.printChar("a");
		lib.printStar();
		
		lib.codeRun(new CodeRunnableImp());
		lib.codeRun(new CodeRunnableImp(){
			
			@Override
			public void codeRun() {
				System.out.println("한화 이글스");
			};
		});
		
		lib.codeRun(new B());
		
	}

}
