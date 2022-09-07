package com.sh.test.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Test2 t = new Test2();
		t.test();
	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 :  ");
		int ko = sc.nextInt(); 
		
		System.out.print("영어 점수 :  ");
		int eng = sc.nextInt();
		
		System.out.print("국어 점수 :  ");
		int math = sc.nextInt();
		
		int sum = (ko + eng + math) ;
		double average = sum/3.0;
		
		if( (ko>=40 && eng>=40 && math>=40) && (average >= 60 ) ) {
			System.out.println("=> 합격 ");
		}
		else {
			System.out.println("=> 불합격 ");
		}
		
	}

	
}

/*
[문제 2] 완료 
- 클래스 : com.sh.test.condition.Test2.java
- 메소드명 : public void test()

    국어(int), 영어(int), 수학(int) 점수를 정수형으로 입력 받아 
    총점(int)과 평균(double)을 계산하고 
    세 과목의 점수와 평균을 가지고 합격여부 처리, 
    세 과목 점수가 각각 40점 이상이면서, 평균이 60점 이상이면 합격,
    아니면 불합격을 출력하는 프로그램을 작성하세요. 

*/
