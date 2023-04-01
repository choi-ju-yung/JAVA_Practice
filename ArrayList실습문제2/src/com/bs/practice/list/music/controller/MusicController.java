package com.bs.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.bs.practice.list.music.compare.DescSinger;
import com.bs.practice.list.music.compare.SameTitleAscTitle;
import com.bs.practice.list.music.model.vo.Music;

public class MusicController {
	List list = new ArrayList();
	
	
	public int addList(Music music) {
		  list.add(music);
		  return 1;
	}
	
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List printAll() {
		return list;
	}
	
	
	public Music searchMusic(String title) {
		Music m = null;  // Music 클래스의 객체 m 초기값 null로 하나 생성
		Music no = null;  // 찾을 곡이없을경우 null로 리턴하기 위해서 고정값 생성
		for(int i=0; i<list.size(); i++) {
			m = (Music)list.get(i);
			
			if(m.getTitle().equals(title)) {
				return m;
			}
		}
		return no;
	}
	
	
	
	public Music removeMusic(String title) {
		Music m = null;  // Music 클래스의 객체 m 초기값 null로 하나 생성
		Music no = null;  // 찾을 곡이없을경우 null로 리턴하기 위해서 고정값 생성
		for(int i=0; i<list.size(); i++) {
			m = (Music)list.get(i);
			
			if(m.getTitle().equals(title)) {
				list.remove(i);
				return m;
			}
		}
		return no;
	}
	
	
	
	public void setMusic(String title, Music music) {

		for(int i=0; i<list.size(); i++) {
			Music m = (Music)list.get(i);
			
			if(m.getTitle().equals(title)) {
				list.set(i,music);	
			}
		}
	}

	
	public void ascTitle() {
		list.sort(new SameTitleAscTitle());  // 곡명오름차순 같을시 이름 오름차순
	}
	
	
	public void descSinger() {
		list.sort(new DescSinger());  // 이름순으로 내림차순
	}
		
	
}
