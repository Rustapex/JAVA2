package day5.day5Prac.AfterStudy;

public class Book {
	String title;
	BookGenre bookGenre;
	
	public Book() {
		this.title = "책제목";
		this.bookGenre = BookGenre.과학;
	}
	

	public Book(String title) {
		this.title = title;
		this.bookGenre = BookGenre.과학;
	}


	public Book(String title, BookGenre bookGenre) {
		this.title = title;
		this.bookGenre = bookGenre;
	}
	
	public String getTitle() {
		return title;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", bookGenre=" + bookGenre + "]";
	}

}
