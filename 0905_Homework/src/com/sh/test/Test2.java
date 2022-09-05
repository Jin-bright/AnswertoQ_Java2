package com.sh.test;

public class Test2 {

	public static void main(String[] args) {
					
		Test2 program = new Test2();
		program.info();
				
		}

		public void info() {
			//1.선언
			String name;
			int age;
			String gender;
			String phoneNum;
			String email;
			String add;
			//2.값대입
			name = "김혜진";
			age =  29;
			gender =  "여";
			phoneNum= "01033333333";
			email = "ggg@gmail.com";
			add = "경기도 광주시";
			
			//3.출력
			System.out.println("=====================================================================");
			System.out.printf("%5s%5s%5s%12s%15s%15s%n", "이름","나이","성별","전화번호","이메일","주소" );
			System.out.println("=====================================================================");
			System.out.printf("%5s%5d%5s%15s%20s%15s%n", name, age,gender, phoneNum, email, add);
			//2-2) 다른 값 대입
			name = "김진";
			age = 29+1;
			gender = "남";
			phoneNum = "01022223333";
			email = "gghhhh@gmail.com";
			add = "전라도 광주시";
			
			//3-2) 출력
			System.out.printf("%5s%5d%5s%15s%20s%15s%n", name, age,gender, phoneNum, email, add);

			
		}
		
	}

	/* 문제 2
	2. 자신의 신상정보를 저장할 변수를 만들고 정보를 변수에 대입, 출력하는 프로그램을 작성하세요.
	(System.out.printf 사용할것.)
	     - 이름, 나이, 성별,주소, 전화번호, 이메일      

	=======================================================================
	이름        나이    성별       전화번호            이메일            주소
	=======================================================================
	홍길동        22        남        01012341234       hgd@naver.com    경기도 광주시
	홍길순        20        여        010123412341   hgs@gmail.com    전라남도 광주시                            

	작성한 변수를 재사용해 팀메이트의 정보를 다시 변수에 대입 출력하는 프로그램으로 수정하세요.


	com.sh.test.Test2 에 작성
	*/


