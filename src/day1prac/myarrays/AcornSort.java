package day1prac.myarrays;

import java.util.Arrays;

public class AcornSort {
	
	public static void main(String[] args) {
		Acorn a1 = new Acorn("T1", "장해든", 20);
		Acorn a2 = new Acorn("T2", "박세인", 23);
		Acorn a3 = new Acorn("T3", "김건희", 18);
		
		Acorn[] list = {a1,a2,a3};
		
		
		Arrays.sort(list);
	}

}
