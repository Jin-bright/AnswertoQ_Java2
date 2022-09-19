package com.sh.oop.emp.run;

import java.util.Scanner;

import com.sh.oop.emp.model.Employee;

public class EmpTest {

	public static void main(String[] args) {
	
		Employee t = new Employee();
		
		Scanner sc = new Scanner(System.in);
		String program = ("******* 사원 정보 관리 프로그램 ************\n"
							+ "1. 새 사원 정보 입력\n"
							+ "2. 사원 정보 삭제\n"
							+ "3. 사원정보 출력\n"
							+ "9. 끝내기\n"
							+ "********************************************\n" );
		for(;true;) {
			
				System.out.println( program );		
				System.out.print( "번호를 선택하세요 > ");
				int choice = sc.nextInt();
				
				switch(choice) {
					case 1 :
						t.empInput();
						System.out.println();
						break;
						//System.out.print( "번호를 선택하세요 > ");
						//choice = sc.nextInt();
		
					case 2 :
						t.setEmpNo(0);
						t.setEmpName(null);
						t.setDept(null);
						t.setJob(null);
						t.setAge(0);
						t.setGender(' ');
						t.setSalary(0);
						t.setBonusPoint(0);
						t.setPhone(null);
						t.setAddress(null);
						System.out.println();
						break;
	
					case 3 :
						t.empOutput();
						System.out.println();
						break;
					
			
					case 9 :
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				
				
					default :
						System.out.println("잘못된 번호입니다. ");
						return;
			}//end switch문 
				
		}//end 무한루프for문 
		
	}	

}
