package com.packt.cardatabase;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	@Autowired
	private CarRepository repository; // D/I
	@Autowired
	private OwnerRepository orepository;

	// cardatabaseApplication 클래스가 Logger 클래스의 info()함수를 사용(의존 dependency)하기 위해
	// 선언(injection)
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Application started");
	}

	@Override
	public void run(String... args) throws Exception {
		// 소유자 객체를 추가하고 데이터베이스에 저장
		Owner owner1 = new Owner("John", "Johnson");
		Owner owner2 = new Owner("Mary", "Robison");
		orepository.saveAll(Arrays.asList(owner1, owner2));
		Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000, owner1);
		Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000, owner2);
		Car car3 = new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000, owner2);

		// List 로 만들어서 리스트의 객체 하나씩 3개를 저장
		// repository.saveAll(Arrays.asList(car1, car2, car3));
		// 하나씩 저장 - Create

		repository.save(car1);
		repository.save(car2);
		repository.save(car3);
		
		for (Car car : repository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}

		System.out.println(repository.findAll().toString());
	}

}