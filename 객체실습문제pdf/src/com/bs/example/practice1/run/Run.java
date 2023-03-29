package com.bs.example.practice1.run;
import com.bs.example.practice1.model.vo.Member;
public class Run {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.changeName("최주영ㅋ");
		member.printName();
	}

}
