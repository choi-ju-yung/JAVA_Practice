package com.test.controller.DataController;

import java.util.ArrayList;

import com.test.model.vo.Person.Person;

public class DataController {

	public static ArrayList persons = new ArrayList();
	
	
	public void arrayAdd(String name, int age, char gender, String phone) {

		System.out.println("===이름,나이,성별,전화번호 입력받아 사람 추가===");
		persons.add(new Person(name, age, gender, phone));
		
		for(Object o : persons) {
			Person p = (Person)o;
			System.out.println(p.getName()+" "+p.getAge()+" "
					+p.getGender()+" "+p.getPhone());
		}
	}
	
	
	
	public void arrayIndex(int index, Person pp) {
		System.out.println("===원하는 인덱스와 사람객체 받아서 사람 추가===");
		persons.add(index,pp);
		
		for(Object o : persons) {
			Person p = (Person)o;
			
			System.out.println(p.getName()+" "+p.getAge()+" "
					+p.getGender()+" "+p.getPhone());
		}
	}
	
	
	
	public void arrayRemove(Person pp) {
		System.out.println("===원하는 사람객체 받아서 사람 삭제===");
		for(int i=0; i<persons.size(); i++) {
			Person p = ((Person)persons.get(i));
			if(p.getName().equals(pp.getName())
					&& p.getAge() == pp.getAge()
					&& p.getGender() == pp.getGender()) {
				persons.remove(p);
			}
		}
		
		for(Object o : persons) {
			Person p = (Person)o;
			
			System.out.println(p.getName()+" "+p.getAge()+" "
					+p.getGender()+" "+p.getPhone());
		}	
	}
	
	
	public void ageDsc() {
		System.out.println("==나이순으로 내림차순==");
		persons.sort((o,o2)-> ((Person)o2).getAge() - ((Person)o).getAge());
		
		for(Object o : persons) {
			Person p = (Person)o;
			
			System.out.println(p.getName()+" "+p.getAge()+" "
					+p.getGender()+" "+p.getPhone());
		}
	}
	
	
	
	
	public void arrayPrint() {
		System.out.println("==전체 출력하기==");
		for(Object o : persons) {
			Person p = (Person)o;

			System.out.println(p.getName()+" "+p.getAge()+" "
					+p.getGender()+" "+p.getPhone());
		}
		
	}


	
	public void sameName(String name) {
		System.out.println("==이름입력받아 부분검색까지 실행==");
		for(int i=0; i<persons.size(); i++) {
			Person p = ((Person)persons.get(i));
			if(p.getName().contains(name)) {
				System.out.println(p.getName());
			}
		}
	}
	
	
	
	
	
}
