package day1prac.myarrays;

public class MyArraysEx {
	
	public static void main(String[] args) {
		
		Acorn a1 = new Acorn("T1", "장해든", 20);
		Acorn a2 = new Acorn("T2", "박세인", 23);
		Acorn a3 = new Acorn("T3", "김건희", 18);
		
		Acorn[] list = {a1,a2,a3};
		
		MyArrays.sort(list);
		
//		Exception in thread "main" java.lang.ClassCastException: class day1prac.myarrays.Acorn cannot be cast to class day1prac.myarrays.MyComparable (day1prac.myarrays.Acorn and day1prac.myarrays.MyComparable are in module java2prj of loader 'app')
//		at java2prj/day1prac.myarrays.MyArrays.sort(MyArrays.java:22)
//		at java2prj/day1prac.myarrays.MyArraysEx.main(MyArraysEx.java:13)

	}

}
