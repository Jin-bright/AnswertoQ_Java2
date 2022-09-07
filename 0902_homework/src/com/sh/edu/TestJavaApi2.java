package com.sh.edu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class TestJavaApi2 {

	public static void main(String[] args) {
	
		
		TestJavaApi2 t = new TestJavaApi2();
		t.Test();
		
	}
	
	public void Test(){  // test메서드 하나 더 만들어서 기능 적어뒀음 

		Date date = new Date();
		SimpleDateFormat spd = new SimpleDateFormat("YYYY/MM/dd"); // 년/월/일 형식은 이건가?
		System.out.println( spd.format(date) ) ;
		
		// localDate : 년월일 
		// locatTime : 시간 
		// localdateTime : 년월일 + 시간 
		
//		static이 메서드 앞에 안붙은 애들은  객체 생성해서 호출해야한다  
//		static이 앞에 붙어 있는 애들은  객체 생성없이 호출할 수 있따  
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))); // 2022/09/02

		
	}

}
