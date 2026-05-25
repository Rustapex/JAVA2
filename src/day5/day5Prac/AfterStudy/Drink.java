package day5.day5Prac.AfterStudy;

public class Drink {
	
	String drinkName;	//음로명
	int sugarContent;	// 당 함량
	
	public Drink() {
		super();
	}

	public Drink(String drinkName, int sugarContent) {
		this.drinkName = drinkName;
		this.sugarContent = sugarContent;
	}

	
	@Override
	public String toString() {
		return "Drink [drinkName=" + drinkName + ", sugarContent=" + sugarContent + "]";
	}
	
}
