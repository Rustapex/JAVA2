package day4.day4Prac.afterPrac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import day4.reflect.Member;

public class 객세생성하기6 {
	
	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		//설정파일 읽어오기
		//설정파일 파싱하기 => 클래스정보 얻엉오기
		//클래스ㅈ정보로 객체 생성하기 
		
		
		
		String className="";
		BufferedReader  br =	new BufferedReader( new  FileReader("4일차소스/영석이와의실습/config.txt"));
		
		String line = br.readLine();
		System.out.println(line);
		
		String[] result =  line.split("=");
		className = result[1];
		
		
		System.out.println(className);
		
		
		Class clazz = Class.forName(className);
		Constructor c = clazz.getDeclaredConstructor();
		Member m = (Member)c.newInstance();
		m.printSquare(5);
		
	}

}
