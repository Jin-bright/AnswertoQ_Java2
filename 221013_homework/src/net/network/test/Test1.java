package net.network.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("호스트명 또는 도메인명을 입력하세요 > ");
		
		String puthostordomain = sc.nextLine();

		try  { 
			InetAddress[] hostordomain = InetAddress.getAllByName(puthostordomain);
			for(int i=0; i<hostordomain.length; i++) {		
				System.out.println( "ip주소 : " + hostordomain[i].getHostAddress()  );
			}	
		}	
		catch (UnknownHostException e) {
			System.out.println("반환된 ip주소가 없습니다!");
		//	e.printStackTrace();
		} 
	}
}

// Q. Scanner 써써 URL클래스로도 받을 수 있나 ?
// Q. 호스트명이랑 도메인명이랑 무슨차이지 ? 따로 인식할 수 있나 ? 

/*
<네트워크 실습>

- 패키지명 : net.network.test

[문제 1]
- 클래스명 : Test1
- main() 포함
- 구현내용 : 
   => 키보드로 호스트명 또는 도메인명을 입력받는다.
   => 입력받은 호스트명을 가지고, ip 주소를 조회해서 출력한다.
   => 출력시 호스트명과 ip 주소를 분리해서, ip 주소만 출력되게 함
   => 조회한 ip 갯수가 1개 이상이면 루프문으로 모두 출력함
   => 예외처리는 try~catch로 직접 처리함

*/