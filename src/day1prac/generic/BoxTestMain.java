package day1prac.generic;

public class BoxTestMain {

	public static void main(String[] args) {
		
		BoxInt b1 = new BoxInt();
		b1.add(7);
		b1.add(8);
		b1.add(15);
		
		int num1 = b1.get(0);
		int num2 = b1.get(1);
		int num3 = b1.get(2);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		BoxString b2 = new BoxString();
		
		b2.add("i");
		b2.add("seoul");
		b2.add("you");
		
		String s1 = b2.get(0);
		String s2 = b2.get(1);
		String s3 = b2.get(2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
