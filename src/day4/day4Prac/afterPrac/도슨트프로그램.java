package day4.day4Prac.afterPrac;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;


public class 도슨트프로그램 {

	Docent docent;

	public void setDocent(Docent docent) {
		this.docent = docent;
	}

	public void intro() {
		System.out.println("전시관에 오신걸 환영합니다~");
		System.err.println("화장실은 지하 1층에 있습니다");

		docent.introduce();
	}
	
	public void quest() {
		System.out.println("전시관에 오신걸 환영합니다~");
		System.err.println("질문 없으신가요?");

		docent.question();
	}
	
	public void all() {
		intro();
		quest();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
		
		

		Properties pp = new Properties();
		pp.load(new FileReader("4일차소스/영석이와의실습/config.txt"));
		
		String className1 = pp.getProperty("HDocent");

		Class clazz1 = Class.forName(className1);
		Docent docecnt1 = (Docent) clazz1.getDeclaredConstructor().newInstance();

		도슨트프로그램 d1 = new 도슨트프로그램();
		d1.setDocent(docecnt1);
		d1.intro();
			
		System.out.println("////////////////////////////////////");
		
		String className2 = pp.getProperty("MDocent");

		Class clazz2 = Class.forName(className2);
		Docent docecnt2 = (Docent) clazz2.getDeclaredConstructor().newInstance();

		도슨트프로그램 d2 = new 도슨트프로그램();
		d2.setDocent(docecnt1);
		d2.quest();
		
		System.out.println("////////////////////////////////////");
		
		String className3 = pp.getProperty("SDocent");

		Class clazz3 = Class.forName(className3);
		Docent docecnt3 = (Docent) clazz3.getDeclaredConstructor().newInstance();

		도슨트프로그램 d3 = new 도슨트프로그램();
		d3.setDocent(docecnt1);
		d3.all();

	}

}
