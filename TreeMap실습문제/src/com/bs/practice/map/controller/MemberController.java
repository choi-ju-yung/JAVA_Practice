package com.bs.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.bs.practice.map.model.vo.Member;

public class MemberController {
	private Map map = new HashMap();
	
	public boolean joinMembership(String id, Member m){
		
			if(map.containsKey(id)) {
				return false;
			}else {
				map.put(id, m);
				return true;
			}
			// 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환
		// 있다면 false 값 반환
	}
	
	
	
	public String logIn(String id, String password){
		if(map.containsKey(id)) { // 입력받은 아이디가 존재할 경우
			// 그 아이디 멤버의 비밀번호와  내가 입력한 비밀번호가 일치하면 그 아이디의 이름 반환
			if(((Member)map.get(id)).getPassword().equals(password)) {
				return ((Member)map.get(id)).getName();
			}
		}
		// 입력받은 아이디가 없을 경우 null 리턴
		return null;
	}

	
	public boolean changePassword(String id, String oldPw, String newPw){
		if(map.containsKey(id) && // 입력한 아이디가 존재하며
				// 그 아이디의 비밀번호와 내가 입력한 비밀번호가 일치하면 
				((Member)map.get(id)).getPassword().equals(oldPw)){
					// 그 아이디의 비밀번호를 새로운 비밀번호로 바꾸고 true로 리턴
					((Member)map.get(id)).setPassword(newPw);
					return true;
				}
				// 아이디가 없거나, 비밀번호가 맞지 않으면 false 리턴
				return false;
	}
	
	
	public boolean changeName(String id, String newName) {
		
		if(map.containsKey(id)) { // 아이디가 존재하면 그 아이디의 이름 바꾸고 true로 리턴
			((Member)map.get(id)).setName(newName);
			return true;
		}
		return false;  // 혹시 만약에 어떤 상황으로인해 아이디가 없을 경우
	}

	
	public TreeMap sameName(String name){
		TreeMap tm = new TreeMap(); 
		Set mkeys = map.keySet();  // 맵타입인 map을 Set타입으로 key값들로만 만듬 
		Iterator it = mkeys.iterator(); // Set타입값들을 iterator로 하나씩 분리하려고함
		while(it.hasNext()) {
			String idKey = (String)it.next();  // Iterator 타입을 String으로 바꿈
			
			// idKey는 결국 map에 있는 키를 통해서 값을 비교하려고 만든거임
			// 값이 결국 입력한 이름이랑 일치하면 새로운 map 에다가 내용 추가
			if(((Member)map.get(idKey)).getName().equals(name)) {
				tm.put(idKey, new Member(((Member)map.get(idKey)).getName()
						,((Member)map.get(idKey)).getPassword()));
			}
		}
		
		return tm;
	}
	
	
}

