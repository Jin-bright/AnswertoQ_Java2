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
