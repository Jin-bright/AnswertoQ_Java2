package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Run t = new Run();
		t.test1();
		
	}
	
	public void test1(){
		
		CharacterProcess ch = new CharacterProcess();
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
		System.out.print("문자를 입력하세요 > ");
		String abc =  sc.nextLine();
		
		ch.countAlpha(abc);
		System.out.println("영문자는 "+ ch.countAlpha(abc) + "개 입니다! " );
		}
		
		
		catch(CharCheckException e) {
			System.out.println("체크할 문자열 안에 공백을 포함할 수 없습니다.");
			
		}
		
		
		
	}
	

}

/*
. 실행용 클래스 : Run (main 포함)
실행할 메소드 작성 : public void test1(){}
키보드로 문자열을 입력받아 사용
countAlpha 메소드로 문자열 전달하고, 실행결과 받아 출력함.
- 반드시 try ~ catch 문 사용.
에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."
*/