package day5.day5Prac.AfterStudy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface LateFee {
	
	int feePerDay(); // 하루 연체료

	int maxFee() default 10000; // 최대 연체료

	boolean includeWeekend() default true; // 주말 연체일에 포함여부

}
