package day5.day5Prac.AfterStudy;

public class Library {

	public static void main(String[] args) {
		checkBook(NovelBook.class);
		checkBook(Magazine.class);
	}

	private static void checkBook(Class<?> clazz) {
		System.out.println("도서 종류 " + clazz.getSimpleName());

		LoanPeriod loan = clazz.getAnnotation(LoanPeriod.class);

		if (loan != null) {
			System.out.println("대출 가능 일수 : " + loan.days() + "일");
			System.out.println("최대 연장 가능 일수 : " + loan.maxExtensions() + "일");
			System.out.println("대출 가능 여부 : " + loan.rentable());
		}
		System.out.println();
		
		LateFee fee = clazz.getAnnotation(LateFee.class);
		
		if(fee != null) {
			System.out.println("하루 연체료 : " + fee.feePerDay() + " 원");
			System.out.println("최대 연체료 : " + fee.maxFee() + " 원");
			System.out.println("주말 연체일에 포함여부 : " + fee.includeWeekend());
		}
		System.out.println();
		System.out.println("/////////////////////////////////");
	}

}
