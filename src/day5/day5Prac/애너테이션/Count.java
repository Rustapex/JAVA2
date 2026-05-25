package day5.day5Prac.애너테이션;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 사용자 애터테이션 만들기
// 유지범위 : runtime=> 실행 시 까지 애터네이션 정보가 유지됨

@Retention(RetentionPolicy.RUNTIME)
public @interface Count {
	int value() default 1;	// 애너테이션객체.value()로 애너테이션에 설정된 값을 가져올 수 있다.
	

}
