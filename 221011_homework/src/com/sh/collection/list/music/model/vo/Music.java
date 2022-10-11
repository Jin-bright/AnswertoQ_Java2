package com.sh.collection.list.music.model.vo;

public class Music implements Comparable<Music>  {

	private String title;
	private String singer;
	
	//기본생성자
	public Music() {
		super();
	}
	
	//매개변수생성자 
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	// get set 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}

	
	@Override
	public String toString() {
		return " (title = " + title + ", singer = " + singer +")\n";
	}

	@Override
	public int compareTo(Music o) {
		return (this.singer.compareTo(o.singer));
	}
	
}

/*

# 1. vo클래스 작성
@com.sh.collection.list.music.model.vo.Music.java
-title:String
-singer:String

getter/setter, 기본생성자/파라미터있는생성자, toString 오버라이드
*/
