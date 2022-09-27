package member.model.vo;

public class VVip extends Member {

	// 기본생성자
	public VVip() {
		super();
	}
	
	// 부모클래스 상속받은거 까지 
	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	//오버라이딩
	@Override
	public double getEjaPoint() {
		return this.getPoint() *0.15;		
	}

	@Override
	public String info() {
		return super.name + "		" + super.grade + "		" + super.point + "		" + getEjaPoint();
	}
	
}
