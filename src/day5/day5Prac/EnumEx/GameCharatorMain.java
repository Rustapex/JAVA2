package day5.day5Prac.EnumEx;

public class GameCharatorMain {
	
	public static void main(String[] args) {
		GameCharator hero1 = new GameCharator("영웅");
		GameCharator hero2 = new GameCharator("전사");
		GameCharator hero3 = new GameCharator("법사");
		GameCharator hero4 = new GameCharator("힐러");
		GameCharator hero5 = new GameCharator("인파이터" , CharacterState.수비);
	
	
		System.out.println(hero1);
		System.out.println(hero2);
		System.out.println(hero3);
		System.out.println(hero4);
		System.out.println(hero5);
		
		// 캐릭터
		hero1.공격하기();
		hero2.수비하기();
		hero3.죽기();
		
		System.out.println(hero1);
		System.out.println(hero2);
		System.out.println(hero3);
		
	}
	
	
	

}
