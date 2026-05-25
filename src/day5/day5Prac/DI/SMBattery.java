package day5.day5Prac.DI;

public class SMBattery implements Battery{

	@Override
	public int getEnergy() {
		System.out.println("삼성 배터리");
		return 100;
	}
	

}
