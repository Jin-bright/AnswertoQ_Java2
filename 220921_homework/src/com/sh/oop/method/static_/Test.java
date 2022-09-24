package com.sh.oop.method.static_;

public class Test {

	   int a = 200;
       static int s = 24;
       
       public static void main(String[] args) {
           Test t = new Test(); 
           t.test1(); 
           
           Test t2 = new Test();
           t2.test2();
           
           
           Test t3 = new Test(); 
           t.test3(t3); 

           System.out.println(  + t.a);
       }

       
       public void test1() { 
           int a = 12;  
           int s = 155;
           this.a = 19;
           
           System.out.println("정답은  : 19 => " + this.a);  // 19 
 
          System.out.println(" 정답은 24 : => " +  Test.s);    
          System.out.println(" 정답은  24 : => " + this.s );
          System.out.println(" 정답은  12(아무것도 안붙은 a는 가까운거 가리키는거아닌가?) : " +  a ); 
 
       
       }

       
       public void test2() {
    	   
           Test t = new Test();
           t.a = 12; 
           
          System.out.println(" 정답은 200(가까운게 200) : =>  " + a); // ★★★★★   
          System.out.println(" 정답은   12 : => " + t.a ); //★★★★★
          System.out.println(" 정답은 200 : => " + this.a); // ★★★★★ 
           
           
           
       }

       public void test3(Test t) { 
    	   Test t2 = new Test();
    	   
           t2.a = 100; 
           this.a = 10;
           
           System.out.println( " 정답은 : 200 => iv " + t.a); 
           System.out.println( " 정답은 : 10 "  + this.a );///
           System.out.println( " 정답은 : 10 "  +  a ); 
       }
       


   }
/*
 * 
[필드실습문제]
@com.sh.oop.method.Test

다음 코드에서 각 출력문에 찍히게 될 값을 주석으로 작성하고, 실제 코드로 작성후 확인하세요.

*/


/* 
 * 
 * this.a는 200! => 200
Test.s는 24! => 24
여기 객체없으니까 this.s는 24! => 24
가까이 있는 a 100! => 100
여기서는 멀리있는 a 200! => 200
정의되어있으니까 123 ! => 123
this.a도 똑같이 객체 있으니까 123 아닐까 ?! => 200 		-------------> 틀림 !!!!!!!!!!!
t.a는 정의되어 있으니까 10000 10000
this.a도 정의되어 있으니까 1220 ? 근데 객체가 없는데 가능 ?!1220
여기는 test3()의 a 10000  > 10000
여기 a는 200 > 1220  								-------------> 틀림 !!!!!!!!!!!
여기 s는 test3의 s인데ㅡ 없어 그래서 원래 s인 24 24
 여기는 10000 >>> 1220 							-------------> 틀림 !!!!!!!!!!!
 
 
 /*
  * 
  * 
  * 
  * 
  * 정답은 200 : 200
 정답은 24 : 24
 정답은 24 : 24
 정답은 100 : 100
 정답은 123  : 200
 정답은 123  : 123
 정답은 200  : 200
 정답은 10000 : 10000
 정답은 1220 :  1220
 정답은  10000 :  1220
정답은 1220 : 1220


  */

