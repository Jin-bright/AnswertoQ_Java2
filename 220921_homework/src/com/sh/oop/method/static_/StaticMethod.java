package com.sh.oop.method.static_;

import java.util.Arrays;

public class StaticMethod {

	public String str;
	public int a;
	public char ch;
	
	
	//1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드 
	public static String toUpper(String str) {
		return str.toUpperCase();
	}
	
	
	//2. 문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드
	public static String setChar( String str, int a, char ch ) {
		char[] s2 = new char [str.length()];
	
		int  want_int = a;
		char  want_A = ch ;
		
		int index = 0; 
		String result=""; 
		for(int i =0; i< str.length(); i++) {

			 s2[index] = str.charAt(i);
			 
			 if(index == want_int) {
				 s2[index] = want_A;
			 }
			 index++;	
		}
		
	//	for(int i=0; i<s2.length; i++) {
	//		 result += s2[i] ; 
	//	}
		 result =  new String(s2) ;
	
	return result;
	}
	
	
	//3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
	public static int getAlphabetLength( String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if( (str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') ||
					(str.charAt(i) >= 'A' &&  str.charAt(i) <= 'Z')  ) {
				count++;
			}
		}
		return count;
	}
	
	
	//4. 전달한 문자열값을 하나로 합쳐서 리턴  - non -static 
	public String concat(String str1, String str2) {
		
		return  (str1 + str2);		
	}

}


/*
public class StaticMethod {

//static method
//1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
//메소드명 : toUpper(String) : String

//2. 문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드
//메소드명 : setChar(String, int, char) : String

//3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
//메소드명 : getAlphabetLength(String) : int

//4. 전달한 문자열값을 하나로 합쳐서 리턴 
//메소드명 : concat(String, String) : String


}

*/

