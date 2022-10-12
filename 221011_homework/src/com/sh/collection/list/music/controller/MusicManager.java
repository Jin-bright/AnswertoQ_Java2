package com.sh.collection.list.music.controller;
/**
 * < controller >
 * 데이터를 관리하는 클래스 
 * 
 */
import java.util.*;
import com.sh.collection.list.music.model.vo.Music;

public class MusicManager {

	public List<Music> mlist = new ArrayList<>();
	
	{
		mlist.add( new Music("Save me", "BTS"));
		mlist.add( new Music("Utopia", "BTS"));
		mlist.add( new Music("Fake love", "BTS"));
		mlist.add( new Music("Lost stars", "Adam"));
		mlist.add( new Music("City of Stars", "Ryan Gosling, Emma Stone"));	
		
	}
	
	public List<Music> selectList(){ // 1 목록보기 - 음악리스트 리턴
		return mlist;
	}
	
	public void addList(Music m) { //2. 마지막에 음악추가 
		mlist.add(m);
	}

	public void addAtZero(Music m) {	//3. 맨처음에 음악추가
		mlist.add(0, m);;
	}
	
	public boolean removeMusic(String mtitle) { // 4. 특정곡을 삭제하는 메소드
	
		for( int i=0; i<mlist.size();i++) {
			if ( ((mlist.get(i)).getTitle()).equals(mtitle)) {
				mlist.remove(i);
				//동일한 요소를 제거한다 mlist.remove(mlist.get(i))
				return true;
			}
		}
		return false;
	}	
	
	 public boolean replaceMusic(Music oldMusic, Music newMusic) {//5. 특정곡을 바꾸는 메소드
		 
		 //int index = 0; 
		 for( int i=0; i<mlist.size(); i++) {
			//	if ( ((mlist.get(i)).getTitle()).equals(oldMusic.getTitle()) 
			//			&& ((mlist.get(i)).getSinger()).equals(oldMusic.getSinger()) ) {
				if( oldMusic.equals(mlist.get(i)) ) { // 이게 맞게될려면 music에 equals랑 해야되나 ? 
			 
					//index = i;
				//	mlist.set(index, newMusic);
					mlist.set(i,newMusic );
				}
				return true;
		 }
		 return false;
	 }
	 
	 public List<Music> searchMusicByTitle(String title){ // 6. 특정곡이 있는지 검사하는 메소드
		 List<Music> listsamesong = new ArrayList<>();
		 for(int i=0; i<mlist.size(); i++) { //대소문자구분x
			 if (((mlist.get(i)).getTitle()).toLowerCase().contains(title.toLowerCase())) {
				 listsamesong.add(new Music( (mlist.get(i)).getTitle(), (mlist.get(i)).getSinger() ));
			 }
		 }
		 return listsamesong; 
	 }
	 
	 public List<Music> searchMusicBySinger(String singer){ // 7. 가수명으로 검색 메소드
		 List<Music> listsamesinger = new ArrayList<>();
		 for(int i=0; i<mlist.size(); i++) { // 대소문자구분x
			 if (((mlist.get(i)).getSinger()).toLowerCase().contains(singer.toLowerCase())) {
				 listsamesinger.add(new Music( (mlist.get(i)).getTitle(), (mlist.get(i)).getSinger() ));
			 }
		 }
		 return listsamesinger; 
	 }
	 
	
	 public List<Music> orderBy (Comparator<Music> c) { // ★정렬용 Comparator + compare (o1, o2) 이렇게 
		 Collections.sort(mlist, c);//정렬
		 return mlist;
	 }
	 
}


/*
# 4. 컨트롤러 클래스 MusicManager
패키지 com.sh.collection.list.music.controller
-musicList:ArrayList<Music> => 초기화블럭을 사용하여 5곡을 미리 만들어두기

구현할 메소드는 다음과 같다.
--------------------------------------------------------------------
1. 음악리스트 리턴
+ selectList():List<Music>

2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
+ addList(Music) : void

3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
+ addAtZero(Music) : void

4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
	삭제여부를 리턴
+ removeMusic(String) : boolean

5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
	교체 성공여부를 리턴
+ boolean replaceMusic(Music oldMusic, Music newMusic) : boolean

6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
(곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
+ searchMusicByTitle(String title) : List<Music>

7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
+ searchMusicBySinger(String singer) : List<Music>

8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
+ orderBy(Comparator<Music> c) : List<Musice>
*/