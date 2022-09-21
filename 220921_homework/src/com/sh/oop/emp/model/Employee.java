package com.sh.oop.emp.model;

import java.util.Scanner;

import com.sh.oop.emp.run.EmpTest;

public class Employee { //private + field 선언 

	
	private int empNo;
	private String empName;
	private String dept;
	private String  job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address; 
 
	
	public void mainMenu(){ // +++ 메인메뉴 메서드
		
		String program = ("******* 사원 정보 관리 프로그램 ************\n"
				+ "1. 새 사원 정보 입력\n"
				+ "2. 사원 정보 수정\n"
				+ "3. 사원 정보 삭제\n"
				+ "4. 사원정보 출력\n"
				+ "9. 끝내기\n"
				+ "********************************************\n"	
				+ "선택하세요 => ");
		
		System.out.print( program );
		
	}

	
	public void empInput() { // 1. 키보드입력용 메소드 : empInput()
	
		Scanner sc2 = new Scanner (System.in);
			
		System.out.print("사번 : ");
		setEmpNo(sc2.nextInt());
		
		System.out.print("이름 : ");
		setEmpName( sc2.next() );
		
		System.out.print("소속부서 : ");
		setDept( sc2.next() );
		
		System.out.print("직급 : ");
		setJob( sc2.next() );
		
		System.out.print("나이 : ");
		setAge( sc2.nextInt() );
		
		System.out.print("성별 : ");
		setGender( sc2.next().charAt(0) );
		
		System.out.print("급여 : ");
		setSalary( sc2.nextInt() );
		
		System.out.print("보너스포인트 : ");
		setBonusPoint( sc2.nextDouble() );
		
		System.out.print("핸드폰 : ");
		sc2.nextLine();
		setPhone( sc2.nextLine() );
		
		System.out.print("주소 : ");
		setAddress( sc2.nextLine() );	
	
 	}
	
	public void empOutput() { //2. emp객체 모든 필드 출력용 메소드 : empOutput()
			
		System.out.println( "사번 : "   	+ getEmpNo()  );	
		System.out.println( "이름 : " + getEmpName() );
		System.out.println("소속부서 : " 	+ getDept() );
		System.out.println("직급 : " 	  	+ getJob() );
		System.out.println("나이 : "    	+ getAge());
		System.out.println("성별 : "    	+ getGender() );
		System.out.println("급여 : "    	+ getSalary() );
		System.out.println("보너스포인트 : "+ getBonusPoint() );
		System.out.println("핸드폰 : " 	+ getPhone() );
		System.out.println("주소 : " 		+ getAddress() );
	
	}
	
    //3. getter/setter메소드
	//1)  getter/setter메소드
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpNo() {
		return this.empNo;
	}
	
	//2)  getter/setter메소드 - empName 
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return this.empName;
	}
	
	//3)  getter/setter메소드 - dept 
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return this.dept;
	}
	
	//4)  getter/setter메소드 - job 
	public void setJob(String job) {
		this.job = job;
	}
	public String getJob() {
		return this.job;
	}
	
	//5)  getter/setter메소드 - age
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	//6)  getter/setter메소드 - gender 
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return this.gender;
	}
	
	//7)  getter/setter메소드 - salary 
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	//8)  getter/setter메소드 - bonusPoint 
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusPoint() {
		return this.bonusPoint;
	}
	
	//9)  getter/setter메소드 - phone 
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return this.phone;
	}
	
	//10)  getter/setter메소드 - address 
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	
	
}

 
/*
<객체실습>
클래스명 : com.sh.oop.emp.model.Employee

    - 사원정보 관리용 클래스
    - Field 작성 : 캡슐화 반드시 적용함

 	사번 : - empNo:int
    이름 : - empName:String
    소속부서 : - dept:String
    직급 : - job:String
    나이 : - age:int
    성별 : - gender:char
    급여 : - salary:int
    보너스포인트 : - bonusPoint:double
    핸드폰 : - phone:String
    주소 : - address:String
    
    
Employee 클래스의 메소드 작성
1. 키보드입력용 메소드 : empInput()
2. emp객체 모든 필드 출력용 메소드 : empOutput()
3. getter/setter메소드

* 실행용 클래스 : com.sh.oop.emp.run.EmpTest
메뉴작성 : 메소드 작성

=>메뉴 화면의 예
public void mainMenu(){}
******* 사원 정보 관리 프로그램 ************

    1. 새 사원 정보 입력  => empInput() 메소드 실행
    2. 사원 정보 삭제 => 사원객체 참조변수에 null대입할  것.
    3. 사원정보 출력 =>  empOutput() 메소드 실행
    9. 끝내기
********************************************
*/



/*
 * 2022 09 21 실습문제 
<객체실습>

=>메뉴 화면의 예
public void mainMenu(){}
******* 사원 정보 관리 프로그램 ************

    1. 새 사원 정보 입력  => empInput() 메소드 실행
    2. 사원 정보 수정 => 부메뉴 나타남
    3. 사원 정보 삭제
    4. 사원정보 출력 =>  empOutput() 메소드 실행
    9. 끝내기
********************************************


public void modifyMenu(Employee e){
    //setter 이용해서 키보드로 입력받은 값 객체 필드에 기록
}
********** 사원 정보 수정 메뉴 **********
    1. 이름 변경 => setEmpName()
    2. 급여 변경 => setSalary()
    3. 부서 변경 => setDept()
    4. 직급 변경 => setJob()
    5. 이전 메뉴로 이동 => return 처리할 것
*/
