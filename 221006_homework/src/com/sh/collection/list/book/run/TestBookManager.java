package com.sh.collection.list.book.run;

import java.util.Scanner;

import com.sh.collection.list.book.controller.BookManager;
import com.sh.collection.list.book.model.vo.Book;

public class TestBookManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TestBookManager testbook = new TestBookManager();
		BookManager bookmanager = new BookManager();
		
		stop:
		while(true) {
			TestBookManager.menu();
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					bookmanager.addBook( testbook.inputBook() );
					break;
				case 2 :
					bookmanager.sortedBookList();
					break;
				case 3 :
					bookmanager.addBook( testbook.inputBook() );
					break;
				case 4 :
					bookmanager.addBook( testbook.inputBook() );
					break;
				case 5 :
					bookmanager.printAll();
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
	
	public Book inputBook() {
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