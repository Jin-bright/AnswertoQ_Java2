package sh.java.test.array;

public class Test2 {

	public static void main(String[] args) {// [문제2] 
		
		Test2 t = new Test2();
		t.test();

	}

	public void test() {
		
		String[] fruit = new String[5]; // 길이가 5인 String 배열을 선언 
		
		fruit[0] = "딸기";
		fruit[1] = "복숭아";
		fruit[2] = "키위";
		fruit[3] = "사과";
		fruit[4] = "바나나";   // 초기화 
		
		System.out.println( fruit[4]);
	}
	
	
}

/*

[문제2]
- 클래스 : sh.java.test.array.Test2.java
- 메소드명 : public void test()

    길이가 5인 String 배열을 선언하고, 
    “딸기”, ”복숭아”, ”키위”, ”사과” , ”바나나” 로 초기화를 한 후, 
    배열 인덱스를 활용해서 바나나를 출력해 보세요

*/