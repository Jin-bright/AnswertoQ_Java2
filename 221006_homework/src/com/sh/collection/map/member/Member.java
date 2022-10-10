package com.sh.collection.map.member;

public class Member {
	
	// 필드
	private String userId; // 유저 ID
	private String userPwd;// 유저 Password
	private String userName; // 유저 이름
	private int age; // 유저 나이
	private String phoneNumber; // 유저 폰번호
	
	//기본생성자
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자 
	public Member(String userId, String userPwd, String userName, int age, String phoneNumber) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}


	// getset 
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	// toString 오버라이딩 
	@Override
	public String toString() {
		return  userId +"    "+userPwd+"     "+userName+ "     " +age +"     " + phoneNumber;
					
	}
	
	
	
}

/*
1. 다음 회원 정보를 Map<String, Member>에 저장후, 출력하세요.

Member VO클래스
@com.sh.collection.map.member.Member.java
필드(변수) - private
- userId        : String        // 유저 ID
- userPwd        : String        // 유저 Password
- userName        : String        // 유저 이름
- age            : int            // 유저 나이
- phoneNumber    : String        // 유저 폰번호

+getter, +setter, +생성자

회원 Map은 필드로 지정하고, MemberTest 생성자에서 map에 요소 추가할 것.

@com.sh.collection.map.member.MemberTest.test1
map의 모든 member객체 정보 출력

==================================================
아이디    비밀번호    이름        나이    전화번호
--------------------------------------------------
honggd    1234        홍길동        35        01012341234
sinsa    1234        신사임당    50        01012341234
leess    1234        이순신        43        01012341234
yooon    1234        윤봉길        37        01012341234
jangbg    1234        장보고        29        01012341234
--------------------------------------------------


*/