package day5.day5Prac.EnumEx;

public class GameCharator {
	
	String name;
	CharacterState state;
	
	public GameCharator(String name) {
		this.name = name;
	}
	public GameCharator(String name, CharacterState state) {
		this.name = name;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "GameCharator [name=" + name + ", state=" + state + "]";
	}
	
	
	// 공격하기
	public void 공격하기() {
		state = CharacterState.공격;
		System.out.println(name + state+" 로 전환");
	}
	
	public void 죽기() {
		state = CharacterState.죽음;
		System.out.println(name + state+" 로 전환");
	}

	public void 수비하기() {
		state = CharacterState.수비;
		System.out.println(name + state+" 로 전환");
	}
	public void 뭔지몰라() {
		state = CharacterState.죽음;
		System.out.println(name + state+" 로 전환");
	}
}
