package day5.day5Prac.애너테이션;

public class Store {

	@Count(value = 5)
	private int apples;

	@Count(3) // value 라는 이름은 생략 가능
	private int bananas;

	@Count // default 로 사용
	private int tomatos;

	public Store() {
	}

	public Store(int apples, int bananas, int tomatos) {
		this.apples = apples;
		this.bananas = bananas;
		this.tomatos = tomatos;
	}

	@Override
	public String toString() {
		return "Store [apples=" + apples + ", bananas=" + bananas + ", tomatos=" + tomatos + "]";
	}

}
