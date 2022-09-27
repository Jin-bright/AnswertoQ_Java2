package com.sh.oop.book.model.vo;

import java.util.Objects;

public class Book {

	//필드 
	private String title;
	private String author;
	private int price;

	//기본생성자 
	public Book() {
		super();
	}
	
	
	// 매개변수 생성자 
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// (복사생성자 구현)this가 가리키는 객체가 가진 값을 복사한 새 객체 생성하고 주소 리턴함

	public Book (Book other) {
		this.title = other.title;
		this.author = other.author;
		this.price = other.price;
	}
	
	
	// Getter and Setter 작성함 
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	// Object 클래스의 toString() 메소드 오버라이딩함
    //=> 객체의 모든 필드값 문자열 합치기해서 리턴함
	
	@Override
	public String toString() {
		return "[제목:" + this.title + ", 저자:" + this.author +
				", 가격:" + this.price +"]";
	}

	@Override
	public boolean equals(Object obj) {
		 Book book = (Book)obj;
		
		 if ( title.equals(book.title) && author.equals(book.author) 
				 && this.price==book.price ) {
			return true;
		 }
		 else
			return false;
	}
	
	@Override
	public Book clone() {
		return new Book(this); // ★이렇게 쓰는거 기억하기 
		// 새로운 book객체를 만든다
	}
	
	// ++ equals가 true가 나오면 hashcode도동일하게 나와야한다 
	@Override
	public int hashCode() {
			return Objects.hash( this.title, this.author, this.price);
	}
}

/*
@실습문제1
- 패키지명 : com.sh.oop.book.model.vo
- 클래스명 : Book
   //Field
   - title : String    //책제목
   - author : String    //저자명
   - price : int        //가격

   //기본생성자와 매개변수 생성자 작성함
   //Getter and Setter 작성함
     
    
   // Object 클래스의 toString() 메소드 오버라이딩함
       => 객체의 모든 필드값 문자열 합치기해서 리턴함
   
   // Object 클래스의 equals() 메소드 오버라이딩함
       => 두 객체의 모든 필드값이 일치하는지를 물어서
           모두 일치하면 true, 
              하나라도 다르면 false를 리턴함
   
   // Object 클래스의  clone() 메소드 오버라이딩함
       => 접근제한자는 public 으로 변경함
       => 예외처리는 삭제함
       => (복사생성자 구현)this가 가리키는 객체가 가진 값을 복사한 새 객체 생성하고 주소 리턴함

*/
