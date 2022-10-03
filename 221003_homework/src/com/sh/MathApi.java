package com.sh;

public class MathApi {

	public static void main(String[] args) {
	
	double d1 = 3456.5324;
	// 3456.6 표현하기  올림
	System.out.println(    Math.ceil( d1*10 )/10 );
	
	double d2 = 577.26784;
	// 577.27 표현하기 반올림
	System.out.println(   Math.round(d2*100) /100.0 );
	
	double d3 = 552.2987;
	// 552.299  올림
	System.out.println( Math.ceil( d3*1000)/1000 );
	
	double d4 =  -845.215;
	// -845.3
	System.out.println( Math.floor( d4*10  )/10);
	
	double d5 = 324456.24497;
	// 324456.25 올림
	System.out.println(  Math.ceil( d5*100 ) / 100);
	}

}

/*

[Math 실습문제]
Math클래스의 올림, 반올림, 버림 메소드를 학습후 풀어보세요.

1. 3456.5324     => 올림해서 소수점첫째자리까지 표현
2. 577.26784     => 반올림해서 소수점둘째자리까지 표현
3. 552.2987      => 올림해서 소수점셋째자리까지 표현
4. -845.215      => 내림해서 소수점첫째자리까지 표현
5. 324456.24497  => 올림해서 소수점둘째자리까지 표현

*/