package day4.day4Prac.afterPrac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Messimain {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String className = "";
		BufferedReader br = new BufferedReader(new FileReader("day4/day4Prac/afterPrac/config2.txt"));

		String line = br.readLine();
		System.out.println(line);

		String[] result = line.split("=");
		className = result[1];

		System.out.println(className);

		Class clazz = Class.forName(className);
		Constructor c = clazz.getDeclaredConstructor();
		messi m = (messi)c.newInstance();
		m.Champion();
	}

}
