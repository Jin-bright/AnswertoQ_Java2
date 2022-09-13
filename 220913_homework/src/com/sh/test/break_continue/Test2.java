package com.sh.test.break_continue;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {  // while 문만 씀 
		
		Test2 t = new Test2();
		t.test();

	}
	
	public void test() {
		
		int x = (int)(Math.random()*100)+1;  // 1<= <101
		System.out.println("난수 : " + x);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		
		
		int count = 1;
		while( x!=num ) {
			
			if( x < num) {
				System.out.println("난수는 입력하신 정수보다 작습니다. ");
				System.out.print("정수를 입력하세요 > ");
				num = sc.nextInt();
			}
				
			else if(x > num) {
				System.out.println("난수는 입력하신 정수보다 큽니다.");
				System.out.print("정수를 입력하세요 > ");
				num = sc.nextInt();
			}
				

			count++;
		}
		
		System.out.printf("정답입니다. %d회 만에 정답을 맞추셨습니다.",count );
	}

}

/*
 * 
 * /* continue 
		 * - 반복문 실행 시 continue를 만나면, 이하 코드를 실행하지 않고 반복문의 처음으로 돌아간다. 
		 * 
		 * - for문에서 contime 썼을 경우 : 증감식으로 이동 
		 * - while문 경우 : 조건식으로 이동 
		 */

/*
[문제 2] @실습문제 - break/continue
- 클래스 : com.sh.test.break_continue.Test2.java
- 메소드명 : public void test()

    1~100 사이의 임의의 난수를 발생시키고, 
       정수 한 개를 입력 받아, 
       난수가 입력 받은 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력, 
       난수가 입력 받은 정수보다 크면 “입력하신 정수보다 큽니다.” 출력하세요.
       단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고, 
       정답인 경우 “정답입니다. 5회 만에 정답을 맞추셨습니다.”와 같이 
       몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요.
*/
