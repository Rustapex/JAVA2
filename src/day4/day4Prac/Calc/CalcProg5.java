package day4.day4Prac.Calc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;

public class CalcProg5 {

	Calculator calculator;

	// 계산기 외부에서 주입(Injection) => 느슨한 결합 / setter, constructor(parameter O) 사용

	

	public CalcProg5() {
	}


	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	

	public void run() {
		System.out.println("두 수를 입력:");
		Scanner sc = new Scanner(System.in);

		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		int result = calculator.add(su1, su2);
		System.out.println(result + "입니다.");
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Properties pp = new Properties();
		pp.load(new FileReader("src/day4/day4Prac/Calc/config.txt"));
		String className = pp.getProperty("calculator");
		
		Class clazz = Class.forName(className);
		Calculator cal = (Calculator) clazz.getDeclaredConstructor().newInstance();
		
		CalcProg5 p = new CalcProg5();
		p.setCalculator(cal);
		p.run();
		
		System.out.println("///////////////////////////////////");
		
		String className2 = pp.getProperty("calculator2");
		
		Class clazz2 = Class.forName(className2);
		Calculator cal2 = (Calculator) clazz2.getDeclaredConstructor().newInstance();
		
		CalcProg5 p2 = new CalcProg5();
		p2.setCalculator(cal2);
		p2.run();
		

	}

	

}
