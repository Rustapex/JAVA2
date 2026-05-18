package day1prac.myarrays;

import java.util.Comparator;

public class A implements Comparator<Acorn2>{

	@Override
	public int compare(Acorn2 o1, Acorn2 o2) {
		return o1.name.compareTo(o2.name);
	}

}
