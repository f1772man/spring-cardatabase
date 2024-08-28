package com.packt.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;

@SpringBootApplication
public class CardatabaseApplication  implements CommandLineRunner {
	@Autowired
	private CarRepository repository;	// D/I
	
	//	cardatabaseApplication 클래스가 Logger 클래스의 info()함수를 사용(의존 dependency)하기 위해 선언(injection)
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Application started");
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000);
		Car car2 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000);
		Car car3 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000);
		
		// List 로 만들어서 리스트의 객체 하나씩 3개를 저장
		// repository.saveAll(Arrays.asList(car1, car2, car3));
		// 하나씩 저장 - Create
		
		repository.save(car1);
		repository.save(car2);
		repository.save(car3);
		
		System.out.println(repository.findAll().toString());		
	}

}