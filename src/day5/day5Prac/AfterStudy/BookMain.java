package day5.day5Prac.AfterStudy;

import java.util.ArrayList;

public class BookMain {
	
	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
		
		books.add(new Book("코스모스"));
		books.add(new Book("블랙케이크",BookGenre.소설));
		books.add(new Book());
		books.add(new Book("왜의쓸모", BookGenre.자기계발));
		
		books.stream()
		.sorted((b1,b2) ->(b1.getTitle().compareTo(b2.getTitle())))
		.forEach(book -> System.out.println(book));
		
		
		
		
		
	}

}
