package com.sh.test.condition;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Test9 t = new Test9();
		t.test();

	}

	public void test() {  // 문제9
		
		Scanner sc = new Scanner(System.in);
		
		
		String menu = "*********** 주메뉴 ***********\n"
					+ "a. 불고기버거 ------------5000\n"
					+ "b. 새우버거 --------------4000\n"
					+ "c. 치킨버거 --------------4500\n"
					+ "d. 한우버거 -------------10000\n"
					+ "e. 디버거 ----------------7000\n"
					+ "*****************************\n";
		String sidemenu = "********** 사이드메뉴 **********\n"
					+ "1. 콜라 -------------------1500\n"
					+ "2. 사이다 -----------------1500\n"
					+ "3. 밀크쉐이크-------------2500\n"
					+ "4. 레드불------------------3000\n"
					+ "******************************\n";
		
		
		System.out.print( menu );
		System.out.print(" 주메뉴 선택 > ");
		String pickmenu = sc.next();
		
		// 주메뉴 잘못누르는 거르기 
		if( !( pickmenu.equals("a") || pickmenu.equals("b") || 
				pickmenu.equals("c") || pickmenu.equals("d")|| pickmenu.equals("e")) ) {
			System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			return;
		}
		
		
		System.out.print( sidemenu );
		System.out.print(" 사이드메뉴 선택 > ");
		String pickside = sc.next();
		
		// 사이드메뉴 잘못누르는 거르기
		if( !( pickside.equals("1") || pickside.equals("2") || 
				pickside.equals("3") || pickside.equals("4")) ) {
			System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			return;
		}
		
		String Mename="";
		int MenamePrice=0;
		
		String Siname="";
		int SinamePrice=0;
		
		// 주메뉴 이름, 가격 선언 
		if( pickmenu.equals("a")) {
			Mename = "불고기버거";
			MenamePrice = 5000;
		}
		else if( pickmenu.equals("b")) {
			Mename = "새우버거";
			MenamePrice = 4000;
		}
		else if( pickmenu.equals("c")) {
			Mename = "치킨버거";
			MenamePrice = 4500;
		}
		else if( pickmenu.equals("d")) {
			Mename = "한우버거";
			MenamePrice = 10000;
		}
		else if( pickmenu.equals("e")) {
			Mename = "디버거";
			MenamePrice = 7000;
		}
		
		
		// 사이드메뉴 이름, 가격 선언 
		if( pickside.equals("1")) {
			Siname = "콜라";
			SinamePrice = 1500;
		}
		else if( pickside.equals("2")) {
			Siname = "사이다";
			SinamePrice = 1500;
		}
		else if( pickside.equals("3")) {
			Siname = "밀크쉐이크";
			SinamePrice = 2500;
		}
		else {
			Siname = "레드불";
			SinamePrice = 3000;
		}	
		// 마지막 출력 
			System.out.println();
			System.out.printf("=> %s, %s은(는) 총 %d원 입니다.%n", Mename,Siname,(MenamePrice+SinamePrice) );
		
		
	}
	
}

/*

[문제 9]
- 클래스 : com.sh.test.condition.Test9.java
- 메소드명 : public void test()

    
       *********주메뉴*********
       a. 불고기버거 ------------5000
       b. 새우버거 --------------4000
       c. 치킨버거 --------------4500
       d. 한우버거 -------------10000
       e. 디버거 ----------------7000
       ***********************    
       
       *******사이드메뉴********
        1. 콜라 -------------------1500
        2. 사이다 -----------------1500
        3. 밀크쉐이크-------------2500
        4. 레드불------------------3000
        ***********************

       두메뉴를 순서대로 제시하고, 각각 사용자선택번호를 받으세요.
    예) 주메뉴에서 a, 선택후 사이드메뉴에서 4 선택시
    “불고기버거, 레드불은 총 8000원입니다“출력.
    
    각메뉴선택시 다른문자를  입력하면 “번호를 잘못 누르셨습니다. 영업을 종료합니다.”

*/
