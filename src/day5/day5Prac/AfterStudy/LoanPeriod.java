package day5.day5Prac.AfterStudy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface LoanPeriod {
	
	int days(); // 대출 가능 일수

	int maxExtensions() default 1; // 최대 연장 가능 일수

	boolean rentable() default true; // 대출 가능 여부
}
