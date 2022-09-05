package com.sh.test;

public class Test1 {

	public static void main(String[] args) {
			
		Test1 t = new Test1();
		t.code();
	}
		
	public void code() {
			
		int i = 100;
		long l = 999_900_000_000L;
		float f = 486.567f;
		double d = 567.890123;
		char ch = 'A';
		String str1 = "Hello world";
		boolean bool = true;
			
		System.out.println( i );
		System.out.println( l );
		System.out.println( f );
		System.out.println( d );
		System.out.println( ch );
		System.out.println( str1 );
		System.out.println( bool );
	}

}


	/* 문제 1 
	1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
	- 정수형 100, 9999억,
	    - 실수 486.567(float), 567.890123
	    - 문자 A
	    - 문자열 Hello world,
	    - 논리 true

	단, 변수를 이용하여 출력하시오 .
	*/