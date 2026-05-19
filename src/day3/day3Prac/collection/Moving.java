package day3.day3Prac.collection;
 
import java.util.Objects;

public class Moving  {
	String name;
	String code;
	int power;
	
	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}
	public Moving() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(  name) ;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moving other = (Moving) obj;
		return   Objects.equals(name, other.name) ;
	}
	
	 
	
	
	/*
	
	@Override
	public int hashCode() {
		return Objects.hash(code, name, power);
	}
	
	
	//이름만 같으면 같은 객체로 인식하겠다. 개발자가 정의함
	 @Override
	public boolean equals(Object obj) {
		boolean flag=false;
		Moving m = (Moving)obj;
		if( this.name.equals( m.name)) {
			flag=true;
		}
		return flag;
	}
*/
	
	
	
}
