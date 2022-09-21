package com.sh.oop.method.static_;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		
		StaticMethod s = new StaticMethod();
		
		System.out.println("upper: " + StaticMethod.toUpper("kh academy") );
		System.out.println("setChar : " + StaticMethod.setChar("java", 0, 'x'));
		System.out.println("getAlphabetLength : " + StaticMethod.getAlphabetLength("안녕, 난 James야!") );
		System.out.println("concat : " + s.concat("hello", "world") );
		
	}
}
