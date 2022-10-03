package com.sh.api.time;

import java.time.LocalDate;
import java.time.chrono.Chronology;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcYourDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생일을 입력하세요.(년,월,일) > ");
		String birthday = sc.next();

		int birthday_year = Integer.parseInt( birthday.substring(0, 4) );
		int birthday_month = Integer.parseInt( birthday.substring(4, 6) );	
		int birthday_day = Integer.parseInt( birthday.substring(6,8) );
		
		//★★★
		LocalDate start = LocalDate.of(birthday_year, birthday_month, birthday_day);
		LocalDate end = LocalDate.now();
		
		long end_start = ChronoUnit.DAYS.between(start, end);
		
		System.out.println( end_start );
	}
	
	
/* 풀이2 - 바로 int로 받기
		
		System.out.println();
		System.out.print("년 > ");
		int year =sc.nextInt();
		System.out.print("월 >");
		int month = sc.nextInt();
		System.out.print("일 >");
		int day = sc.nextInt();
		
		LocalDate birthday = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		
		long diffe = ChronoUnit.DAYS.between(birthday, today);
		System.out.println( diffe);
*/		
		
	
}

/* 
[문제2] 
패키지 com.sh.api.time.CalcYourDays
사용자로부터 생일(년, 월, 일)을 입력받고, 오늘이 태어난지 몇일 되었는지 출력하세요.
*/