package day4.day4Prac.afterPrac;

public  class HistoryDocent implements Docent {

	@Override
	public void introduce() {
		System.out.println("안녕하세요. 역사 전시관 도슨트입니다.");
		System.out.println("이곳에서는 과거 사람들의 생활 모습과 중요한 역사적 사건을 살펴볼 수 있습니다.");
		System.out.println("전시된 유물들은 당시의 문화, 정치, 사회를 이해하는 데 중요한 자료입니다.");
	}

	@Override
	public void question() {
		System.out.println("질문: 이 유물은 왜 중요한가요?");
		System.out.println("답변: 이 유물은 당시 사람들의 생활 방식과 기술 수준을 보여주는 중요한 역사적 자료이기 때문입니다.");
	}

}
