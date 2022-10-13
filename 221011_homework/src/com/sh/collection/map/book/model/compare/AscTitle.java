package com.sh.collection.map.book.model.compare;

import java.util.Comparator;
import com.sh.collection.map.book.model.vo.Book;

public class AscTitle implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) { // 타이틀 기준 오름차순 정렬 왜안돼 ?????????????
		return (o1.getTitle()).compareTo(o2.getTitle());
	}

}
