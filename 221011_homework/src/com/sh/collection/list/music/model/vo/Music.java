package com.sh.collection.list.music.model.vo;

import java.util.Objects;

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
		//return " (title = " + title + ", singer = " + singer +")\n";
		return this.title + "\t\t" + this.singer;
	}

	@Override
	public int compareTo(Music o) {
		return (this.singer.compareTo(o.singer));
	}

	
	// 동일한 음악찾을 때 equals 랑 hashcode가 같아야되는데 나는 그거 안만들었음 ★★★★ 
	
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	
	

	
	
	
}

/*

# 1. vo클래스 작성
@com.sh.collection.list.music.model.vo.Music.java
-title:String
-singer:String

getter/setter, 기본생성자/파라미터있는생성자, toString 오버라이드
*/
