/*
Member멤버변수 : 이름,등급,포인트
member멤버함수 : 컨스트럭터(생성자) , setter/getter 만들기
**이자포인트를 구하는 메소드는 자식클래스에서의 구현을 강제화 할것**
> Silver 등급은 2% 를 곱한값이 이자 포인트
> Gold 등급은 5% 를 곱한값이 이자 포인트
> Vip 등급은 10% 를 곱한값이 이자 포인트
> VVip 등급은 15% 를 곱한값이 이자 포인트

 */
package member.model.vo;

public class Member {  // 추상화 클래스 
	
	public String name;
	public String grade;
	public int point;
	
	// proteced로 접근제한자를 변경한다면, 다른 패키지에서도 접근가능 

	//기본생성자
	public Member() {
		super();
	}

	// 이 클래스의 매개변수가 전부 있는 생성자 
	public Member(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	
	// get & set 메서드 
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
	
	
	// 여러 자식클래스에서 오버라이딩해서 쓸거 
	public double getEjaPoint() {
		return point;
		
	}

	
	
	public String info() {
		return name + "		" + grade + " 		" + point;
	}
}

/* 220927

@실습문제1 
1. Has a 포함 관계로 만들것
2. Entity  와 Control 클래스를 명확히 구분할것
entity 클래스 이름 : 
    member.model.vo.Silver,
    member.model.vo.Gold, 
    member.model.vo.Vip, 
    member.model.vo.VVip, 
    member.model.vo.Member(부모클래스)
control 클래스 이름 ; member.controller.MemberManager
Member멤버변수 : 이름,등급,포인트
member멤버함수 : 컨스트럭터(생성자) , setter/getter 만들기
**이자포인트를 구하는 메소드는 자식클래스에서의 구현을 강제화 할것**
> Silver 등급은 2% 를 곱한값이 이자 포인트
> Gold 등급은 5% 를 곱한값이 이자 포인트
> Vip 등급은 10% 를 곱한값이 이자 포인트
> VVip 등급은 15% 를 곱한값이 이자 포인트

Control 클래스 이름 : memer.controller.MemberManager
MemberManager 멤버변수 Member[] : Silver 등급, Gold 등급등 회원을 최대 40명 관리할수 있는  객체배열, 인덱스 추가
MemberManager 멤버함수 : insertMember(Member m), printData 

주의할점 : 적절한 접근제어 지시자 사용 (private,public)

실행클라스 member.run.Run

    public class Run {
        public static void main(String[] args)
        {
            MemberManager mgr = new MemberManager();
            mgr.insertMember(new Silver("홍길동", "Silver",1000));
            mgr.insertMember(new Silver("고길동", "Silver",2000));
            mgr.insertMember(new Silver("홍동민", "Silver",3000));
            mgr.insertMember(new Gold("김회장", "Gold",1000));
            mgr.insertMember(new Gold("이회장", "Gold",2000));
            mgr.insertMember(new Gold("오회장", "Gold",3000));
            mgr.insertMember(new Vip("이순신", "Vip",10000));
            mgr.insertMember(new VVip("신사임당", "VVip",100000));
            mgr.printData();
        }

    }

*/
