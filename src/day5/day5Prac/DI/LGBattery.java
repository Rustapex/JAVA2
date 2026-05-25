package day5.day5Prac.DI;

public class LGBattery implements Battery{

	@Override
	public int getEnergy() {
		System.out.println("LG 배터리");
		return 200;
	}
	

}
