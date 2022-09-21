package com.sh.oop.emp.run;

import java.util.Scanner;
import com.sh.oop.emp.model.Employee;

public class EmpTest { // 클래스 !!!! 

	
	
	public static void main(String[] args) { //@메인메서드 
		
		Employee t = new Employee(); // Employee 객체 생성 

		EmpTest emp = new EmpTest(); // 동일 클래스 내에 메서드 불러낼려고 생성 객체생성	
		emp.mainPlease(); // 주요 실행 메서드 
		
	}
	
	
	
	public void mainPlease() {  //@mainPlease 메서드 
		
		Scanner sc = new Scanner(System.in);
		
		EmpTest eee = new EmpTest();
		Employee t =  new Employee();
	
		
		//Q. 여기서 while이랑 for 쓰는거랑 차이가 뭐지 ? 
		
		for(;true;) {	
			
				t.mainMenu();
				int choice = sc.nextInt();
				
				switch(choice) {
					case 1 : // 1. 새 사원 정보 입력
						t.empInput();
						System.out.println();
						break;
						

					case 2 ://2. 사원 정보 수정 
						eee.modi(t);
						break;
							
						
						
	/*					
						t.modifyMenu(t);
						System.out.print( "번호를 선택하세요 > ");
						choice = sc.nextInt();
						

							if(choice==1) {
								System.out.print( "이름 : "  );
								t.setEmpName( sc.next());
								break;  // Q. break를 안쓰면 출력이 안됐음. 왜지 ? break가 무슨 저장 기능을 하나.. ?
								}
								
							else if(choice ==2 ) {
								System.out.print( "급여 : "  );
								t.setSalary( sc.nextInt()); 
								break;
								}
							
							else if(choice ==3) {
								System.out.print( "부서 : "  );
								t.setDept( sc.next() );
								break;
							}
							
							else if(choice ==4) {
								System.out.print( "직급 : "  );
								t.setJob( sc.next());
								break;
							}
				
							else if(choice==5) {
								return;
							}
	*/
					case 3 : // 3. 사원 정보 삭제 
			
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
					//	Q. 삭제를 쉽게하는 방법은,,? 뭘까 ? 왜안되지^^

	
					case 4 : // 4. 사원정보 출력 
						t.empOutput();
						System.out.println();
						break;
					
			
					case 9 : // 9. 끝내기 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
						
					default :
						System.out.println("잘못된 번호입니다. ");
						return;
			}//end switch문 
				
		}//end 무한루프for문 
		
	}// if+return 쓰면 메서드 종료되어서 메서드 따로 만들었음

	
	
	
	public void modi(Employee e){ // +++ 사원정보 수정 메뉴 
		
		Scanner sc = new Scanner(System.in);

		Employee t = new Employee();
		
		

		String menu ="********** 사원 정보 수정 메뉴 **********\n"
				+"1. 이름 변경 \n"
				+"2. 급여 변경 \n"
				+"3. 부서 변경 \n"
				+"4. 직급 변경 \n"
				+"5. 이전 메뉴로 이동 \n";

		while(true) {
			System.out.println(menu);
			System.out.print( "번호를 선택하세요 > ");
			int choice = sc.nextInt();

				if(choice==1) {
					System.out.print( "이름 : "  );
					t.setEmpName( sc.next() );
					break;
					 // Q. break를 안쓰면 출력이 안됐음. 왜지 ? break가 무슨 저장 기능을 하나.. ?
					}
					
				else if(choice ==2 ) {
					System.out.print( "급여 : "  );
					t.setSalary( sc.nextInt() ); 
					break;
					}
				
				else if(choice ==3) {
					System.out.print( "부서 : "  );
					t.setDept( sc.next() );
					break;
				}
				
				else if(choice ==4) {
					System.out.print( "직급 : "  );
					t.setJob( sc.next());
					break;
				}
	
				else if(choice==5) {
					return;
				}
				
			}// break를 만들기 위해 while true문을 만듬 .. ?	
			
		
	}
	
	
 } // 클래스 끝

