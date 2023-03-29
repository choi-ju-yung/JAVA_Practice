package com.bs.hw.member.controller;

import com.bs.hw.member.model.vo.Member;

public class MemberController {
	private static final int SIZE = 10; // 상수 선언
	private Member[] m = new Member[SIZE];
	
	
	public int existMemberNum() {  // 현재 존재하는 멤버 수 반환
		for(int i=0; i<m.length; i++) {
			if(m[i] == null) {
				return 10-i;
			}
		}
		return 0;
	}
	
	
	public boolean checkId(String inputId) { // 아이디 중복확인 하는 메소드
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null && m[i].getId().equals(inputId))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public void insertMember(String id, String name, String password,
			String email, char gender, int age) {
		
		for(int i=0; i<m.length; i++) {

			if(m[i] == null ) {
				m[i] = new Member();
				m[i].setId(id);
				m[i].setName(name);
				m[i].setPassword(password);
				m[i].setEmail(email);
				m[i].setGender(gender);
				m[i].setAge(age);
				break;
			}
		}
	}
	
	
	public String searchId(String id) {
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null && m[i].getId().equals(id)) {
				return m[i].getId()+" "+m[i].getName()+" "+m[i].getPassword()+" "
						+m[i].getEmail()+" "+m[i].getGender()+" "
						+m[i].getAge();
			}
		}
		return "못찾음";
	}
	
	
	public Member[] searchName(String name) {
		Member[] m1 = new Member[SIZE];
		int cnt = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null && m[i].getName().equals(name)) {
				m1[cnt] = new Member(); // 각 객체마다 생성해줘야함
				m1[cnt].setId(m[i].getId());
				m1[cnt].setName(m[i].getName());
				m1[cnt].setPassword(m[i].getPassword());
				m1[cnt].setEmail(m[i].getEmail());
				m1[cnt].setGender(m[i].getGender());
				m1[cnt].setAge(m[i].getAge());
				cnt++;
			}
		}
		return m1; // 배열객체 자체를 반환
	}
	
	
	public Member[] searchEmail(String email) {
		Member[] m2 = new Member[SIZE];
		int cnt = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null && m[i].getEmail().equals(email)) {
				m2[0] = new Member(); // 각 객체마다 생성해줘야함
				m2[0].setId(m[i].getId());
				m2[0].setName(m[i].getName());
				m2[0].setPassword(m[i].getPassword());
				m2[0].setEmail(m[i].getEmail());
				m2[0].setGender(m[i].getGender());
				m2[0].setAge(m[i].getAge());
			}
		}

		return m2;
	}
	
	
	
	public boolean updatePassword(String id, String password) {
		
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean updateName(String id, String name) {
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	

	
	public boolean updateEmail(String id, String email) {
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean delete(String id) { // id 검색해서 해당 정보 삭제
		for(int i=0; i<m.length; i++) {
			// m[i]!=null 조건을 넣어줘야 없는 아이디입력했을때 널포인터오류가 안뜸
			if(m[i]!=null && m[i].getId().equals(id)) { 
				m[i] = null; 
				return true;
			}
		}
		return false;
	}
	
	
	
	public void delete() {  // 전체 회원을 삭제
		for(int i=0; i<m.length; i++) {
			m[i] = null;
		}
	}
	
	
	public Member[] printAll() {
		return m;
	}
	
	
	
}
