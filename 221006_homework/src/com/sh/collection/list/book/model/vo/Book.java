package com.sh.collection.list.book.model.vo;

public class Book {
	
		//Field
		private String bNo; 	//도서번호
		private int category;   //도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
		private String title;	//책제목
		private String author;	//저자
		
		//기본생성자
		public Book() {
			super();
		}
		
		//매개변수 생성자
		public Book(String bNo, int category, String title, String author) {
			super();
			this.bNo = bNo;
			this.category = category;
			this.title = title;
			this.author = author;
		}
		
		@Override
		public String toString() {
			return "Book [bNo=" + bNo + ", category=" + category + ", "
					+ "title=" + title + ", author=" + author + "\n]";
		}

		
		// get set 
		public String getbNo() {
			return bNo;
		}

		public void setbNo(String bNo) {
			this.bNo = bNo;
		}

		public int getCategory() {
			return category;
		}

		public void setCategory(int category) {
			this.category = category;
		}

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
		
		
		
}

/*## 컬렉션 실습문제1

@실습문제1
 - 클래스명 : com.sh.collection.list.book.model.vo.Book
	//Field
	- bNo : String	//도서번호
	- category : int   //도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
	- title : String	//책제목
	- author : String	//저자

	//기본생성자, 매개변수 있는 생성자, getters and setters 작성함
	//toString() 오버라이딩함

===========================================================================
 - 정렬 처리를 위한 클래스 작성함 : java.util.Comparator 인터페이스 상속받음
		=> compare() 오버라이딩함
	//카테고리 기준 오름차순 정렬용
	com.sh.collection.list.book.model.compare.AscCategory


 - 관리용 클래스 : com.sh.collection.list.book.controller.BookManager
	//Field
	- bookList : ArrayList	

	//기본생성자 : bookList 객체 생성함
	//매개변수있는 생성자 : 다른 리스트를 전달받아. 
	//		bookList 객체의 초기값으로 사용함

	//Method
	+ addBook(book:Book) : void	 //리스트에 객체 추가
	+ deleteBook(int index) : void //리스트에서 객체 제거
	+ searchBook(String title) : int	
		//도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
		//도서명이 일치하는 객체가 리스트에 없으면, -1 리턴함
	+ printBook(index:int) : void //인덱스 위치의 객체의 정보를 출력함
	+ printAll():void		//목록정보 모두 출력
	+ sortedBookList():Book[]
		// 해당 카테고리순 오름차순정렬해서 객체배열 리턴함
	+ printBookList(Book[] br) : void
		//객체 배열 출력, for each 문 사용

	
 - 클래스명 : com.sh.collection.list.book.run.TestBookManager.java   >> main() 포함
	>> menu() 메소드 추가함
	public static void menu(){}

		=> 다음 내용이 출력되게 함
		=> BookManager 클래스 객체 생성함

	*** 도서 관리 프로그램 ***

	1. 새 도서 추가	
			=> addBook(inputBook() 이 리턴한 객체) 실행
	2. 도서정보 정렬후 출력
			=> sortedBookList() 실행 
			=> Book[] 리턴받아 printBookList(Book[]) 실행
	3. 도서 삭제	
			=> inputBookTitle(삭제할 도서명) 실행 
			=> index를 리턴받아 deleteBook(index) 실행
	4. 도서 검색출력	
			=> inputBookTitle(검색할 도서명) 실행 
			=> index 리턴받아 printBook(index) 실행
	5. 전체 출력	
			=> printAll() 실행
	6. 끝내기

	>>추가, 삭제, 검색에 필요한 키정보는 키보드로 입력받도록 함
	//Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
	+ inputBook() : Book

	//삭제 또는 검색을 위한 도서 타이틀을 키보드로 입력받아 리턴
	+ inputBookTitle() : String

	>> 끝내기 메뉴 선택 전까지는 메뉴 반복 실행되도록 처리함
*/