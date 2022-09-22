package com.sh.oop.book.model;


public class Book {

	//필드
	  private String title;    //책제목
	  private int price;    //가격
	  private double discountRate;    //할인율
	  private String author;    //저자명
	
	 // 기본생성자
	  public Book() {
		
	  }

	//생성자(매개변수4)
	public Book( String title, int price, double discountRate, String author ) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	// get&set - title
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	// get&set - price
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	// get&set - discountRate
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	// get&set - author
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	// 출력용 메서드 
	public void bookInfomation() {
		System.out.println( getTitle() + " 	" + getPrice() + "  " + getDiscountRate() + "  " +  getAuthor() );
		
	}
	
	public void saleprice() {
		
		this.price = (price - (int)(price*discountRate));
		System.out.printf("도서명 : %s%n할인된 가격 : %d원%n%n", getTitle(), getPrice() );
		
	}
}




/*
@실습문제

[객체실습 2]
 - 도서정보 관리용 클래스 만들기
 - 클래스명 : com.sh.oop.book.model.Book.java
 - 멤버변수 : 반드시 캡슐화를 적용할 것
    - title:String    //책제목
    - price:int    //가격
    - discountRate:double    //할인율
    - author:String    //저자명

 - 기본(default) 생성자와 4개의 필드를 초기화하는 매개변수가 있는 생성자 작성함
 - 출력용 메소드 작성함 : 객체가 가진 필드값 화면 출력 처리
    public void bookInfomation()


 - 테스트용 클래스 : com.sh.oop.book.controller.TestBook.java
    main() 메소드 포함
 -  main() 에서
    1. Book 클래스에 대한 객체를 디폴트 생성자를 사용해서 생성함
    2. 매개변수 있는 생성자를 사용해서 두번째 객체 생성함(뇌를 자극하는 JAVA, 20000, 0.2, 김윤영)
    3. 2개의 객체가 가진 정보를 화면출력함
    <출력예>
    null    0    0.0    null
    뇌를 자극하는 JAVA    20000    0.2    김윤영

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
