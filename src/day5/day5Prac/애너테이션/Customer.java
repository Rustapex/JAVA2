package day5.day5Prac.애너테이션;

public class Customer {

	@MaxLen(length = 12)
	String tel;


	public Customer(String tel) {
		this.tel = tel;
	}


	@Override
	public String toString() {
		return "Customer [tel=" + tel + "]";
	}

	

}
