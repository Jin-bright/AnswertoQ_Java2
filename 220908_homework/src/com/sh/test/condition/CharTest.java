package com.sh.test.condition;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 > ");
		
		String word = sc.next();
		char chword = word.charAt(0);
		int intchword = chword;
	
	//	System.out.println(intchword);
		
	
		if( (intchword >= 65 && intchword <= 90) || 
				(intchword >= 97 && intchword <= 122) ) {
			System.out.printf( "* 입력하신 문자 %s 은/는 알파벳입니다.",word );
		}
		else if ( (intchword >= 33 && intchword <= 47) || 
				(intchword >= 58 && intchword <= 64) ||
				(intchword >= 91 && intchword <= 96) ||
				(intchword >= 123 && intchword <= 126) ) {
			System.out.printf( "* 입력하신 문자 %s 은/는 특수문자입니다.",word );
		}
		else {
			System.out.printf( "* 입력하신 문자 %s 은/는 숫자입니다.",word );
		}

		
	}

}

/*
@실습문제3
패키지 com.sh.test.condition.CharTest

사용자에게 입력받은 문자하나를 문자타입에 따라 구분해 출력하세요.
* 입력하신 문자 1 은/는  숫자입니다.
* 입력하신 문자 c 은/는  알파벳입니다.
* 입력하신 문자 z 은/는  알파벳입니다.
* 입력하신 문자 * 은/는  특수문자입니다.
*/