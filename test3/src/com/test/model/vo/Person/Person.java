package com.test.model.vo.Person;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, char gender, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}
	
	
}
