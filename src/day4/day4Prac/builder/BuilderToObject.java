package day4.day4Prac.builder;

public class BuilderToObject {
	
	public static void main(String[] args) {
		Acorn a = Acorn.build()
		.id("acorn1")
		.name("지창욱")
		.address("서울시")
		.age(20)
		.build();
		
		System.out.println(a);
		
		Acorn b = Acorn.build()
		.id("acorn2")
		.name("이상이")
		.build();
		
		System.out.println(b);
	}

}
