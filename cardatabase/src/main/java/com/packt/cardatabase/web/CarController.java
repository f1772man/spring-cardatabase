package com.packt.cardatabase.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.cardatabase.CardatabaseApplication;
import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;

@RestController		// 컴포넌트 @Componet, @Controller, @Service, @Repository
public class CarController {			// 일반클레스 POJO = Plain Old Java Object
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);	
	
	@Autowired
	private CarRepository repository;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars() {		// 함수 - public 리턴타입 함수명() {return 리턴타입객체;}
		for (Car car : repository.findAll()) {
			logger.info(car.getBrand() + "콘트롤러 " + car.getModel());
		}
		
		return repository.findAll();
		
	}
}