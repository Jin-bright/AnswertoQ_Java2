package com.sh.collection.map.member;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.sun.jdi.Value;

public class MemberTest {
	// 회원 Map은 필드로 지정하고, MemberTest 생성자에서 map에 요소 추가할 것.
	Map<String,Member> membermap = new LinkedHashMap<>();	//Map
	Set<String> keySet = membermap.keySet(); // key(+value)를 찾기위한 keySet

	//기본생성자 + MemberTest 생성자에서 map에 요소 추가할 것
	public MemberTest() {
		super();
		
		membermap.put("honggd",new Member("honggd", "1234", "홍길동", 35, "01012341234"));
		membermap.put("sinsa",new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
		membermap.put("leess",new Member("leess", "1234", "이순신", 43, "01012341234"));
		membermap.put("yooon",new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
		membermap.put("jangbg",new Member("jangbg", "1234", "장보고", 2943, "01012341234"));

	}
	
	public static void main(String[] args) {
		MemberTest t = new MemberTest();
		// t.test1();
		// t.test2();		
		 t.test3();
		 t.test4();
	}
	
	private void test1() {
		
		System.out.println("==================================================\n"
				+ " 아이디     비밀번호     이름      나이    전화번호\n"
				+ "--------------------------------------------------");

		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String id=  it.next();
			Member value = membermap.get(id);					
			System.out.println( value ); 
		}
		System.out.println("--------------------------------------------------");		
		System.out.println();
	}
	
	private void test2() {
		 System.out.println("jangbg : " + isUserExist("jangbg") ); // - jangbg : true 리턴
		 System.out.println("sejong : " + isUserExist("sejong") ); // - sejong : false 리턴
		 System.out.println();
	}
	
	private boolean isUserExist(String userId) {
		if( keySet.contains( userId))	
			return true;
		else
			return false;
	}
	
	private void test3() {
	//	System.out.println(membermap.get( "yooon")); //원래 yooon 
		//값 변경 + 출력 
		membermap.put("yooon",new Member("yooon", "5678", "윤동주", 27, "01034563456")); //replace도 가능 
		System.out.println(membermap.get( "yooon"));
	/*	Member member = membermap.get("yooon");
		member.setUserPwd("5678");
		member.setUserName("윤동주");
		member.setAge(27);
		member.setPhoneNumber("01034563456");
		
		System.out.println(member);
	*/	
	}
	
	private void test4() {
		membermap.remove("sinsa"); //sinsa 삭제

		System.out.println("==================================================\n"
				+ " 아이디     비밀번호     이름      나이    전화번호\n"
				+ "--------------------------------------------------");
	
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String id=  it.next();
			Member value = membermap.get(id);
					
			System.out.println( value ); 
		}
		System.out.println("--------------------------------------------------");	
		
	}
	
}

/*
실습문제
실행클래스
@com.sh.collection.map.member.MemberTest

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

2. Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
@com.sh.collection.map.member.MemberTest.isUserExist(userId:String):boolean
@com.sh.collection.map.member.MemberTest.test2
다음 두 아이디를 테스트하세요.
- jangbg : true 리턴
- sejong : false 리턴

3. yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
@com.sh.collection.map.member.MemberTest.test3

- 비밀번호 : 5678
- 이름 : 윤동주
- 나이 : 27
- 전화번호 : 01034563456

4. sinsa 아이디 회원을 삭제하세요.
@com.sh.collection.map.member.MemberTest.test4
*/