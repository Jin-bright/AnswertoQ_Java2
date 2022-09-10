package com.sh.test.condition;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) { // 문제10 
		
		Test10 t = new Test10();
		t.test();
	}
	
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade;
		
		
		if(score>100 || score<0) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		if(score>=90) {
			grade = '수';
		}
		else if(score>=80) {
			grade ='우';
		}
		else if(score>=70) {
			grade ='미';
		}
		else if(score>=80) {
			grade ='양';
		}
		else
			grade ='가';
		
		System.out.printf("%d점은 %c입니다.", score, grade);
	}

}

/*
[문제 10]
- 클래스 : com.sh.test.condition.Test10.java
- 메소드명 : public void test()

    사용자로부터 점수를 입력 받고 등급을 출력하는 프로그램을 작성하시오.
         
    100~90은 수,
    89~80는 우,
    79~70은 미,
    69~60은 양,
    나머지는 가로 처리하세요.

    예 )점수입력 : 95 
        95점은  수입니다.
*/