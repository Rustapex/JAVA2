package day5.day5Prac.DI;

public class Main {

	public static void main(String[] args) {

		HandPhone h = new HandPhone();
		
		// 배터리 주입
//		h.setBattery(new SMBattery());
		h.setBattery(new LGBattery());
		h.power();
	}

}
