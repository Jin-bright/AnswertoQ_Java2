package com.sh.api.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TodayTest {

	public static void main(String[] args) {
	
		//오늘 날짜
		LocalDate today = LocalDate.now(); 
		System.out.println(  "오늘은 " + today.format( DateTimeFormatter.ofPattern("yyyy년 M월 d일 E"))+
				"요일입니다." );
		
		System.out.println( );
		
		/*특정날짜 지정했음 
		LocalDate spday = LocalDate.of(2019,8,5);
		System.out.println( "오늘은 " + spday.format( DateTimeFormatter.ofPattern("yyyy년 M월 d일 E"))+
							"요일입니다."  );
		*/
		
	}



}

/*
[날짜관련 실습문제1]

[문제1]
패키지 com.sh.api.time.TodayTest
오늘 날짜를 다음 형식으로 출력하세요.

-> 오늘은 2019년 8월 5일 목요일입니다.
*/