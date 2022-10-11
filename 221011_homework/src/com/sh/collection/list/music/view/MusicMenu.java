package com.sh.collection.list.music.view;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.sh.collection.list.music.controller.MusicManager;
import com.sh.collection.list.music.model.vo.Music;

public class MusicMenu {

	MusicManager manager = new MusicManager();
	Scanner sc = new Scanner(System.in);
	
	public void musicmenu() {
		
		String menu = ("================ Music Playlist Menu ================\n"
				+ "1.목록보기\n"
				+ "2.마지막에 음악추가\n"
				+ "3.맨처음에 음악추가\n"
				+ "4.곡삭제\n"
				+ "5.곡변경\n"
				+ "6.곡명검색\n"
				+ "7.가수검색\n"
				+ "8.목록정렬(곡명오름차순)\n"
				+ "0.종료\n"
				+ "================================================================\n"
				+ ">> 메뉴선택 : ");
		
		String listmenu = ("================== 정렬 메뉴 ===================\n"
				+ "1. 가수명 오름차순\n"
				+ "2. 가수명 내림차순\n"
				+ "3. 곡명 오름차순\n"
				+ "4. 곡명 내림차순\n"
				+ "5. 메인메뉴 돌아가기\n"
				+ "================================================\n"
				+ ">> 메뉴선택 : "); 

		MainmenuLoop : //라벨링
		while (true) {
			
			System.out.print( menu );
			int a = sc.nextInt();
			
			switch(a) {
				case 1:
					System.out.println( printList() );
					break;
				case 2: 
					manager.addList( inputMusic() );					
					break;
				case 3:
					manager.addAtZero( inputMusic() );
					break;
				case 4:
					System.out.println( manager.removeMusic( deleteMusic() ));
					break;
				case 5:
					System.out.println(manager.replaceMusic(changeMusic(), inputMusic()));
					break;
				case 6:
					System.out.println(manager.searchMusicByTitle(inputTitle()));
					break;	
				case 7:
					System.out.println(manager.searchMusicBySinger(inputSinger()));
					break;
				case 8:
					SecondList : //라벨링
					for(;;) {
						System.out.print( listmenu );
						Scanner sc = new Scanner(System.in);
						int choice = sc.nextInt(); 
						switch(choice) {
						
							case 1 :
								System.out.println("1.가수명 오름차순");
								manager.orderBy(comparatorSignerAsc);
								System.out.println(manager.mlist );
								break;

							case 2 :
								System.out.println("2.가수명 내림차순");
								manager.orderBy(comparatorSignerDesc);
								System.out.println(manager.mlist );
								break;
								
							case 3 :
								System.out.println("3.곡명 오름차순");
								manager.orderBy( comparatorTitleAsc );
								System.out.println( manager.mlist );//목록바로 호출 
								break;
							case 4 :								
								System.out.println("4.곡명 내림차순");
								manager.orderBy( comparatorTitleDesc );
								System.out.println( manager.mlist );//목록바로 호출 
								break;
								
							case 5 :
								break SecondList;
						}
					}	
					
			case 0:
				System.out.println("End PlayList");
				break MainmenuLoop;
			}	
		}
	}

	public List<Music> printList() {

		return manager.mlist;
		
	}

	public Music inputMusic() {//2,3 음악추가 전용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("추가할 노래 제목을 입력하세요 > ");
		String mtitle = sc.nextLine();
		
		System.out.print("추가할 노래 가수를 입력하세요 > ");
		String msinger = sc.nextLine();

		return new Music( mtitle, msinger);		
	}
	
	public String deleteMusic() { //4번 곡삭제 전용 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 노래의 제목을 입력하세요 > ");
		String mtitle = sc.nextLine();
		
		return mtitle;
	}
	
	public Music changeMusic() { // 5 - 변경할 노래 전용 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 노래 제목을 입력하세요 > ");
		String chtitle = sc.nextLine();
		
		System.out.print("변경할 노래 가수를 입력하세요 > ");
		String chsinger = sc.nextLine();
		
		return new Music(chtitle, chsinger);
		
	}
	
	public String inputTitle () { // 6.곡명검색 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 노래 제목을 입력하세요 > ");
		String searchtitle = sc.nextLine();
		
		return searchtitle;
	}
	
	public String inputSinger() { // 7.가수검색
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 가수를 입력하세요 > ");
		String searchSingers = sc.nextLine();
		
		return searchSingers;
	}
	
	
	 Comparator <Music> comparatorSignerAsc = new Comparator <Music>() {
		 
		@Override
		public int compare(Music o1, Music o2) { //+ Comparator
			 return o1.getSinger().compareToIgnoreCase( o2.getSinger() );
		 }	 
	 };//comparator - singer오름차순 
	 
	 Comparator <Music> comparatorSignerDesc = new Comparator <Music>() {
		 
		@Override
		public int compare(Music o1, Music o2) { //+ Comparator
			 return o2.getSinger().compareToIgnoreCase( o1.getSinger() );
		 }	 
	 };//comparator - singer내림차순 
	 
	 
	 Comparator <Music> comparatorTitleAsc = new Comparator <Music>() {
		 
			@Override
			public int compare(Music o1, Music o2) { //+ Comparator
				 return o1.getTitle().compareToIgnoreCase( o2.getTitle() );
			 }	 
	 };//comparator - title 오름차순 
	
	 
	 Comparator <Music> comparatorTitleDesc = new Comparator <Music>() {
		 
			@Override
			public int compare(Music o1, Music o2) { //+ Comparator
				 return o2.getTitle().compareToIgnoreCase( o1.getTitle() );
			 }	 
	 };//comparator - title 내림차순  

}

/*
 
# 3. 메뉴클래스
@com.sh.collection.list.music.view.MusicMenu.java
* 다음메뉴를 반복적으로 출력하고, 사용자선택값에 따라 적절한 컨트롤클래스 MusicManager객체의 메소드를 호출할 것.
* 필요한 사용자 입력값(곡명/가수명/Music객체정보)은 MusicMenu클래스에서 작성후 Manager객체로 전달함.

-sc:Scanner
-manager:MusicManager

    ================ Music Playlist Menu ================
    1.목록보기
    2.마지막에 음악추가
    3.맨처음에 음악추가
    4.곡삭제
    5.곡변경
    6.곡명검색
    7.가수검색
    8.목록정렬(곡명오름차순)
    0.종료
    ================================================================
    >> 메뉴선택 : 
    
정렬 메뉴
-각 Comparator객체를 생성해 manager객체의 orderBy(Comparator)메소드 호출할 것.

    ================== 정렬 메뉴 ===================
	1. 가수명 오름차순
	2. 가수명 내림차순
	3. 곡명 오름차순
	4. 곡명 내림차순
	5. 메인메뉴 돌아가기
	================================================

a. 리스트 출력메소드
+ printList(List<Music>) : void

b. 곡명 입력메소드 oo
+ inputTitle() : String

c. 가수 입력메소드 oo
+ inputSinger() : String

d. 음악 입력메소드(곡명, 가수 모두 입력) oo
+ inputMusic() : Music

*/