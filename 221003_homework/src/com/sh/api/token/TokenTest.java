package com.sh.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

	public static void main (String[] args) {
		
		String str = "J a v a P r o g r a m ";
	//	StringTokenizer tokenn = new StringTokenizer();
		
		StringTokenizer token = new StringTokenizer(str);
		
		char[] tokench = new char[str.length()];
		int index = 0;
		
		while( token.hasMoreTokens()) {
			 tokench[index] =  ( token.nextToken()).charAt(0) ;
			 index++;
		}
		//토큰 처리전 글자 출력
		System.out.println( str );
		//토큰 처리 후 글자갯수 출력 확인
		System.out.println( str.length() );
		// char [] 값 출력
		for (int i=0; i<index; i++) {
			System.out.print( tokench[i] );
		}
		System.out.println();
		
		//char [] 을 다시 String 으로 바꾼 후 
		String tokenchst="";
		for(int i=0; i<index; i++) {
			tokenchst += tokench[i] + "" ;	
		}
		
		// 모두 대문자로 변환하여 출력
		System.out.println(  tokenchst.toUpperCase());
		
	}
}


/*

<문제 1>  ---------------------------------------------------------------------
- 클래스 : com.sh.api.token.TokenTest.java

"J a v a P r o g r a m " 문자열 값을
공백 단위로 Token 처리하여 char [] 에 저장하여 출력하시오.

- 토큰 처리전 글자 출력
- 전 글자갯수 출력
- 토큰 처리 후 글자갯수 출력 확인
- char [] 값 출력
- char [] 을 다시 String 으로 바꾼 후 
- 모두 대문자로 변환하여 출력

*/