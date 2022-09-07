package com.sh.test.condition;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.test();
		
	}
	
	public void test() { // [문제 3]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 > ");
		int a = sc.nextInt();
		
		System.out.print("정수2 > ");
		int b = sc.nextInt();
		
		System.out.print("연산자 > ");
		String p = sc.next();
		
		
		if ( a<0 || b<0 ) { 
			System.out.printf("잘못 입력 하셨습니다.%n 프로그램을 종료합니다.");	
		}
		else if(p.equals("+")) {
			System.out.printf("%d+%d=%d",a,b,a+b);
		}
		else if(p.equals("-")) {
			System.out.printf("%d-%d=%d",a,b,a-b);
		}
		else if (p.equals("*")) {
			System.out.printf("%d*%d=%d",a,b,a*b);
		}
		else if (p.equals("/")) {
			System.out.printf("%d/%d=%d",a,b,a/b);
		}
		
		if (!( p.equals("+")|| p.equals("-") || p.equals("*") || p.equals("/") )) {
			System.out.printf("잘못 입력 하셨습니다.%n 프로그램을 종료합니다.");
		}
		
		
	}

}


/*
[문제 3]
- 클래스 : com.sh.test.condition.Test3.java
- 메소드명 : public void test()

    정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤  결과를 출력하는 계산기 프로그램을 만들어보세요.      

    출력 예) 입력 5, 6, +
           5+6=11

    음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면 “잘못 입력 하셨습니다.  프로그램을 종료합니다.” 
    라는 문구가 출력되게 하세요.

*/