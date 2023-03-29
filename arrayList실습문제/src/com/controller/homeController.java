package com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.Animal;
import com.model.vo.Person;

public class homeController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList people = new ArrayList();
		
//		for(int i=0; i<2; i++) {
//			System.out.print((i+1)+"번째 이름 입력 : ");
//			String name = sc.next();
//			System.out.print((i+1)+"번째 나이 입력 : ");
//			int age = sc.nextInt();
//			System.out.print((i+1)+"번째 성별 입력 : ");
//			char gender = sc.next().charAt(0);
//			System.out.print((i+1)+"번째 키 입력 : ");
//			double height = sc.nextDouble();
//			System.out.print((i+1)+"번째 몸무게 입력 : ");
//			double weight = sc.nextDouble();
//			
//			people.add(new Person(name,age,gender,height,weight));
//		}
		
		people.add(new Person("유병승",19,'남',180.5,65.5));
		people.add(new Person("홍길동",44,'여',155.5,45.5));
		people.add(new Person("고길동",20,'남',175.5,70.5));
		people.add(new Person("선덕여왕",35,'여',150.2,50.5));
		people.add(new Person("김두환",42,'남',188.2,95.5));
		
		
		Iterator it = people.iterator(); // 0번~마지막까지 모든 인덱스를 이터레이터 방식으로 뽑음
		while(it.hasNext()) {
			Person a = (Person)it.next();
			System.out.println(a);
//			System.out.println(it.next());
//			System.out.println(it.next());
		}
		System.out.println("여기까지");
		
		
		// people.get(i) 출력시 -> Person 클래스의 toString 함수가 출력됨
		// Person 클래스의 toString 오버라이딩 함수가 없으면 Object의 toString이 호출되서 주소값 출력
		for(int i=0; i<people.size(); i++) {   // 전체 리스트 출력방법 (1) for문으로
			Person p = (Person)people.get(i);  
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
					p.getHeight()+" "+p.getWeight());
		}
		
		
		for(Object o : people) {   	// 전체 리스트 출력방법 (2) for-each문 
			Person p = (Person)o;   // Person 안의 set,get함수 사용하기 위해서
			 // Object 타입을 Person 타입으로 형변환 시켜준다.
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
						p.getHeight()+" "+p.getWeight());
		}
		
		
		
		System.out.println("키가 180이상인 사람의 나이를 1씩 증가 시킨 후 모든 데이터 출력");
		for(Object o : people) {
			Person p = (Person)o;
			if(p.getHeight() >= 180) {
				p.setAge(p.getAge()+1);
			}
		}
		
		for(Object o : people) {
			Person p = (Person)o;
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
					p.getHeight()+" "+p.getWeight());
		}
		
		
	
		System.out.println("나이가 40세 이상인 사람만 출력");
		for(Object o : people) {
			Person p = (Person)o;
			
			if(p.getAge() >=40) {
				System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
						p.getHeight()+" "+p.getWeight());
			}
		}
		
		
		
		System.out.println("사원을 이름(내림차순)순으로 정렬");
		people.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Person prev = (Person)o1;
				Person next = (Person)o2;
				return next.getName().compareTo(prev.getName());
			}
		});
		
		for(Object o : people) {
			Person p = (Person)o;
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
					p.getHeight()+" "+p.getWeight());
		}
		
		
		
		System.out.println("사원을 키(오름차순)순으로 정렬");
		people.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Person prev = (Person)o1;
				Person next = (Person)o2;
				return (int)(prev.getHeight() - next.getHeight());
			}
		});
		
		
		for(Object o : people) {
			Person p = (Person)o;
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
					p.getHeight()+" "+p.getWeight());
		}
		
		
		System.out.println("2번 인덱스 추가 + 3번 인덱스 값 변경 후 출력결과");
		//people.add(2, new Person("최주영",26,'남',177.3,70.5));
		people.set(3, new Person("이동제",25,'남',175.3,68.3));
		for(Object o : people) {
			Person p = (Person)o;
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
					p.getHeight()+" "+p.getWeight());
		}
		
		
		
		System.out.println("===고길동 모든 정보들이 리스트에 있는지 확인하고 없으면 추가===");
		if(people.contains(new Person("고길동",20,'남',175.5,70.5))) {
			System.out.println("이미 존재하는 사람입니다.");
		}else {
			people.add(new Person("고길동",20,'남',175.5,70.5));
		}
		
		for(Object o : people) {
			Person p = (Person)o;
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
					p.getHeight()+" "+p.getWeight());
		}
		
		people.remove(new Person("주몽",58,'남',189.4,90.3));
		System.out.println("===이름이 선덕여왕인 사람의 위치를 찾아서 그 위치에 주몽,58,남,189.4,90.3을 추가===");
		int index = people.indexOf(new Person("선덕여왕",35,'여',150.2,50.5));
		people.add(index,new Person("주몽",58,'남',189.4,90.3));
		for(Object o : people) {
			Person p = (Person)o;
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+
					p.getHeight()+" "+p.getWeight());
		}
		
		
		System.out.println("==4번 인덱스의 사람 삭제하기==");
		people.remove(4);
		people.forEach((o)-> System.out.println(o));  
		// 위와 방식으로 출력해도 되지만 people의 toString() 오버라이딩 부분을 수정해서 바꿔주면 된다.

		
		System.out.println("==김두환, 42, 남, 188.2, 95.5 사람 삭제==");
		people.remove(people.indexOf(new Person("김두환",43,'남',188.2,95.5)));
		people.forEach((o)-> System.out.println(o));
		
		
		System.out.println("리스트에 값이 있는지 없는지 확인하고 값이 있으면 사람있어요~~ 출력 없으면 사람없어요~~ 출력");
		
		if(people.isEmpty()) {
			System.out.println("사람 없어요~");
		}else {
			System.out.println("사람 있어요~");
		}
		
//		Object[] objArr = people.toArray(); // ArrayList가 배열로 변환됨
//		boolean flag = false;
//		for(int i=0; i<objArr.length; i++){
//			if(objArr[i] != null) {
//				flag = true;
//			}
//		}
//		
//		String msg = (flag == true) ? "사람있어요" : "사람없어요";
//		System.out.println(msg);
		

		
		System.out.println("==리스트에 있는 모든 데이터 삭제하기==");
		people.clear();
		people.forEach((o)->System.out.println(o));
		
	}
}
