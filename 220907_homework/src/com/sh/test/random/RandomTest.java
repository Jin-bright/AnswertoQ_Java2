package com.sh.test.random;

import java.util.Scanner;
import java.util.Random;

public class RandomTest {
	

	public static void main(String[] args) { // @실습문제1 - 난수 (가위바위보) 
	
		RandomTest test = new RandomTest();
		test.rock();
		test.randomv();
	}	
		
	public void rock(){
		// 스캐너 객체 먼저 선언 
		Scanner sc = new Scanner(System.in);
			
		// 컴텨 입력 
		int com = (int)(Math.random()*3)+1; 
		//System.out.println(com); < 컴텨가 뭐 냈나 봄,,
			
		// 첫 문장 
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
			
		// 사용자 입력
		int a = sc.nextInt();
			
		System.out.println("============ 결과 =============");
		// 가위 바위 보 냈다고 출력할 메세지 
		if(a==1){
			System.out.println( "당신은 가위를 냈습니다." ); 
		}
		else if(a==2) {
			System.out.println( "당신은 바위를 냈습니다." ); 
		}
		else{
			System.out.println( "당신은 보를 냈습니다." ); 
		}
			
		if(com==1){
			System.out.println( "컴퓨터는 가위를 냈습니다." ); 
		}
		else if(com==2) {
			System.out.println( "컴퓨터는 바위를 냈습니다." ); 
		}
		else{
			System.out.println( "컴퓨터는 보를 냈습니다." ); 
		}
					
	
		System.out.println("==============================");
			
		// 승패 메세지
		if( (a==1 && com==3) || (a==2 && com==1) || (a==3 && com==2) ) {
			System.out.println("당신이 이겼습니다.ㅠ.ㅠ");
				
		}
		else if ( (a==1 && com ==1) || (a==2 && com==2) || (a==3 && com==3)) {
			System.out.println("비겼습니다.");	
		}
		else {
			System.out.println("당신이 졌습니다.");
		}
	}
	
	public void randomv(){ /* 문제 -  랜덤 범위를 구하는 공식
		
		/* 랜덤 범위를 구하는 공식
		 * 1. 0~9 까지의 랜덤 수 
		 * 2. 1~10 까지의 랜덤 수 
		 * 3. 20~35 까지의 랜덤 수 
		 * 4. 0 또는 1 
		 */

		//1. 0~9 까지의 랜덤 수
		int num1 = (int)(Math.random()*10);  // 0<= num <1  // 0<= num  <10 
		
		//2. 1~10 까지의 랜덤 수 
		int num2 = (int)(Math.random()*10)+1; // 0+1 <= num  <11 
		
		//3. 20~35 까지의 랜덤 수 
		Random rnd = new Random();  // random객체를 생성해야됨 
		int num3 = rnd.nextInt(16)+20;
		
		//4. 0 또는 1
		int num4 = (int)(Math.random()*2);

		System.out.println( num3 );
		
	
	}
		
		
}
