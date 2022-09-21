package com.sh.oop.method;

public class Test {

	   int a = 100; // iv 
       static int s = 99; // cv 
       
       public static void main(String[] args) {
           Test t = new Test(); //객체 생성 
           t.test1(); // 1번쨰로 출력됨 
           
           t.test2(); // 2번쨰로 출력됨 
           
           Test t3 = new Test(); 
           t.test3(t3); // 3번쨰로 출력됨 
           System.out.println(t3.a); // 5번째로 출력값 : 200 아닌가 .. ? 10..?인가  ?<  test3의 메서드의 a 값은  t.a ?
           
           
     
               
       }

       public void test1() { // 그냥 인스턴스 메서드 
           int a = 1000;
           int s = 999;
           System.out.println(this.a);  // 1번째 출력값  : 100
           
           System.out.println(Test.s);    // 2번째로 출력값 : 99
           
       }

       public void test2() {
           Test t = new Test();
           t.a = 1000;
           System.out.println(a);   // 3번째로 출력값 : 100
           
       }

       public void test3(Test t) {  // Test타입의 t라는 매개변수를 받는다 
           t.a = 10;
           this.a = 200;
           System.out.println(t.a);  // 4번째로 출력값 : 10
           
       }
       


   }
/*
 * 
[필드실습문제]
@com.sh.oop.method.Test

다음 코드에서 각 출력문에 찍히게 될 값을 주석으로 작성하고, 실제 코드로 작성후 확인하세요.

*/

