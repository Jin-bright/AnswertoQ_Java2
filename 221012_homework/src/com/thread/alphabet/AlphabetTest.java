package com.thread.alphabet;

public class AlphabetTest {

	public static void main(String[] args) {	
	
		Thread uppercall = new Thread ( new UpperAlphbetThread(),"대문자출력쓰레드" );
		uppercall.start();
	//	uppercall.setPriority(Thread.MAX_PRIORITY); 
	// 대문자쓰레드를 먼저해라 - 근데 두개밖에 없어서 뒤에는 섞여서 나오나 ?  synchronized로 쓰면 각각나오나 ? 아닌데 객체없어서못씀  
		
		Thread lowercall = new Thread ( new LowerAlphbetThread(),"소문자출력쓰레드" );
		lowercall.start();
	
	}

}
