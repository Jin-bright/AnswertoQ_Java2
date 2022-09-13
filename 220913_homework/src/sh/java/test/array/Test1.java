package sh.java.test.array;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
		

	}
	
	public void test() { // [문제1]
		
		int[] arr = new int [100];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1);
		}
		
		for(int arr_hunred : arr) {
			System.out.println( arr_hunred );
		}
		
	}

}

/*
<배열 실습문제>

[문제1]
- 클래스 : sh.java.test.array.Test1.java
- 메소드명 : public void test()

    길이가 100인 배열을 선언하고 1부터 100까지의 값을 순서대로 배열 인덱스에 넣어 그 값을 출력하는 코드를 작성하시오.

*/

