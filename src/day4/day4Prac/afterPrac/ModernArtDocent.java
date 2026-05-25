package day4.day4Prac.afterPrac;

public   class ModernArtDocent implements Docent{

	@Override
	public void introduce() {
	    System.out.println("안녕하세요. 현대미술 전시관 도슨트입니다.");
	    System.out.println("이번 전시는 색, 형태, 공간을 통해 작가의 생각을 표현한 작품들로 구성되어 있습니다.");
	    System.out.println("현대미술은 정답을 찾기보다는 작품을 보고 느낀 감정을 자유롭게 해석하는 것이 중요합니다.");
	}

	@Override
	public void question() {
	    System.out.println("질문: 이 작품은 왜 이렇게 단순하게 표현되었나요?");
	    System.out.println("답변: 현대미술에서는 복잡한 대상을 단순한 선과 색으로 표현하여 감정이나 메시지를 강조하기도 합니다.");
	}

	

}
