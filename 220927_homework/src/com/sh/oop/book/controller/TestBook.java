package com.sh.oop.book.controller;

import com.sh.oop.book.model.vo.Book;

public class TestBook {

	public static void main(String[] args) {
		
		Book book1 = new Book("해리포터", "조앤", 10000);
		Book book2 = new Book("개미", "베르나르", 20000);
		Book book3 = new Book("해리포터", "조앤", 10000); //★equals 동등성 비교 
				
		System.out.println( "book1 : " +  book1.toString() );
		System.out.println( "book2 : " + book2.toString());
		System.out.println( "equals : " + book1.equals(book2) );
		System.out.println( "equals true 나오게 : " + book1.equals(book3));
		System.out.println("book1,book3 객체는 정보는 똑같지만 주소는 ? " + (book1==book3) );

		Book book4 = book1.clone();
		System.out.println("*첫번째 객체와 복제 객체의 주소가 같은지 출력 : " + (book1==book3) );
		System.out.println("*첫번째 객체와 복제 객체의 내용이 같은지 출력 : " + book1.equals(book4));
		System.out.println("*첫번쨰 객체 해시코드 : " + book1.hashCode());
		System.out.println("*book4 해시코드 : " + book4.hashCode());
		System.out.println("*book3 해시코드 : " + book3.hashCode());
	}

}

/*
- 테스트 클래스 : com.sh.oop.book.controller.TestBook.java
//main() 포함
=> 초기값을 부여한 두 개의 객체를 생성함
=> 두 객체의 정보 출력 처리함  :  toString() 사용
=> 두 객체의 값이 일치하는지 결과 출력 : equals() 사용
=> 첫번째 객체를 복제한 객체 생성함 : clone() 사용
=> 첫번째 객체와 복제 객체의 주소가 같은지 출력
=> 첫번째 객체와 복제 객체의 내용이 같은지 출력


   // Object 클래스의 toString() 메소드 오버라이딩함
       => 객체의 모든 필드값 문자열 합치기해서 리턴함
       
       
   // Object 클래스의 equals() 메소드 오버라이딩함
       => 두 객체의 모든 필드값이 일치하는지를 물어서
           모두 일치하면 true, 
              하나라도 다르면 false를 리턴함
              
*/

