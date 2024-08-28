package com.packt.cardatabase.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
//	long count(); // 엔티티 수 반환
//
//	Iterable<Car> findAll(); // 지정한 형식 항목 반
//
//	Optional<Car> findById(Long id); // 지정한 id 의 한개 항목 반환
//
//	void delete(Car car); // 엔티티 삭제
//
//	void deleteAll(); // 모든 엔티티 삭제
//
//	<S extends Car> save(S entity); // entity 저장
//
//	List<S> saveAll(Iterable<S> entities); // 여러 엔티티 저장
	
}
