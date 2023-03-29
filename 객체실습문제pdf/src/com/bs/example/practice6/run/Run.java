package com.bs.example.practice6.run;

import com.bs.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book("그리스로마신화","최주영", "이동제");
		Book b2 = new Book("메이플스토리","최인호","유병승",50000,5.0);
		
		b1.inform();
		System.out.println();
		b2.inform();
		
		
		
	}

}
