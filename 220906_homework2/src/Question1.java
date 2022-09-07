
public class Question1 {

	public static void main(String[] args) { // 실습문제 1  
	    
/* @ 실습문제 1 
 1. 연산자 우선순위를 괄호로 표현하기  - 문제 & 내 답 		
 
 문제
	1. x = 3 + 4 + 5 ;
	=> x = ((3 + 4 ) + 5) ;
	
	2. x = y = z;
	=> ((x = y) = z) 땡 !!! 
	==> (x = (y = z))
	
	3. z *= ++y + 5; 
	답1 => z *= (++y + 5) 
	답2 => z = ( z * (++y + 5) )
	==> 더 정확하게는  z *= ( (++y) + 5)  

	4. a || b && c || d; 
	=> ((a ||(b && c)) || d )
		
 2. 처리과정을 표현하기  - 문제 & 내 답 
 * 예 : 
    (1 < 2 || 3 != 3) =>
    (true || (3 != 3)) =>
    (true) =>
    true


문제

    1. (true && true) || false
    => (true)  || false  //  뒤에연산x
    =>  true
     
    2. (false && true) || true
    => (false) || true // 뒤에 연산x) 
    => true
    
    3. (false && true) || false || true
    => (false) || false || true
    => false || true 
    => true
    
    4. (5 > 6 || 4 > 3) && (7 > 8)
    => ( false || true )&& (7 > 8)
    => true && false
    => false
    
    5. !(7 > 6 || 3 > 4)
    => true // 뒤에연산x
    => !(true)
    => false

		
 */
		

	// 3. z *= ++y + 5; 헷갈리는 걸 실제 값을 대입해서 해보자 
		int y = 10;
		int z = 20;
		int w = (z *= ++y + 5);
		//    20 *(11 + 5) 
		// => 20 * 16
		// => 320
		// 이 값이 w 
		
		System.out.println( w );
		

		

	}

}