package member.model.vo;

public class Silver extends Member {

	
	// 기본생성자 
	public Silver() {
		super();
	}

	// 부모클래스 상속받은거 + 생성자
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
		
	}


	//오버라이딩
	@Override
	public double getEjaPoint() {
		return this.getPoint() *0.02;		
	}
	
	@Override
	public String info() {
		return super.name + "		" + super.grade + "		" + super.point + "		" + getEjaPoint();
	}

	

}

/*
Silver,Gold 멤버변수 : 이름 name,등급 grade ,포인트 point
Silver,Gold 멤버함수 : 컨스트럭터(생성자) , setter/getter(이자포인트 getter추가)
---> 실버 등급은 2% 를 곱한값이 이자 포인트
---> 골드 등급은 5% 를 곱한값이 이자 포인트
주의할점 : 적절한 접근제어 지시자 사용 (private,public)

*/