package day5.day5Prac.stackQ;

 
class Game  implements Comparable<Game>{
	String name;
	int price;
	
	public Game() {
	}
	public Game(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Game [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Game o) { // 오름차순
		return this.price - o.price;
	}
	
	
	 
}