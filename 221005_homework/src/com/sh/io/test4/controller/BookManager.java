package com.sh.io.test4.controller;

import java.time.LocalDate;
import java.util.Scanner;
import java.io.*;
import com.sh.io.test4.model.vo.Book;

public class BookManager {	
	//초기화 객체 .. ?
	Scanner sc = new Scanner (System.in);

	//기본생성자
	public BookManager() {
		super();
	}
	
	public void fileSave() {// 파일 save용 메서드 (출력 = write/outputstream)
	
		Book[] book = new Book[5];
		book[0] = new Book("해리포터","조앤",10000, LocalDate.of(2000,01,01) );//샘플데이터 
		
		for(int i=1; i<book.length; i++) { // 나머지 데이터(1234인덱스) 저장
			System.out.print("제목 > ");
			String n = sc.next();
			System.out.print("저자 > ");
			String a = sc.next();
			System.out.print("가격 > ");
			int p = sc.nextInt();
			System.out.print("출간일(년)");
			int y = sc.nextInt();
			System.out.print("출간일(월)");
			int m = sc.nextInt();
			System.out.print("출간일(일)");
			int d = sc.nextInt();
		
			book[i] = new Book(n,a,p, LocalDate.of(y,m,d));
		}		
		File bookfile = new File("books.dat");
		
		try( ObjectOutputStream oos = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream(bookfile))) ){
			 oos.writeObject( book );
			 System.out.println("books.dat 에 저장 완료!");
		}	
		catch ( Exception e ) { 
			e.printStackTrace();
		} 
	}//end-fileSave 메소드
	
	public void fileRead() { //파일 데이터 읽어서 화면에 출력 read = input
	
		File filename = new File("books.dat");
		
		try(ObjectInputStream oi = new ObjectInputStream (new BufferedInputStream( new FileInputStream(filename)))){
			Book[] book = (Book[]) oi.readObject();
			for(int i=0; i<book.length; i++) {
				System.out.println( book[i] );
			}
		System.out.println("books.dat 읽기 완료!");
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}		
	}// end-fileRead 메소드 
	
}

/*
 * Field
~ sc:Scanner    //초기화 객체 생성함
* default 생성자
* Method
+ fileSave():void
>> 구현내용
    1. Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
    2. "books.dat" 파일에 객체 기록 저장함
    3. try with resource 문 사용할 것
    4. "books.dat 에 저장 완료!" 출력
    
    + fileRead():void
    
>>구현내용
    1. Book 객체 배열 선언
    2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
    3. 객체 정보를 화면에 출력함
    4. try with resource 문 사용할 것
    5. "books.dat 읽기 완료!" 출력
    
    //	Object obj = oi.readObject();
	//	Book[] book = ( Book[] )obj; //book배열 객체로 형변환  + 저장 
*/