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

/*
//실행클래스 Run : 적절한 방법으로 static 메소드 호출하기
//기능제공클래스 StaticMethod

public class Run {

  public static void main(String[] args) {
      //1 toUpper메소드 호출시 "kh academy"를 전달하면, "KH ACADEMY"가 리턴
      //2 setChar메소드 호출시  "java", 0, 'x'를 전달하고, "xava" 리턴
      //3 getAlphabetLength호출시 "안녕, 난 James야!" 전달하고, 5 리턴
      //4 concat 호출시 "hello", "world" 호출후 "helloworld" 리턴
  }
*/