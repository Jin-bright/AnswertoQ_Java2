package com.sh.oop.book.controller;

import com.sh.oop.book.model.Book;

public class TestBook {
	
	public static void main(String[] args) {
	   //1단계 
		Book b  = new Book();  
	//	b.bookInfomation();
	
		//2단계 
		b.setPrice(35000);
		b.setDiscountRate(0.1);
		b.setTitle("자바의 정석");
		b.setAuthor("윤상섭");
		b.bookInfomation();
		
		
		Book b2 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");  // 2. 매개변수 있는 생성자  
		b2.bookInfomation();
		System.out.println();
		
		
		//3단계 (메소드로 출력)
//		b.saleprice();
//		b2.saleprice();
		
		
		
		//3단계 (다른방법,, get / set ) <- 단, 두 방법 다 실행하면 할인에 할인됨 
		int result1 = b.getPrice() - (int)(b.getPrice() *  b.getDiscountRate() );
		int result2 = b2.getPrice() - (int)(b2.getPrice() *  b2.getDiscountRate() );
			
		System.out.println("==============================");
		System.out.println("도서명 : " + b.getTitle());
		System.out.println("할인된 가격 : " + result1 );
		System.out.println();
		System.out.println("도서명 : " + b2.getTitle());
		System.out.println("할인된 가격 : " + result2 );

	

		
		
		

	}

}

/*

- 테스트용 클래스 : com.sh.oop.book.controller.TestBook.java
   main() 메소드 포함
- main() 에서
   1. Book 클래스에 대한 객체를 디폴트 생성자를 사용해서 생성함 // 디폴트 생성자 = 기본생성자 ? 
   2. 매개변수 있는 생성자를 사용해서 두번째 객체 생성함
   3. 2개의 객체가 가진 정보를 화면출력함
   <출력예>
   null    0    0.0    null
   
   //2단계 --------------------------------------------------------------------------------
 - Book 클래스에 setter 추가함 : 4개의 필드에 대한 setter 메소드 작성함
 - TestBook 클래스의 main() 메소드 안의 기존의 소스코드 아래에 추가함
    1. 첫번째 객체가 가진 값을 setter 를 사용해서 수정
    2. 출력확인함

    수정된 결과확인
    자바의 정석     35000  0.1   윤상섭
    
    
	//3단계 ------------------------------------------------------------------------------
 - Book 클래스에 getter 추가함 : 4개의 필드에 대한 getter 모두 작성
 - TestBook 클래스의 main() 메소드에 소스 추가함
    1. 두 객체 각각 할인율을 적용한 책 가격을 계산해서 출력함
    할인된 가격 = 가격 - (가격 * 할인율);

    <출력결과>
    도서명 : 자바의 정석
    할인된 가격 : 31500 원

    도서명 : 뇌를 자극하는 자바
    할인된 가격 : 16000 원
    
*/


