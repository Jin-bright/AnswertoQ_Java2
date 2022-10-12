package com.sh.collection.map.book.model.compare;

import java.util.Comparator;

import com.sh.collection.map.book.model.vo.Book;

public class AscCategory implements Comparator <Book>{ // comparator + compare 매개변수 2개 비교 

	
	// 카테고리 기준 오름차순 정렬용

	@Override
	public int compare(Book o1, Book o2) {
		return (o1.getCategory() - o2.getCategory());
	}
	
	

}
