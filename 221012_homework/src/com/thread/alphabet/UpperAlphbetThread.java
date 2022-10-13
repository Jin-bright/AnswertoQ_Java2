package com.thread.alphabet;

public class UpperAlphbetThread implements Runnable{

	//String[] upperalpha = {"A","B","c","D","E","F","G","H","I","J","K","L","M","N",
	//						"O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
	@Override
	public void run() {
		char ch = 'A';
			while(ch<='Z') {
				System.out.println( "대문자 : " +  ch++ );
			}
		System.out.println( Thread.currentThread().getName() + " 출력 끝!" );
	}
}

/* 
 * 선생님 풀이 
 * 
 * for(int i ='A'; i<= 'Z'; i++){
 * 	sysout. (name + " : " + (char)i);
 * }
 * 
 * 
 */


