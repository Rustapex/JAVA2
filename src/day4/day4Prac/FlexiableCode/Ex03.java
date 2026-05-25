package day4.day4Prac.FlexiableCode;

public class Ex03 {

	public static void main(String[] args) {

		// Dog 객체 => cat 객체 변경
		// 객체를 생성하기  메서드 사용하기

		Animal a1 = getAnimal();
		Animal a2 = getAnimal();

		a1.bark();
		a2.bark();
	}
	
	public static Animal getAnimal() {
//		return new Dog();
		return new Cat();
	}

}
