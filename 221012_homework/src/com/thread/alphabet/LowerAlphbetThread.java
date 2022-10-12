package com.thread.alphabet;

public class LowerAlphbetThread implements Runnable {

	@Override
	public void run() {
		char ch = 'a';
			while(ch<='z') {
				System.out.println( "소문자 : " +  ch++ );
			}
		System.out.println( Thread.currentThread().getName() + " 출력 끝!" );
	}	
}
