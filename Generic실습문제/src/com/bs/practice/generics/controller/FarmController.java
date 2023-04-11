package com.bs.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.bs.practice.generics.model.vo.Farm;

public class FarmController {
	Scanner sc = new Scanner(System.in);
	private HashMap<Farm,Integer> hMap = new HashMap<>();
	private HashMap<Farm,Integer> uMap = new HashMap<>();
	
	
	public boolean addNewKind(Farm f, int amount) {
			if(hMap.containsKey(f)) {
				return false;
			}else {
				hMap.put(f, amount);
				return true;
			}
	}
	
	
	public boolean removeKind(Farm f) {
		if(hMap.containsKey(f)) { // 키가 Farm 클래스 객체임
			hMap.remove(f);
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			
			hMap.put(f, amount); // Map 자료형의 키값은 중복값이 없기 때문에
			return true;  // 동일한 키값을 추가한다해도 value 값만 바뀜 
		}else {
			return false;
		}
	}
	
	
	public HashMap<Farm, Integer>printFarm(){
		return hMap;
	}
	
	
	public void buyFarm(Farm f){
		if(hMap.containsKey(f)) {
			System.out.print("몇개 구매하시겠습니까 ? : ");
			int count = sc.nextInt();
			
			if(hMap.get(f)-count < 0) {
				System.out.println("수량이 부족합니다.");
			}else{
				System.out.println(count+"개 구매 성공하였습니다.");
				hMap.put(f, hMap.get(f)-count);
				
				if(uMap.get(f) == null) {
					uMap.put(f, 0);
				}
					
				uMap.put(f, uMap.get(f)+count);
			}
		}else {
			System.out.println("마트에 없는 물건입니다!");
		}
	}
	
	
	
	public void removeFarm(Farm f){
		if(uMap.containsKey(f)) {
			System.out.print("몇개 취소하시겠습니까? : ");
			int count = sc.nextInt();
			
			if(uMap.get(f)-count < 0) {
				System.out.println("수량이 부족합니다.");
			}else{
				System.out.println(count+"개 취소 성공하였습니다.");
				uMap.put(f, uMap.get(f)-count);
				hMap.put(f, hMap.get(f)+count);
			}
		}else {
			System.out.println("구매매 목록에 존재하지 않습니다.");
		}
	}
	
	
	
	public HashMap<Farm,Integer> printBuyFarm(){
		return uMap;
	}
	
	
}
