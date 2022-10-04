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
			} //end -for문 			
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
  
  
  // indexOf(" ") 해당 문자열에 " " 이런 공백이 있으면 이 공백이 있는 인덱스를 반환한다  
     그래서 s.indexOf(" ") > -1 이면 
     runtimeexception 예외로 처리했기 때문에 위해 throws 구문 안써도 되는거임  > 나랑 다른거 !!!! 
     이게 point !! 
     
     에러 메세지 
     
       
   *  
   */
