package member.model.vo;


public class Gold extends Member {

	// 기본생성자 
	public Gold() {
		super();
	
	}

	// 부모클래스의 필드들 포함한 생성자 
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	
		
	}
	
	//
	@Override
	public double getEjaPoint() {
		return this.getPoint() *0.05;		
	}
	
	@Override
	public String info() {
		return super.name + "		" + super.grade + "		" + super.point + "		" + getEjaPoint();
	}

}

/*
@실습문제 - 포인트관리시스템의 entity클라스의 상속관계만들기
회원등급을 추상화하여 Member클래스를 작성해 중복을 제거하세요.

* getEjaPoint메소드는 부모클래스에 정의한후, 각 회원별로 오버라이딩 할것
* main메소드 변경없음.


*/
