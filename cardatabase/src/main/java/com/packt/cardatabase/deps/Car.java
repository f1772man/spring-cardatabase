package com.packt.cardatabase.deps;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	//Car 가 Owner 에 의존
//	private Owner owner;
	
	//Car 클래스의 생성자(constructor) - 생성자 주입 방식의 Dependency Injection
	public Car(Owner owner) {
		this.owner = owner;
	}
	
	//Car 클래스의 속성에 set 으로 시작하는 메소드를 이용해서 의존 객체를 주입하는 방식 - setter 방식
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	//스프링 부트에서의 의존성 주입
	@Autowired
	private Owner owner;	// 생성자 주입방식으로 Injection 됨
}
