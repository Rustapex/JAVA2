package day4.day4Prac.afterPrac;

public class ScienceDocent implements Docent {
	
	@Override
	public void introduce() {
		System.out.println("안녕하세요. 과학 전시관 도슨트입니다.");
		System.out.println("이번 전시는 빛, 전기, 우주, 생명과 같은 과학 원리를 쉽게 이해할 수 있도록 구성되어 있습니다.");
		System.out.println("과학 전시는 직접 관찰하고 체험하면서 원리를 이해하는 것이 중요합니다.");
	}

	@Override
	public void question() {
		System.out.println("질문: 과학 전시는 왜 체험 활동이 많은가요?");
		System.out.println("답변: 과학 원리는 직접 실험하고 관찰할 때 더 쉽게 이해할 수 있기 때문입니다.");
	}

}
