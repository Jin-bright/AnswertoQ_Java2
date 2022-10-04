import java.io.*;   /// 코드 줄여봄

public class test1_ree {

	public static void main(String[] args) { // ★★★★★★다시 - 키보드로 입력받기 
		
		test1_ree t = new test1_ree();
			  t.fileSave();
		   // t.fileRead();	
	}
	
	public void fileSave() { 
		
		//1. 키보드로 사용할 파일명을 입력받음 - BufferedReader의 readLine() 사용함
		System.out.print("사용할 파일명을 입력하세요 > ");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); //★1.파일이름입력
		
		//2. 파일안에 들어갈 내용 (입/출력) 
	//	System.out.println("파일에 저장할 내용을 입력하시오.");
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in)); //★2-1 입력
		FileWriter fw = null;
		
		try {
			File file = new File ( br.readLine()); // 사용할 파일명 (입력받기)
		//	BufferedReader input = new BufferedReader( new InputStreamReader(System.in)); //★2-1 입력 
			fw = new FileWriter( file ); //★2-2 출력 
			String data;
			
			while( !(( data = input.readLine()).equals( "exit"))  ) {
				fw.write(data);
				fw.write("\n");
			}
			System.out.println("파일에 성공적으로 저장되었습니다.");	
		} // end-try문 
		
		catch (Exception e) {
			e.printStackTrace();
		}// end - catch문 
		
		finally { //3. 버퍼 다쓰고 닫기용(파일이름지정 & 파일 내용 지정) 
			try {
				fw.close(); 
			} catch ( Exception e) {
				e.printStackTrace();
			}
		}//end - finally (표준 입출력 스트림은 닫아 주지 않아도 된다.)	
	}
	
	public void fileRead() { // FileReader + try resource 시도 
		
		//1. 키보드로 읽을 대상파일명을 입력받음
		System.out.print("읽어올 파일명을 입력하세요 > ");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
	
		StringBuilder stringbuilder_data = new StringBuilder(); //StringBuilder
		
		int data = 0; //filereader - read int타입 으로 반환 
	
		try ( FileReader FR = new FileReader( br.readLine()); ) { //try resource 					
			System.out.println("내용출력 >");
			while( (data = FR.read()) != -1 ) {
				stringbuilder_data.append( (char)data + "" ); // stringbuilder_data.append("\n");
			}
			System.out.print( stringbuilder_data.toString() ); //출력 
		}//end-try	

		catch (Exception e) {		
			e.printStackTrace();
		}//end-catch

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