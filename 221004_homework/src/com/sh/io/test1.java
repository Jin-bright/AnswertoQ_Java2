package com.sh.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) { 
	
		test1 t = new test1();
	//	t.filesave();
		t.fileRead();
	}
	

	public void filesave() {
		
		//키보드로 사용할 파일명을 입력받음 (try resource,, ) --- 파일명 일단 키보드 아니고 내가 지정 
		try ( BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
			  BufferedWriter  bw = new BufferedWriter( new FileWriter("copyFile"));) {
			
				System.out.println("파일에 저장할 내용을 입력하시오." );
				String data = null;
				
			while( !((data = br.readLine()).equals("exit") ) ) {
				//br.readLine(); // br에 쓴거를 읽어온다 ? 		 
				bw.write( data ); // data를 적는다 
				bw.write("\n");
				System.out.println( data );
			}
			System.out.println("파일에 성공적으로 저장되었습니다." );
		} // end-try문
				
		catch ( Exception e) {
			e.printStackTrace();
		} // end - catch문 
		
	}
	
	
	public void fileRead() {

		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("copyFile"));
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String data = null;
		StringBuilder copyFileSB = new StringBuilder();
		
		try {
			while( (data=br.readLine()) != null) {
				copyFileSB.append(data) ;
				copyFileSB.append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println( copyFileSB.toString() );
		
	}
}

 
/*[실습문제 1]
- 패키지 : com.sh.io.test1
- 클래스 : Test1
   >> main() 포함   => fileSave() 메소드 실행함

   >> 메소드 추가함
   + fileSave() : void
   => 키보드로 사용할 파일명을 입력받음
       BufferedReader의 readLine() 사용함  => 문자 기반 
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