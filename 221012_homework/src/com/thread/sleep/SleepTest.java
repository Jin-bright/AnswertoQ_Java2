package com.thread.sleep;

public class SleepTest {

	public static void main(String[] args) {
		SleepTest t = new SleepTest();
		t.sendAphorism();
	}
	
	private void sendAphorism() {
		
		Thread th1 = new Thread( new MyThread(),"명언쓰레드" ); 
		// 매개변수 + new MyThread(3000) 여기쓰는거랑무슨차이지 ?
		
		th1.start();
	}

	class MyThread implements Runnable{ // new thread

		String[] saying = {"No pain, No gain", "Better late than never",
						   "Make it Count",	"필사즉생 필생즉사",
						   "Nothing lasts forever", "You're very much on time",
						   "So what", "끝까지 간다",
						   "No pain,No gain", "Eat,Pray,Love","할수있다"};

	//	public MyThread() {
	//		super();
	//	} 안써도됨

		@Override
		public void run() {
		
			for(int i=0; i<10; i++) {
				int a = (int)(Math.random()*10);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				System.out.printf("[%d번째 명언 출력] : %s%n", i+1 ,saying[a] );
			}
			System.out.println("---- " + Thread.currentThread().getName() + "출력 끝!");
		}

	} // thread클래스 end

}

/*

<문제 1> 
- 실행용클래스 com.thread.sleep.SleepTest
+ sendAphorism() : void 

- 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
- 10번 출력후 종료하세요.

*/
