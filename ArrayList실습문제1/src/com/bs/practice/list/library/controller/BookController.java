package com.bs.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bs.practice.list.library.model.vo.Book;

public class BookController {

	private List bookList = new ArrayList();

	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}

	public void insertBook(Book bk) {
		bookList.add(bk);
	}

	
	public ArrayList selectList() {
		return (ArrayList) bookList;
	}
	

	public ArrayList searchBook(String keyword) {
		ArrayList al = new ArrayList();

		for (int i=0; i < bookList.size(); i++) {
			Book b=(Book)bookList.get(i);
			
			if (b.getTitle().contains(keyword)) {
				al.add(new Book(b.getTitle(), b.getAuthor(), b.getCategory(), b.getPrice()));
			}
		}
		return al;
	}
	
	
	
	public Book deleteBook(String title, String author){
		Book removeBook = null;
		
		for(int i=0; i<bookList.size(); i++) {
			Book b = (Book)bookList.get(i);
			if((b.getTitle().equals(title)) && (b.getAuthor().equals(author))) {

				removeBook = new Book(b.getTitle(),b.getAuthor()
						,b.getCategory(),b.getPrice());
				bookList.remove(i);
				break;
			}
		}	
		return removeBook;
	}

	
	
	public int ascBook() {
//		Collections.sort(bookList);
			 bookList.sort(new Comparator() {
				@Override
				public int compare(Object o, Object o1) {
						Book prev = (Book)o;
						Book next = (Book)o1;
						
						return prev.getTitle().compareTo(next.getTitle()); 
				}
			});	
			return 1;
	}
	
	
	
}
