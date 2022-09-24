package member.model.vo;

public class Silver {

	//필드
	private String name;
	private String grade;
	private int point;

	// 기본생성자
	public Silver() {
	}
	
	// 매개변수 있는 생성자 
	public Silver(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	// getter &setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//이자포인트 getter추가
	public double getInPoint() {
		return point*0.02;
	}
}

/*
Silver,Gold 멤버변수 : 이름 name,등급 grade ,포인트 point
Silver,Gold 멤버함수 : 컨스트럭터(생성자) , setter/getter(이자포인트 getter추가)
---> 실버 등급은 2% 를 곱한값이 이자 포인트
---> 골드 등급은 5% 를 곱한값이 이자 포인트
주의할점 : 적절한 접근제어 지시자 사용 (private,public)

*/