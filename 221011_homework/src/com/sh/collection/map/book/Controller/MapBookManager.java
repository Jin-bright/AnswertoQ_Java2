package com.sh.collection.map.book.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sh.collection.map.book.model.vo.Book;

public class MapBookManager {

	//필드
	public Map<String,Book> booksMap = new HashMap<>();
	Set< Entry<String, Book>> entrySet = booksMap.entrySet();
	
	{
		booksMap.put("200", new Book("200", 2, "나미야 잡화점의 기적", "히가시노 게이고"));
		booksMap.put("100", new Book("100", 3, "파리의 아파트", "기욤 뮈소"));
		booksMap.put("400", new Book("400", 1, "ABCDE", "도레미"));
		booksMap.put("300", new Book("300", 2, "미중전쟁", "김진명"));
		booksMap.put("500", new Book("500", 1, "JAVA 삽질하기", "김동현"));
	}
	//기본생성자 
		
	public MapBookManager() {
			super();
				
	
	}

	//매개변수생성자
	public MapBookManager(Map<String, Book> booksMap) {
		super();
		this.booksMap = booksMap;
		//매개변수있는 생성자 : 다른 맵을 전달받아.  booksMap 객체의 초기값으로 생성함
	}
	
	public void putBook(Book book) {    // 맵에 객체 추가, 도서번호를 키로 사용함
		booksMap.put(book.getbNo(), book);
	}

	public void displayAll() {
		
		for( Entry<String, Book> entry : entrySet ) {
			Book value = entry.getValue();
			System.out.println( value);
		}
	}//
	
	
	public Book[] sortedBookList() {
		Book[] bookarr = new Book[booksMap.size()];
		//Set< Entry<String, Book>> entrySet = booksMap.entrySet();
		
		int i=0;
		for( Entry<String, Book> entry : entrySet ) {
			bookarr[i++] = entry.getValue();
		}
		
//		Arrays.sort( bookarr, null );
		Arrays.sort( bookarr, Collections.reverseOrder() );
		return bookarr;
		

	}
	/*
	 * Book[] bookArr = new Book[bookMap.size()];
		// keyset -> key -> value을 배열로 옮겨담기
		Set<String> keySet = bookMap.keySet();
		int i = 0; 
		for(String key : keySet){
			bookArr[i++] = bookMap.get(key);
		}

		// 배열정렬에 배열과 배열기준객체를 제공한다
//		Arrays.sort(bookArr, null); // 기본정렬(Comparable#compareTo 오버라이드된 경우)
		Arrays.sort(bookArr, new CategoryAsc());
//		Arrays.sort(bookArr, Collections.reverseOrder(new CategoryAsc()));
		return bookArr;
	}

	 */
}

/*
@실습문제2
실습문제1버젼을 맵으로 해서 만들어본다. 
클래스 import시 문제1 패키지의 entity클라스를 공유함.

 - 클래스명 : com.sh.collection.map.book.Controller.MapBookManager.java
    //Field
    - booksMap : HashMap    //도서번호를 키로 사용함

    //기본생성자 : 맵 객체 생성함
    //매개변수있는 생성자 : 다른 맵을 전달받아. 
    //booksMap 객체의 초기값으로 생성함

    //Method
    + putBook(book:Book) : void    //맵에 객체 추가, 도서번호를 키로 사용함
    + deleteBook(key:String) : void    //맵에서 객체 제거
    + searchBook(String title) : String    : entrySet() 사용
        //도서명이 일치하는 객체의 도서번호를 리턴
        //도서명이 객체가 맵에 없으면, null 리턴함
    + displayAll():void        //맵정보 모두 출력 : keySet() 사용
    + sortedBookMap():Book[]
        // 해당 도서명순으로 오름차순정렬해서 객체배열 리턴함
    + printBookMap(Book[] br) : void
        //객체 배열 출력, for each 문 사용
    + printBook(key:String) : void    //
*/