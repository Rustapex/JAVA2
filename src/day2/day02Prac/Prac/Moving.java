package day2.day02Prac.Prac;

public class Moving {
	private String name;
    private String alias ;
    private int power;
    
	public Moving() {
	}

	public Moving(String name, String alias, int power) {
		this.name = name;
		this.alias = alias;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Moving [name=" + name + ", alias=" + alias + ", power=" + power + "]";
	}
	
	

}
