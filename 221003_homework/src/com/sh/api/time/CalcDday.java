package com.sh.api.time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class CalcDday {

	public static void main(String[] args) {

		//비교당할 날짜( ex)오늘) 
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1; 
		int day = today.get(Calendar.DATE);
		/** 아니면 특정 날짜 설정하기 **
		Calendar today =  Calendar.getInstance();
		today.set(2022, 9, 02); // 한달 적게 설정하기
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1; 
		int day = today.get(Calendar.DATE);
		 */
		
		// 비교할 날짜 ( 맘대로 설정 )
		Calendar spday =  Calendar.getInstance();
		spday.set(2022, 8, 3); //한달 적게 설정하기
		
		int spdayYear =	spday.get(Calendar.YEAR);
		int spdayMonth = spday.get(Calendar.MONTH)+1;
		int spdayDay = spday.get(Calendar.DATE);
		
		System.out.println( "오늘은 " + year+"년 " +month +"월 " +day+"일" );
		System.out.println( "구할 날짜는 : "+ spdayYear+"년 " + ( spdayMonth) +"월 " +spdayDay+"일"   );
		
		
		// 날짜 차이 구하기
		LocalDate start = LocalDate.of(year, month, day);
		LocalDate end = LocalDate.of(spdayYear, spdayMonth, spdayDay);
		long dday = ChronoUnit.DAYS.between(start, end);
		
		
		// if로 결과값 맞게 반환 		
		if( dday > 0) {
			System.out.println("->  "+dday+"일 남았습니다.     (D-DAY 전)");	
		}
		else if (dday == 0) {
			System.out.println("->  D-DAY입니다.          (D-DAY)");	
		}
		else if (dday < 0) {
			String ddaystr = dday+"";
			String ddaystrwithout_ =  ddaystr.substring(1);
			System.out.println("->  "+ ddaystrwithout_ +"일 지났습니다.    (D-DAY가 지난 경우)" );
		}
		
	}

}

/*

[문제3] 
패키지 com.sh.api.time.CalcDday
Calendar클래스를 이용해서 D-DAY계산기를 만드세요.
출력은 다음과 같습니다.

 ->  193일 남았습니다.     (D-DAY 전)
 ->  D-DAY입니다.          (D-DAY)    
 ->  20일 지났습니다.    (D-DAY가 지난 경우)

*/