package com.sh.edu;

import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;


public class TestJavaApi {

	public static void main(String[] args) {
	
		
		LocalDateTime today = LocalDateTime.now();
		System.out.printf( "%d/%d/%d", today.getYear(), today.getMonthValue(),today.getDayOfMonth() );


		
		
		
		

	/* 구글 검색으로 한 방법 - format import문 추가해서 (import java.time.format.DateTimeFormatter;)  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String today = LocalDateTime.now().format(formatter);
		
		System.out.println( today );
	*/	

		
	}

}
