package day4.day4Prac.FlexiableCode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Ex04 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {

		// Dog 객체 => cat 객체 변경
		// 객체를 생성하기  메서드 사용하기

		Animal a1 = getAnimal();
		Animal a2 = getAnimal();

		a1.bark();
		a2.bark();
	}
	
	public static Animal getAnimal() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Properties p = new Properties();
		p.load(new FileReader("src/day4/day4Prac/FlexiableCode/config.txt"));
		String name = p.getProperty("animal");
		
		Class clazz = Class.forName(name);
		Animal animal = (Animal) clazz.getDeclaredConstructor().newInstance();
		
//		return new Dog();
//		return new Cat();
		return animal;
	}

}
