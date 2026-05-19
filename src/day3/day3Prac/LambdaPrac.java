package day3.day3Prac;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaPrac {

	public static void main(String[] args) {

//		1. 이름있는 클래스S
		class Hd implements Runnable {
			@Override
			public void run() {
				System.out.println("===== 장해든 사주 성격 풀이 =====");
				System.out.println("감성적이고 사람 매력이 있는 타입");
				System.out.println("표현력과 센스가 좋아 분위기를 잘 만드는 편");
				System.out.println("정이 많고 사람들과 감정 교류하는 것을 중요하게 생각함");
				System.out.println("겉은 쿨해 보여도 속은 여리고 섬세한 면이 있음");
				System.out.println("좋아하는 사람이나 일에는 진심으로 몰입하는 스타일");
				System.out.println("예술감각과 미적 감각이 살아있는 사주 느낌이 강함");
				System.out.println("사람들에게 편안함과 따뜻한 인상을 주기 쉬운 타입");
				System.out.println("앞으로 경험이 쌓일수록 자신의 매력과 능력이 더 크게 드러날 가능성이 큼");
			}

		}

		Runnable r1 = new Hd();
		r1.run();

		// 2. 익명 클래스

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("===== 손영석 사주 성격 풀이 =====");
				System.out.println("겉으로는 차분하고 무던해 보이지만 속은 책임감이 강한 타입");
				System.out.println("현실감각이 좋고 맡은 일은 꾸준히 해내려는 성향이 있음");
				System.out.println("감정표현은 조금 서툴 수 있지만 은근히 주변 사람을 챙김");
				System.out.println("한번 마음 연 사람에게는 오래 가는 스타일");
				System.out.println("생각보다 고집과 자기 기준이 뚜렷한 편");
				System.out.println("신뢰를 중요하게 생각하고 안정적인 삶을 추구함");
				System.out.println("사회생활을 할수록 점점 더 안정감 있고 단단해지는 타입");

				System.out.println();

			}
		};

		r2.run();

		// 3. 람다식

		Runnable r3 = () -> {
			System.out.println("람다식");
		};

		System.out.println("===== 애니 명대사 출력 =====");

		System.out.println("[ 주술회전 ]");
		System.out.println("이타도리 군, 뒷일을 부탁합니다.");
		System.out.println("살아남아라. 그리고 가능한 한 많은 사람들에게 둘러싸여 죽어라.");
		System.out.println("하지만 뭐, 어떻게든 되겠지.");

		System.out.println();

		System.out.println("[ 체인소 맨 ]");
		System.out.println("덴지, 평범한 삶을 살아.");
		System.out.println("네 꿈을 보여줘.");
		System.out.println("최고의 아침이다!");

		System.out.println();

		// 1. 이름있는 클래스
		class Ani1 implements Consumer<String> {

			@Override
			public void accept(String t) {
				System.out.println("[" + t + "]");
				System.out.println("이타도리 군, 뒷일을 부탁합니다.");
				System.out.println("살아남아라. 그리고 가능한 한 많은 사람들에게 둘러싸여 죽어라.");
				System.out.println("하지만 뭐, 어떻게든 되겠지.");

			}
		}
		Consumer<String> c1 = new Ani1();
		c1.accept("주술회전");

		Consumer<String> c2 = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("[" + t + "]");
				System.out.println("덴지, 평범한 삶을 살아.");
				System.out.println("네 꿈을 보여줘.");
				System.out.println("최고의 아침이다!");

			}
		};
		c2.accept("체인소맨");

		Consumer<String> c3 = (t) -> {
			System.out.println("[" + t + "]");
			System.out.println("제로부터 시작하는 이세계 생활.");
			System.out.println("스바루 군은 정말 대단하네요.");
			System.out.println("사랑하고 있습니다.");
		};

		c3.accept("Re:제로부터 시작하는 이세계 생활");

		// Supplier<T> : 매개변수 x, 반환 o
		// 익명 함수
		String[] lunch = { "마라탕", "로제 떡볶이", "돈까스", "제육볶음", "초밥" };
		Random r = new Random();
		Supplier<String> s1 = new Supplier<String>() {

			@Override
			public String get() {
				System.out.println("===== 오늘의 점심 메뉴 추천 =====");

				System.out.println("1. 마라탕");
				System.out.println("2. 로제 떡볶이");
				System.out.println("3. 돈까스");
				System.out.println("4. 제육볶음");
				System.out.println("5. 초밥");

				return lunch[r.nextInt(lunch.length)];
			}
		};

	}
}
