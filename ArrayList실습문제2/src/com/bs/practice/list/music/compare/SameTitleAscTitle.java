package com.bs.practice.list.music.compare;

import java.util.Comparator;

import com.bs.practice.list.music.model.vo.Music;

public class SameTitleAscTitle implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		
		Music prev = (Music)o1; 
		Music next = (Music)o2;
		
		if(prev.getTitle().compareTo(next.getTitle())==0) { // 타입이 같을 때
			return prev.getSinger().compareTo(next.getSinger());
		}
		return prev.getTitle().compareTo(next.getTitle()); 
	}
}
