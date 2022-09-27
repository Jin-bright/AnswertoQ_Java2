package member.controller;

import member.model.vo.*;

public class MemberManager {

	public Member[] member = new Member[40];
	
	private int index  = 0;
//	private int index_gold=0;
//	private int index_vip=0;
//	private int index_vvip=0;
	
	public void insertMember(Member m) { 
		if( m instanceof Silver) {
			member[index++] = (Silver)m;				
		}
		else if( m instanceof Gold) {
			member[index++] = (Gold)m;				
		}
		else if( m instanceof Vip) {
			member[index++] = (Vip)m;	
		}
		else
			member[index++] = (VVip)m;	
	}
	/*
	 *  Member 변수 m => new Silver("홍길동", "Silver",1000) 이걸 s,g,,바꾸고
	 *  각각넣기 index 하나로도 되는데 ..? 
	 */
	

	public void printData() {
		System.out.println("------------------------<<회원정보>>------------------------\n"
	        	 + "이름              등급            포인트            이자포인트  \n"
		         + "----------------------------------------------------------");

		

		for(int i=0; i<member.length; i++) {
			if( member[i] instanceof Silver) {
				System.out.println( ((Silver)(member[i])).info() ); 
			}	
			else if(member[i] instanceof Gold) {
				System.out.println( ((Gold)member[i]).info());
			}
			else if(member[i] instanceof Vip) {
				System.out.println( ((Vip)member[i]).info());
			}
			else if(member[i] instanceof VVip)
				System.out.println( ((VVip)member[i]).info()  );
			
		}// end for	
		// 이거 끝까지 else if안쓰면 nullpoint,,,에러남
	}
		
}	
/*

Control 클래스 이름 : memer.controller.MemberManager
MemberManager 멤버변수 Member[] : Silver 등급, Gold 등급등 회원을 최대 40명 관리할수 있는  객체배열, 인덱스 추가
MemberManager 멤버함수 : insertMember(Member m), printData 

주의할점 : 적절한 접근제어 지시자 사용 (private,public)
 
*/	

	
