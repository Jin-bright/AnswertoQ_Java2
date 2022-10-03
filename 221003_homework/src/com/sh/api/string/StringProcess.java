package com.sh.api.string;

public class StringProcess {
	
	public String preChar(String s) { //1.문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
		
		String first = (s.charAt(0))+"";
		String rest ="";
		
		for(int i=1; i< s.length(); i++) {
			rest += s.charAt(i)+"";
		}
		return first.toUpperCase() + rest ; 
		
	}
	
	public int charSu(String s, char ch) { //2.문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성

		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if ( s.charAt(i) == ch ) {
				count++;
			}
					
		}//end for문 
		
		return count;
	}

	
	
	
}


/*
<문제 2>  ---------------------------------------------------------------------
클래스 명 : com.sh.api.string.StringProcess.java
메소드 작성 : 
1.문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
  : +preChar(String s): String

2.문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
  : +charSu(String s, char ch):int

테스트 클래스 : com.sh.api.string.StringTest.java
- 키보드(Scanner)로 부터 문자열과 문자를 입력받아, 두 개의 메소드 실행 테스트
- 결과값들 출력 확인
*/
