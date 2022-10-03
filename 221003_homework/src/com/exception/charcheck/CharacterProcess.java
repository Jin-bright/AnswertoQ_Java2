package com.exception.charcheck;

import java.util.Scanner;

public class CharacterProcess {

	public int countAlpha (String s) throws CharCheckException {
		
			int count = 0;
			
			//공백 , 영문자 체크
			for(int i =0; i<s.length(); i++) {
				
				if ( s.charAt(i) == ' ')   {
					throw new CharCheckException ("공백발생");
				}
					
				else if( (s.charAt(i) >='a' && s.charAt(i)<='z') || s.charAt(i) >='A' && s.charAt(i)<='Z')
					count++;
			}
			
			return count;
	}

}

/*
 * 2. 클래스 만들기
 
클래스명 : CharacterProcess
기본 생성자
 메소드
//전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
public int countAlpha(String s){}
//단, 공백문자가 있으면, CharCheckException 발생
  
*/