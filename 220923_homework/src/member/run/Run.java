package member.run;

import member.controller.MemberManager;
import member.model.vo.*;

public class Run {
	
		public static void main(String[] args){
	
			MemberManager m = new MemberManager();
			
			m.silverInsert(new Silver("홍길동", "Silver", 1000));			
			m.silverInsert(new Silver("김말똥", "Silver", 2000));
			m.silverInsert(new Silver("고길동", "Silver", 3000));
			m.goldInsert(new Gold("김회장", "Gold",1000));
			m.goldInsert(new Gold("이회장", "Gold",2000));
			m.goldInsert(new Gold("오회장", "Gold",3000));	
			m.vipInsert(new Vip("이부자", "Vip",10000));
			m.vvipInsert(new VVip("김갑부", "VVip",100000));
			m.printData();
			
		}

}

/*
@실습문제2 - 회원등급추가

회원관리에 vip, vvip등급을 추가.
---> vip 등급은 10% 를 곱한값이 이자 포인트
---> vvip 등급은 15% 를 곱한값이 이자 포인트

실행클라스 : member.run.Run.main메소드에 추가

	//vip추가
	m.vipInsert(new Vip("이부자", "Vip",10000));
	//vvip추가
	m.vvipInsert(new VVip("김갑부", "VVip",100000));

*/
