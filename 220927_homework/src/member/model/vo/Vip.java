package member.model.vo;

public class Vip extends Member {

	// 기본생성자
	public Vip() {
		super();
	}
	
	// 부모클래스 상속받은거 까지 
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	//오버라이딩
	@Override
	public double getEjaPoint() {
		return this.getPoint() *0.1;		
	}

	@Override
	public String info() {
		return super.name + "		" + super.grade + "		" + super.point + "		" + getEjaPoint();
	}

}
