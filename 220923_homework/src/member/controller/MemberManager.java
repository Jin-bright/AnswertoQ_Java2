package member.controller;

import member.model.vo.*;

public class MemberManager {

	private Silver[] silver;
	private Gold[] gold;
	private Vip[]  vip;
	private VVip[]  vvip;
	
	private static final int MAX_MEMBER = 10;
	private int index = 0;
	private int index2=0;
	private int index_vip=0;
	private int index_vvip=0;


	// 1. 기본생성자 
	public MemberManager() {	
		silver = new Silver[MAX_MEMBER];
		gold = new Gold[MAX_MEMBER];	
		vip = new Vip[MAX_MEMBER];
		vvip = new VVip[MAX_MEMBER];
	}
	
 
// 2, 3 silverInsert 메서드  => 여기서는 silver[0] 이런 값 넣기를 해줘야됨 
	public Silver silverInsert( Silver silvers ) {
	// Q. 객체 선언을따로 안해줘도되나 ? 왜?? 
		
//		silvers.getName();
//		silvers.getGrade();
//		silvers.getInPoint();

		silver[index++] = silvers;

		return silvers;
	
	}// end silverInsert 메서드 
	
/*  선생님답안 	
	public void goldInsert(Gold g) {
		this.golds[goldIndex++] = g; 
	
	여기서 this는 없어도 됨. 
	그리고 이 silver[index++] silvers  <여기 silvers가 객체 
	}
  
 */
	
	
	
	public Gold goldInsert( Gold golds ) {
		golds.getName();
		golds.getGrade();
		golds.getInPoint();
		
		gold[index2++] = golds;
		
		return golds;
	}// end goldInsert 메서드 


	public Vip vipInsert( Vip vips ) {
		
		vips.getName();
		vips.getGrade();
		vips.getInPoint();
		
		vip[index_vip++] = vips;
		
		return vips;
	}
	
	public VVip vvipInsert( VVip vvips ) {
		vvips.getName();
		vvips.getGrade();
		vvips.getInPoint();
		
		vvip[index_vvip++] = vvips;
		
		return vvips;
	}
	
	
	// 4. printData 메서드 => 호출하는 코드
	public void printData() {
	
		System.out.println("---------------------------<<회원정보>>------------------------------\n"
			        	 + "	이름              등급            포인트            이자포인트  \n"
				         + "--------------------------------------------------------------------");
		

		for(int i=0; i<index; i++) {			
			System.out.printf( "\t%s\t \t%s\t \t%d\t \t%.2f\t%n",silver[i].getName(),
				silver[i].getGrade(),silver[i].getPoint(),silver[i].getInPoint() );
		}
		
		for(int i=0; i< index2; i++) {
				System.out.printf( "\t%s\t \t%s\t \t%d\t \t%.2f\t%n",gold[i].getName(),
						gold[i].getGrade(),gold[i].getPoint(),gold[i].getInPoint() );	
		}
		
		for(int i=0; i<index_vip; i++) {			
			System.out.printf( "\t%s\t \t%s\t \t%d\t \t%.2f\t%n",vip[i].getName(),
					vip[i].getGrade(),vip[i].getPoint(),vip[i].getInPoint() );
		}
		
		for(int i=0; i<index_vvip; i++) {			
			System.out.printf( "\t%s\t \t%s\t \t%d\t \t%.2f\t%n",vvip[i].getName(),
					vvip[i].getGrade(),vvip[i].getPoint(),vvip[i].getInPoint() );
		}
		
	}		
}
	


/*

Silver,Gold 멤버변수 : 이름 name,등급 grade ,포인트 point
Silver,Gold 멤버함수 : 컨스트럭터(생성자) , setter/getter(이자포인트 getter추가)
---> 실버 등급은 2% 를 곱한값이 이자 포인트
---> 골드 등급은 5% 를 곱한값이 이자 포인트
Control 클래스 이름 : MemberManager
MemberManager 멤버변수 : Silver 등급을 최대 10명, Gold 등급을 최대 10명 관리할수 있는  객체배열 , 인덱스 추가
MemberManager 멤버메소드 : silverInsert, goldInsert, printData 

주의할점 : 적절한 접근제어 지시자 사용 (private,public)

실행클라스 : member.run.Run 
	
	public class Run {

		public static void main(String[] args){
			MemberManager m = new MemberManager();
			m.silverInsert(new Silver("홍길동", "Silver",1000));
			m.silverInsert(new Silver("김말똥", "Silver",2000));
			m.silverInsert(new Silver("고길동", "Silver",3000));
			m.goldInsert(new Gold("김회장", "Gold",1000));
			m.goldInsert(new Gold("이회장", "Gold",2000));
			m.goldInsert(new Gold("오회장", "Gold",3000));
			m.printData();
		}

	}

출력결과 :

	---------------------------<<회원정보>>---------------------------
	이름              등급              포인트             이자포인트          
	-----------------------------------------------------------------
	홍길동             Silver          1000            20.00          
	김말똥             Silver          2000            40.00          
	고길동             Silver          3000            60.00          
	김회장             Gold            1000            50.00          
	이회장             Gold            2000            100.00         
	오회장             Gold            3000            150.00  


*/