package com.bs.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;


import com.bs.practice.set.model.vo.Lottery;

public class LotteryController {
	HashSet lottery = new HashSet();
	HashSet win = new HashSet();
	
	
	public boolean insertObject(Lottery l) {
		for(Object o : lottery) {
			Lottery lt = (Lottery)o;
			
			if(lottery.contains(l)) {
				return false;
			}
		}
		lottery.add(l);
		return true;
	}
	
	
	public boolean deleteObject(Lottery l) {
		for(int i=0; i<lottery.size(); i++) {
			if(lottery.contains(l)) {
				lottery.remove(l);
				if(win != null) {
					win.remove(l);
				}
				return true;
			}
		}
		return false;
	}
	
	
	public HashSet winObject() {

		ArrayList randList = new ArrayList(lottery);
		if(lottery.size() >=4 && win.isEmpty()) { // 이미 당첨자 설정해놨으면 수정불가능
			while(win.size()<4) {  // 당첨 4개 뽑기
				win.add(randList.get((int)(Math.random()*randList.size())));
			}
			
		}
		
		if(lottery.size() < 4){
			System.out.println("추첨자 수를 4명이상으로 추가하세요");
		}
	
		
		
		while(win.size()<4 && randList.size() >= 4) {  // 삭제됬을경우 새로뽑기
			win.add(randList.get((int)(Math.random()*randList.size())));
		}
				
		return win;
		
	}
	
	
	public TreeSet sortedWinObject() {
		TreeSet LotteryTree = new TreeSet();
		ArrayList al = new ArrayList(win);
		
		for(int i=0; i<al.size(); i++) {
			Lottery lt = (Lottery)al.get(i);
			LotteryTree.add(lt);
		}
		
		
		
		return LotteryTree;
	}
	
	
	public boolean searchWinner(Lottery l) {
		for(Object o : win) {
			if(win.contains(l)) {
				return true;
			}
		}
		return false;
	}
	
}
