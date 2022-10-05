package com.sh.io.re;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {

	public static void main(String[] args) { // ★★★★★★다시 - 키보드로 입력받기 
		
		test1 t = new test1();
		    t.fileSave();
		   // t.fileRead();	
	}
	
	public void fileSave() { // ★★ InputStreamReader : 바이트 -> 문자랑 연결 ★★
		
		//1. 키보드로 사용할 파일명을 입력받음 - BufferedReader의 readLine() 사용함
		System.out.print("사용할 파일명을 입력하세요 > ");
		String filename=null;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); //★1.파일이름입력용 
	
		//2. 파일안에 들어갈 내용 (입/출력) 
//		System.out.println("파일에 저장할 내용을 입력하시오.");
		BufferedReader input = null;
		FileWriter fw = null;
		/*** 어디에 이 파일을 저장할거니 ? 써줘야됨
		 * if (!test1.exists())	
		 * 		test1.mkdir();
		 */
		try {			
			filename = br.readLine(); 
			File file = new File ( filename ); // 사용할 파일명 
			
			input = new BufferedReader( new InputStreamReader(System.in)); //★2-1 입력 이거 br로 계속 사용가능??  < 아니 
			fw = new FileWriter( filename ); //★2-2 출력  
			String data;
			
			while( !((data = input.readLine()).equals( "exit"))  ) {   // ※ "exit".equals(data) < 똑같은거임 
				fw.write(data + "\n" );  // ※ fw.write( data + "\n" )  < 위 두문장을 한문장으로 쓰기  
			}
			System.out.println("파일에 성공적으로 저장되었습니다.");	
		} // end-try문 
		
		catch (IOException e) {
			e.printStackTrace();
		}// end - catch문 
		
		finally { //3. 버퍼 다쓰고 닫기용(파일이름지정 & 파일 내용 지정) 
			try {
				fw.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//end - finally (표준 입출력 스트림은 닫아 주지 않아도 된다.)	
	}
	
	public void fileRead() { // FileReader- 문자용 
		
		//1. 키보드로 읽을 대상파일명을 입력받음
		System.out.print("읽어올 파일명을 입력하세요 > ");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		String filename; //파일이름
	
		int data = 0;
		StringBuilder stringbuilder_data = new StringBuilder();//StringBuilder
		
		FileReader FR = null;
		try {
			filename = br.readLine();
			FR = new FileReader(filename); // 파일 읽는거(read) - 파일 읽기용 스트림 객체 생성함			
			
			System.out.println("내용출력 >");
			while( (data = FR.read()) != -1 ) {
				String str = ( (char)data + "" )  ;  
				stringbuilder_data.append( (char)data + "" + "\n" ); // stringbuilder_data.append("\n");
				System.out.print( str.toString() ); //출력 
			}
		}//end-try	

		catch (Exception e) {		
			e.printStackTrace();
		}//end-catch

		finally { //close용 
			try {
				FR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}//end-finally
		
	}
	
}

/*
[실습문제 1]
- 패키지 : com.sh.io.test1
- 클래스 : Test1
   >> main() 포함
       => fileSave() 메소드 실행함
   >> 메소드 추가함
   + fileSave() : void
   => 키보드로 사용할 파일명을 입력받음
       BufferedReader의 readLine() 사용함
   => 파일출력용 스트림 객체 생성함
       FileWriter 사용함
   => 화면에 "파일에 저장할 내용을 입력하시오." 출력
       입력값을 읽어들여서 바로 파일에 기록 저장처리
       반복실행함
   => "exit"가 입력되면, 반복은 종료하고
       화면에 "파일에 성공적으로 저장되었습니다." 출력하고
   => 파일출력 스트림을 닫음.

[실습문제 2]
- 위에서 작성한 클래스에 메소드 추가함
    >> 메소드
   + fileRead() : void
   => 키보드로 읽을 대상파일명을 입력받음
   => 파일 읽기용 스트림 객체 생성함 : FileReader 사용
   => 파일 안의 내용을 읽어서, StringBuilder 에 보관함
   => 다 읽은 다음, StringBuilder 에 보관된 값을 String으로 바꾸어 화면에 출력함
*/