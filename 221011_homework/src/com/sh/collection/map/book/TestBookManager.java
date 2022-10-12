package com.sh.collection.map.book;

import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.sh.collection.map.book.Controller.MapBookManager;
import com.sh.collection.map.book.model.vo.Book;


public class TestBookManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TestBookManager testbook = new TestBookManager();
		MapBookManager mapBookmanager = new MapBookManager();
		
		stop:
		while(true) {
			TestBookManager.menu();
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					mapBookmanager.putBook( testbook.inputBook() ); //"1. 새 도서 추가
					break;
				case 2 :    // 도서정보 정렬후 출력 > sortedBookList() 실행=> Book[] 리턴받아 printBookList(Book[]) 실행
					mapBookmanager.sortedBookList();
					break;
		/*		case 3 :
					mapBookmanager.addBook( testbook.inputBook() );
					break;
				case 4 :
					mapBookmanager.addBook( testbook.inputBook() );
					break;
		*/
				case 5 :	// 5. 전체 출력 + displayAll():void	
					mapBookmanager.displayAll(); 		 
					break;
					
					case 6 :
					break stop;
					
			}
			
				
		}
		
		

	}
	
	public static void menu() {
		System.out.print("*** 도서 관리 프로그램 ***\n"
				+ "-----------------------------\n"
				+ "1. 새 도서 추가\n"
				+ "2. 도서정보 정렬후 출력\n"
				+ "3. 도서 삭제\n"
				+ "4. 도서 검색출력\n"
				+ "5. 전체 출력\n"
				+ "6. 끝내기\n"
				+ "-----------------------------\n"
				+ "메뉴를 선택하세요 > ");
				
	}
	
	public static Book inputBook() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서번호 > ");
		String a = sc.next();
		System.out.print("도서분류코드(1.인문/2.자연과학/3.의료/4.기타) > ");
		int code = sc.nextInt();
		System.out.print("책제목 > ");
		String b = sc.next();
		System.out.print("저자 > ");
		String c = sc.next();
		
		return new Book(a, code, b, c);
		
	}

	

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
   	ㅇ+ putBook(book:Book) : void    //맵에 객체 추가, 도서번호를 키로 사용함
    + deleteBook(key:String) : void    //맵에서 객체 제거
    + searchBook(String title) : String    : entrySet() 사용
        //도서명이 일치하는 객체의 도서번호를 리턴
        //도서명이 객체가 맵에 없으면, null 리턴함
    ㅇ+ displayAll():void        //맵정보 모두 출력 : keySet() 사용
    + sortedBookMap():Book[]
        // 해당 도서명순으로 오름차순정렬해서 객체배열 리턴함
    + printBookMap(Book[] br) : void
        //객체 배열 출력, for each 문 사용
    + printBook(key:String) : void    //

- 실행용 : com.sh.collection.map.book.TestBookManager.java
    => 실행은 [문제 2] 와 같은 방식으로 작동되게 함

*/