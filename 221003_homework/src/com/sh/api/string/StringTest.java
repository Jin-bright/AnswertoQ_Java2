package com.sh.api.string;

import java.util.Scanner;

public class StringTest {


	public static void main(String[] args) {
		
		StringProcess t = new StringProcess();
		Scanner sc = new Scanner(System.in);
		
		//1번째 메소드 테스트 
		System.out.print( "문자를 입력하세요 > ");
		String s = sc.next();
		System.out.println("결과 : " + t.preChar(s)  );
		
		//2번째 메소드 테스트 
		System.out.println( "문자를 입력하세요(특정문자찾기 테스트)\n"
								+ "ex)HarryPotter, e\n" );
		System.out.print("문자열 입력 > ");
		String str = sc.next();
		System.out.print("찾는 문자 입력 > ");
		char findch = sc.next().charAt(0);
		System.out.println( "결과 : " + t.charSu( str,findch )  );

	}

}
