package com.sh.collection.list.book.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sh.collection.list.book.model.compare.AscCategory;
import com.sh.collection.list.book.model.vo.Book;

public class BookManager {
	
	//Field
	private ArrayList<Book> bookList = new ArrayList<>();//난이렇게 못만들었음 
	{
		bookList.add(new Book("200", 2, "나미야 잡화점의 기적", "히가시노 게이고"));
		bookList.add(new Book("100", 3, "파리의 아파트", "기욤 뮈소"));
		bookList.add(new Book("400", 1, "ABCDE", "도레미"));
		bookList.add(new Book("300", 2, "미중전쟁", "김진명"));
		bookList.add(new Book("500", 1, "JAVA 삽질하기", "김동현"));
	}
	//기본생성자
	public BookManager() {
		super();
		ArrayList<Book> bookList = new ArrayList<>();
		
	}

	// 매개변수생성자
	public BookManager(ArrayList bookList) {
		super();
		this.bookList = bookList;
	}
	
	//메소드 
	public void addBook(Book book) { //리스트에 객체 추가
		bookList.add(book);
	}
	
	public void deleteBook(int index) { //리스트에서 객체 제거
		bookList.remove(index);
	}
	
	public int searchBook (String title) { //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴(일치하는 객체가 리스트에 없으면, -1 리턴)
		int index = bookList.indexOf(title);
		return index;
	}
	
	public void printBook (int index) {//인덱스 위치의 객체의 정보를 출력함
		System.out.println( bookList.get(index) );		
	}

	public void printAll() {//목록정보 모두 출력
		System.out.println(bookList );
	}
	
	public Book[] sortedBookList() { // 해당 카테고리순 오름차순정렬해서 객체배열 리턴함
		
		Book[] booklistcopy = new Book[bookList.size()];
		
		for(int i=0; i<booklistcopy.length; i++) {  //옮겨담아버림 ? 
			 booklistcopy[i] = (Book)bookList.get(i);
		}
		
		bookList.toArray(booklistcopy);
		Arrays.sort(booklistcopy, new AscCategory() ); //정렬
		
		return booklistcopy;
	}
	
	/*
	 * 		
		Book[] bookArr = new Book[bookList.size()];
		//1.collection을 배열로 옮겨담기
//		for(int i=0; i<bookArr.length; i++){
//			bookArr[i] = (Book)bookList.get(i);
//		}
		
		//2. 빈 Book[]객체를 toArray메소드 인자로 전달
		bookList.toArray(bookArr);	
	

		//배열정렬에 배열과 배열기준객체를 제공한다
		//<Book> void java.util.Arrays.sort(Book[] a, Comparator<? super Book> c)
		Arrays.sort(bookArr, new AscCategory());
		//Arrays.sort(bookArr, new DescCategory());		
		return bookArr;
		
	 */
}

/*
list로 복제하는 경우
List<Book> copyList1 = new ArrayList<>(bookList);
List<Book> copyList2 = (List<Book>) ((ArrayList<Book>) bookList).clone();

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
		 * *
		 */
